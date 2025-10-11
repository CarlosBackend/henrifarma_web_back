package com.pi.henrifarma.infrastructure.controllers;

import com.pi.henrifarma.infrastructure.models.ClienteModel;
import com.pi.henrifarma.infrastructure.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/adicionar")
    public ResponseEntity<String> adicionar(@RequestBody ClienteModel clienteModel){
        try{
            clienteService.salvarCliente(clienteModel);
             return ResponseEntity.ok("Cliente adicionado com sucesso");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Erro ao adicionar cliente");
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<ClienteModel>> listarClientes(){
        return ResponseEntity.ok(clienteService.listarClientes());
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<String> atualizar(@PathVariable Long id, @RequestBody ClienteModel clienteModel){
        try{
            clienteService.atualizar(id,clienteModel);
            return ResponseEntity.ok("Cliente atualizado com sucesso");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Erro ao atualizar cliente");
        }
    }
}

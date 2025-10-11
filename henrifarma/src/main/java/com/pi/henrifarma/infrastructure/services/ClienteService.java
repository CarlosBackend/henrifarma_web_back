package com.pi.henrifarma.infrastructure.services;

import com.pi.henrifarma.infrastructure.models.ClienteModel;
import com.pi.henrifarma.infrastructure.repositorys.ClienteRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public void salvarCliente(ClienteModel clienteModel){
        clienteRepository.save(clienteModel);
    }

    public List<ClienteModel> listarClientes(){
        return clienteRepository.findAll();
    }

    public ClienteModel atualizar ( Long id,ClienteModel clienteModel){
       Optional<ClienteModel> clienteExiste = clienteRepository.findById(id);
       if(clienteExiste.isPresent()){
           ClienteModel cliente = clienteExiste.get();
           cliente.setNome(clienteModel.getNome());
           cliente.setCpf(clienteModel.getCpf());
           cliente.setEndereco(clienteModel.getEndereco());
           cliente.setTelefone(clienteModel.getTelefone());
           return clienteRepository.save(cliente);
       }
       throw new RuntimeException("Cliente não encontrado");
    }
}

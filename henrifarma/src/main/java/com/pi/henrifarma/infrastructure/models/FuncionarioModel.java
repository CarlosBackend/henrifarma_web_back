package com.pi.henrifarma.infrastructure.models;

import com.pi.henrifarma.infrastructure.models.enums.Cargo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "funcionario")
public class FuncionarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;

    @Enumerated(EnumType.STRING)  // Salva o nome do enum como string no banco de dados
   private Cargo cargo;
}

package com.pi.henrifarma.infrastructure.services;

import com.pi.henrifarma.infrastructure.repositorys.FuncionarioRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
}

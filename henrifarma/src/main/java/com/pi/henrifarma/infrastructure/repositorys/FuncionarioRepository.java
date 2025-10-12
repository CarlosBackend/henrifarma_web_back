package com.pi.henrifarma.infrastructure.repositorys;

import com.pi.henrifarma.infrastructure.models.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository <FuncionarioModel,Long>{
}

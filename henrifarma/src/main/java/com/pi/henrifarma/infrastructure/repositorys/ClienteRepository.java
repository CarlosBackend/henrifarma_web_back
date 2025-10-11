package com.pi.henrifarma.infrastructure.repositorys;

import com.pi.henrifarma.infrastructure.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel,Long> {
}

package com.pi.henrifarma.infrastructure.repositorys;

import com.pi.henrifarma.infrastructure.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <ProdutoModel,Long>{
}

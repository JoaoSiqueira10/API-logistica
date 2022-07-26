package com.logistica.logic.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logistica.logic.domain.model.Entrega;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega,Long>{
	
}

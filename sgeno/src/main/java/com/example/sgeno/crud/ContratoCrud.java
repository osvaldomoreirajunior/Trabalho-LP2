package com.example.sgeno.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sgenoDB.ContratoDB;

public interface ContratoCrud extends JpaRepository<ContratoDB, Long>{
	

}
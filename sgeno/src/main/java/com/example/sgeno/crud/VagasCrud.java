package com.example.sgeno.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sgenoDB.VagasDB;

public interface VagasCrud extends JpaRepository<VagasDB, Long>{
	

}
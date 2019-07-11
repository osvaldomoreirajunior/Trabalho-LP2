package com.example.sgeno.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sgenoDB.EmpresaDB;

public interface EmpresaCrud extends JpaRepository<EmpresaDB, Long>{
	

}
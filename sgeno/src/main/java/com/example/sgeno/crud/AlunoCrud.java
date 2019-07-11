package com.example.sgeno.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sgenoDB.AlunoDB;

public interface AlunoCrud extends JpaRepository<AlunoDB, Long>{
	

}

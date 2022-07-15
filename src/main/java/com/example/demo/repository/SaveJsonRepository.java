package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.InputSaveJson;


@Repository
public interface SaveJsonRepository extends JpaRepository<InputSaveJson, Long> {
	
	List<InputSaveJson> findByStatus(String status);
	
}

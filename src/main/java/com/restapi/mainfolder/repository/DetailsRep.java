package com.restapi.mainfolder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.mainfolder.model.Details;

public interface DetailsRep extends JpaRepository<Details, Long>{
	

}

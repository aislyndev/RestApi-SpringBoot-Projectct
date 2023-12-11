package com.projerestapi.projerestapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.projerestapi.projerestapi.model.Country;

public interface CountryRepository extends MongoRepository<Country,String>{

	List<Country> findAllByName(String name);
	Optional <Country> findByName(String name);

}

package com.demo.mongoDB;


import org.springframework.data.repository.CrudRepository;

public interface CarMongoRepository extends CrudRepository<Car, String> {}
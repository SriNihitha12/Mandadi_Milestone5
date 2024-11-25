package com.mandadiClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;
import com.mandadiClasses.DMS.Models.Dog;
 
public interface DogRepository extends CrudRepository<Dog, Integer>{
 
}
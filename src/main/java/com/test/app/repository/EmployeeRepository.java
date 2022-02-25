package com.test.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.test.app.model.EmployeeEntity;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer>
{

}

package com.test.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employee_details")
@Data
public class EmployeeEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	Integer id;
	String name;
	String department;
	Long mobileNumber;
	String emailId;
	String address;

}

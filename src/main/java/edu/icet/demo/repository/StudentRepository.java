package edu.icet.demo.repository;

import edu.icet.demo.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

//CrudRepository is coming from spring-boot-starter-data-jpa
//apply generics <StudentEntity class only ,primarykey data type>
public interface StudentRepository extends CrudRepository<StudentEntity,Integer> {

}

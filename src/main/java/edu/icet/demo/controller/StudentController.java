package edu.icet.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.entity.StudentEntity;
import edu.icet.demo.model.Student;
import edu.icet.demo.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Slf4j //print logs
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ObjectMapper mapper;

    @PostMapping("/student")
    public void saveStudent(@RequestBody Student student){
        log.info(student.toString()); //print log
        StudentEntity entity = mapper.convertValue(student,StudentEntity.class);
        //no need to map one by one like below
        /*
        StudentEntity entity = new StudentEntity();
        entity.setAge(student.getAge());
        entity.setFirstName(student.getFirstName());
        entity.setLastName(student.getLastName());
        */
        studentRepository.save(entity);
    }

    @GetMapping("/student")
    public Iterable<StudentEntity> saveStudent(){
        return studentRepository.findAll();
    }
}

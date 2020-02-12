package com.sl.controller;

import com.sl.entity.Student;
import com.sl.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author WangLi
 * @version 1.0.0
 * @creaTtime 2020-02-08 10:36
 **/
@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.updateOrSave(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.updateOrSave(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public Student deleteById(@PathVariable("id") long id) {
        return studentRepository.deleteById(id);
    }

}

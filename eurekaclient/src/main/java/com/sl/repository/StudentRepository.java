package com.sl.repository;

import com.sl.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> findAll();

    public Student findById(long id);

    public void updateOrSave(Student student);

    public Student deleteById(long id);
}

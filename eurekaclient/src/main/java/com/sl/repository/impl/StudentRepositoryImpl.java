package com.sl.repository.impl;

import com.sl.entity.Student;
import com.sl.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author WangLi
 * @version 1.0.0
 * @creaTtime 2020-02-08 10:29
 **/
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long,Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1l,new Student(1l,"张三",20));
        studentMap.put(2l,new Student(2l,"李四",21));
        studentMap.put(3l,new Student(3l,"王五",22));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void updateOrSave(Student student) {
        studentMap.put(student.getId(), student);
    }


    @Override
    public Student deleteById(long id) {
        return studentMap.remove(id);
    }
}

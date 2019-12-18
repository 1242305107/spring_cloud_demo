package com.tckj.provider.service;

import com.tckj.entity.Student;

import java.util.Collection;
import java.util.List;

/**
 * @author WCH
 * @date 2019/12/17 14:33
 */
public interface StudentService {

    Collection<Student> findAll();

    Student findById(Long id);

    void deleteById(Long id);

    void save(Student student);

}

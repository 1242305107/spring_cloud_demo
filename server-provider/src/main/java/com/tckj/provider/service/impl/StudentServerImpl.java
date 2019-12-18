package com.tckj.provider.service.impl;

;
import com.tckj.entity.Student;
import com.tckj.provider.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WCH
 * @date 2019/12/17 14:37
 */
@Service
public class StudentServerImpl implements StudentService {

    private static Map<Long, Student>  studentMap;

    static {
        studentMap=new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",20));
        studentMap.put(2L,new Student(2L,"李四",21));
        studentMap.put(3L,new Student(3L,"王五",22));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public void deleteById(Long id) {
        studentMap.remove(id);
    }

    @Override
    public void save(Student student) {
        studentMap.put(student.getId(),student);
    }
}

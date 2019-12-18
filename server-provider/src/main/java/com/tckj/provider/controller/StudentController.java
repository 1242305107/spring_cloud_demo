package com.tckj.provider.controller;

import com.tckj.entity.Student;
import com.tckj.provider.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author WCH
 * @date 2019/12/17 14:28
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/getPort")
    public String getPort() {
        return "当前端口为："+port;
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id) {
        return studentService.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        studentService.deleteById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentService.save(student);
    }


}

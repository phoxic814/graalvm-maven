package com.graalvm.controller;

import com.graalvm.db.dao.Student;
import com.graalvm.db.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentMapper studentMapper;

    @GetMapping("student/all")
    public Object getAllStudent() {
        return studentMapper.selectAll();
    }

    @PostMapping("student/save")
    public void saveStudent(@RequestBody Student student) {
        studentMapper.save(student);
    }
}

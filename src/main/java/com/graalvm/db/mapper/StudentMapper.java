package com.graalvm.db.mapper;

import com.graalvm.db.dao.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> selectAll();

    void save(Student student);
}

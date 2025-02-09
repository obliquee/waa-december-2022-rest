package com.example.demo.service;



import com.example.demo.entity.Course;
import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudentByMajor(String major);
    public List<Course> getCourseByStudentId(int studentId);
    public List<Student> getAllStudents();
}

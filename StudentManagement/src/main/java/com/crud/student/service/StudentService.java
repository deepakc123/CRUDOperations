package com.crud.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.student.entity.Student;

@Service
public interface StudentService {

	public Student addStudent(Student student);

	public List<Student> fetchStudents();

	public Student getStudent(int id);

	public Student updateStudent(Student student, int id);

	public void deleteStudent(int id);

}

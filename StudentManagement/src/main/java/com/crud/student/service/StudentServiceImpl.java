package com.crud.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.student.entity.Student;
import com.crud.student.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepo repo;

	
	public Student addStudent(Student student) {
		return repo.save(student);
	}


	public List<Student> fetchStudents() {
		return repo.findAll();
	}


	public Student getStudent(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public Student updateStudent(Student student, int id) {
		Student studentDetails = repo.findById(id).orElse(null);
		studentDetails.setId(id);
		studentDetails.setBranch(student.getBranch());
		studentDetails.setGrade(student.getGrade());
		studentDetails.setMail(student.getMail());
		studentDetails.setStudentname(student.getStudentname());
		repo.save(studentDetails);
		return studentDetails;
		
	}
	
	public void deleteStudent(int id) {
		repo.deleteById(id);
	}

}

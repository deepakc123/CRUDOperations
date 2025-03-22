package com.crud.student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.student.entity.Student;
import com.crud.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService service;

	//Saving a Student Detail
	@PostMapping("/save")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	//Fetching all Student's Details
	@GetMapping("/fetch")
	public List<Student> fetchStudents(){
		return service.fetchStudents();
	}
	
	//Fetch a Student using Id
	@GetMapping("/fetch/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.getStudent(id);
	}
	
	//Update a Student
	@PutMapping("/update/{id}")
	public Student updateStudent(@RequestBody Student student,@PathVariable int id) {
		return service.updateStudent(student,id);
	}
	
	//Delete a Student
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
		return new ResponseEntity<String>("Student Deleted Successfully", HttpStatus.OK);
	}
}

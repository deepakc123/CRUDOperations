package com.crud.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.student.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}

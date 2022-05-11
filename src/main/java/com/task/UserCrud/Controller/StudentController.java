package com.task.UserCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.UserCrud.Model.Student;
import com.task.UserCrud.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/student")
	public ResponseEntity<String> AddStudent(@RequestBody Student student) {
		studentService.addNewStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body("New Student Added");

	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents(){
		return ResponseEntity.status(HttpStatus.FOUND).body(studentService.getAllStudent());
	}
	
	@PutMapping("/student/{id}")
	public ResponseEntity<String> updateStudent(@PathVariable long id,@RequestBody Student student) {
		 studentService.updateStudents(id,student);
		return ResponseEntity.status(HttpStatus.OK).body("Student Updated");
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable long id) {
		studentService.deleteStudent(id);
		return ResponseEntity.status(HttpStatus.OK).body("Student Deleted");
	}
}

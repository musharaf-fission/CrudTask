package com.task.UserCrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.UserCrud.Model.Student;
import com.task.UserCrud.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	public Student addNewStudent(Student student) {
		return studentRepo.save(student);
	}

	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	public Student updateStudents(long id, Student student) {
		Student oldStudent = studentRepo.findById(id).orElse(null);
		if(student.getName() != null)
		   oldStudent.setName(student.getName());
		if(student.getRollNo() != 0l)
			oldStudent.setRollNo(student.getRollNo());
		if(student.getAddress() !=null)
			oldStudent.setAddress(student.getAddress());
		if(student.getGender() !=null)
			oldStudent.setGender(student.getGender());
		if(student.getPhoneNumber() != 0l)
			oldStudent.setPhoneNumber(student.getPhoneNumber());
		if(student.getAge() != 0)
			oldStudent.setAge(student.getAge());
		
		return studentRepo.save(oldStudent);
	}

	
	public void deleteStudent(long id) {
		studentRepo.deleteById(id);
	}
}

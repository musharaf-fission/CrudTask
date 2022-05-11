package com.task.UserCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.UserCrud.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

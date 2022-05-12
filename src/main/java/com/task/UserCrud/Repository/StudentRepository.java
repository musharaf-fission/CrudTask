package com.task.UserCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.task.UserCrud.Model.Student;

@RepositoryRestResource(path = "boy")
public interface StudentRepository extends JpaRepository<Student, Long> {

}

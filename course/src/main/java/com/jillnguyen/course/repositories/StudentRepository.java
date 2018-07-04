package com.jillnguyen.course.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jillnguyen.course.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findByEmail(String email);
}

package com.jillnguyen.course.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.jillnguyen.course.models.Student;
import com.jillnguyen.course.repositories.StudentRepository;


@Service
public class StudentService {
	private final StudentRepository studentRepository;
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
//	create a person
	public Student createStudent(Student s) {
		String hased = BCrypt.hashpw(s.getPassword(), BCrypt.gensalt());
		s.setPassword(hased);
		return studentRepository.save(s);
	}
	
//	findByEmail
	public Student findByEmail(String email) {
		return studentRepository.findByEmail(email);
	}
	
//	Find by id
	public Student findById(Long id) {
		Optional<Student> optionalStudent = studentRepository.findById(id);
    	if (optionalStudent.isPresent()) {
    		return optionalStudent.get();
    	} else {
    		return null;
    	}
	}
	
//	Authenticate a student
	public boolean authenticateStudent(String email, String password) {
		Student s = studentRepository.findByEmail(email);
		if(s==null) {
			return false;
		} else {
			if(BCrypt.checkpw(password, s.getPassword())) {
				return true;
			} else {
				return false;
			}
		}
	}
}
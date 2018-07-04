package com.jillnguyen.course.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jillnguyen.course.models.Application;
import com.jillnguyen.course.models.Course;
import com.jillnguyen.course.repositories.ApplicationRepository;
import com.jillnguyen.course.repositories.CourseRepository;
import com.jillnguyen.course.repositories.StudentRepository;



@Service
public class CourseService {
	private final CourseRepository courseRepository;
	private final ApplicationRepository applicationRepository;
	public CourseService(CourseRepository courseRepository, StudentRepository sR, ApplicationRepository applicationRepository) {
		this.courseRepository = courseRepository;
//		this.studentRepository = sR;
		this.applicationRepository = applicationRepository;
	}
	
//	retrieve all courses
	public List<Object[]> allCourse(){
		List<Object[]> courses = courseRepository.findAllCoursesAndSignup();
		return courses;
	}


//	retrieve students from one course
//	public List<Object[]> studentsInACourse(Long course_id) {
//		List<Object[]> courses = courseRepository.studentsInACourse(course_id);
//		for(Object[] row : courses) {
//		    Course course = (Course) row[0];
//		    Student student = (Student) row[1];
//		    System.out.println(course.getName());
//		    System.out.println(student.getName());
//		}
//		return courses;
//	}
	
	
//	create a course
	public Course createCourse(Course c) {
		return courseRepository.save(c);
	}
	
	public Application createApplication(Application application) {
		 return applicationRepository.save(application);
		
	}
	
//	retrieve one course
	public Course findCourse(Long id) {
		Optional<Course> course= courseRepository.findById(id);
		if(course.isPresent()) {
			return course.get();
		} else {
			return null;
		}
	}
	
//	update one course
	 public Course updateCourse(Long id, String name, String instructor, Long numberOfStudents) {
        Optional<Course> optionalCourse = courseRepository.findById(id);
        Course updatedCourse = optionalCourse.get();
        updatedCourse.setName(name);
        updatedCourse.setInstructor(instructor);
        updatedCourse.setNumberOfStudents(numberOfStudents);
        return courseRepository.save(updatedCourse);
    }
	 
	 public Course updateCourse(Course c) {
		 return courseRepository.save(c);
	 }
	 
//	 Delete a course
	 public void deleteCourse(Long id){
		 courseRepository.deleteById(id);
	 }

	
}

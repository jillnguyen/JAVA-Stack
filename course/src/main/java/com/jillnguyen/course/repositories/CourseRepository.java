package com.jillnguyen.course.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jillnguyen.course.models.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
	List<Course> findAll();
	Optional<Course> findById(Long id);
	long count();
	
    @Query(value="SELECT courses.id, courses.name, courses.instructor, courses.number_of_students, COUNT(applications.student_id) as sign_ups  FROM courses\n" + 
    		"LEFT JOIN applications ON courses.id = applications.course_id\n" + 
    		"LEFT JOIN students ON applications.student_id = students.id\n" + 
    		"GROUP BY courses.id" , nativeQuery=true)
    List<Object[]> findAllCoursesAndSignup();
	    
//    @Modifying
//    @Query("INSERT INTO applications (course_id, student_id) VALUES (?1,?2)", nativeQuery=true)
//    void applications(Long course_id, Long student_id);

    
//    @Modifying
//    @Query(value = "insert into applications (course_id, student_id) VALUES (:?course_id,:?student_id)", nativeQuery = true)
//    @Transactional
//    void applications(@Param("course_id") Long course_id, @Param("student_id") Long student_id);
    
//    @Modifying
//    @Query("insert into Person (id,name,age) select :id,:name,:age from Dual")
//    public int modifyingQueryInsertPerson(@Param("course_id")Long course_id, @Param("st")String name, @Param("age")Integer age);
    
//    @Query("SELECT c,s,COUNT(DISTINCT student_id) FROM Application a JOIN a.course_id c")
//    List<Object[]> joinCoursesAndApplications();
////    
//    @Query(value = "SELECT COUNT as SIGNUPS FROM applications a WHERE id = ?1", nativeQuery=true)
//    List<Object[]> signups();
}

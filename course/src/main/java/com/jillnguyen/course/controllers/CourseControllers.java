package com.jillnguyen.course.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jillnguyen.course.models.Application;
import com.jillnguyen.course.models.Course;
import com.jillnguyen.course.models.Student;
import com.jillnguyen.course.services.CourseService;
import com.jillnguyen.course.services.StudentService;

@Controller
public class CourseControllers {
	private final CourseService courseService;
	private final StudentService studentService;
	public CourseControllers(CourseService courseService, StudentService studentService) {
		this.courseService = courseService;
		this.studentService = studentService;
	}
	
//	Render /courses page
	@RequestMapping("/courses")
	public String allPage(Model model, HttpSession session) {
		List<Object[]> courses = courseService.allCourse();
		model.addAttribute("courses", courses);
		Long studentId = (Long) session.getAttribute("studentId");
		Student s = studentService.findById(studentId);
		model.addAttribute("student", s);
		model.addAttribute("application", new Application());
		return "all.jsp";
	}
	
//	Add student to a course
	@PostMapping("/createApplication")
    public String addedCourse(@Valid @ModelAttribute("application") Application application, BindingResult result) {
		if(result.hasErrors()) {
			return "all.jsp";
		} else {
			courseService.createApplication(application);
			return "redirect:/courses";
		}
    }
	
//	Render create course page
	@RequestMapping("/courses/new")
	public String newPage(Model model) {
		model.addAttribute("course", new Course());
		return "new.jsp";
	}
	
//	Create a new course
	@PostMapping("/createCourse")
	public String createCourse(@Valid @ModelAttribute("course") Course course, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		} else {
			courseService.createCourse(course);
			return "redirect:/courses";
		}
	}
	
//	Show a course page
	@RequestMapping("/courses/{id}")
	public String showCourse(Model model, @PathVariable("id") Long id) {
		Course course = courseService.findCourse(id);
		model.addAttribute("course", course);
		return "show.jsp";
	}
	
//	Show edit the course page
	@RequestMapping("/courses/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Course course = courseService.findCourse(id);
        model.addAttribute("course", course);
        return "edit.jsp";
    }
	
    @RequestMapping(value="/course/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("course") Course course, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            courseService.updateCourse(course);
            return "redirect:/courses";
        }
    }
    
//  Add more applications:
    
}

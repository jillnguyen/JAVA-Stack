package com.jillnguyen.course.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jillnguyen.course.models.Student;
import com.jillnguyen.course.services.StudentService;

@Controller
public class HomeControllers {
	private final StudentService studentService;
    public HomeControllers(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/")
    public String index(@ModelAttribute("student") Student student) {
    	return "index.jsp";
    }


    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerStudent(@Valid @ModelAttribute("student") Student student, BindingResult result, HttpSession session) {
    	if (result.hasErrors()) {
    		return "index.jsp";
    	} else {
    		studentService.createStudent(student);
    		session.setAttribute("studentId", Long.toString(student.getId()));
			return "redirect:/courses";
		}
    	}
 
  @RequestMapping(value="/login", method=RequestMethod.POST)
  public String loginStudent(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
      boolean isAuthenticated = studentService.authenticateStudent(email,password);
      if(isAuthenticated) {
    	  Student s = studentService.findByEmail(email);
    	  session.setAttribute("studentId", s.getId());
    	  return "redirect:/courses";
      } else {
    	  model.addAttribute("error", "Invalid credentials. Please try again");
    	  return "index.jsp";
      }
	 
  }

 
//    @RequestMapping("/logout")
//    public String logout(HttpSession session) {
//        // invalidate session
//        // redirect to login page
//    }


    
    
}
/**
 * 
 */
package com.viplav.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.viplav.dao.impl.PersonDAOImpl;
import com.viplav.form.PersonForm;
import com.viplav.form.UserForm;

/**
 * @author Rammohan
 *
 */
@Controller
public class LoginController extends WebMvcConfigurerAdapter{
	PersonDAOImpl daoImpl = null;
	public LoginController(){
		
	  ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		 daoImpl = (PersonDAOImpl) ctx.getBean("PersonDAOImpl", PersonDAOImpl.class);

	}
	  
	 @Override
	    public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/views/jsp").setViewName("views");
	    }
	
	// Return to the login form
	@RequestMapping(value="/login", method=RequestMethod.GET)
    public String showForm(Map<String, Object> model) {
	/*	UserForm userForm = new UserForm();
		model.put("userForm", userForm);*/
		
		PersonForm personForm = new PersonForm();
		model.put("personForm", personForm);
        return "register";
    }
	
	// validating
	@RequestMapping(value="/doLogin", method=RequestMethod.GET)
    public String checkPersonInfo(@Valid @ModelAttribute("userForm") UserForm userForm, BindingResult bindingResult,Model model) {

        if (bindingResult.hasErrors()) {
            return "login";
        }
        
        model.addAttribute("userName",userForm.getUserName());
        model.addAttribute("passWord",userForm.getPassWord());
       
        return "home";
        
	}
	
	// validating
		@RequestMapping(value="/doRegister", method=RequestMethod.GET)
	    public String registerPerson(@Valid @ModelAttribute("PersonForm") PersonForm personForm, BindingResult bindingResult,Model model) {

	        if (bindingResult.hasErrors()) {
	            return "register";
	        }
	        
	       /* model.addAttribute("userName",personForm.getFirstName());
	        model.addAttribute("passWord",personForm.getLastName());*/
	       /* PersonDAOImpl personDAO = new PersonDAOImpl();
	        personDAO.addPerson(personForm);*/
	        this.daoImpl.addPerson(personForm);
	        return "home";
	        
		}
}

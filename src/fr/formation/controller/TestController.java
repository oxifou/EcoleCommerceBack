package fr.formation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.formation.dao.IDAO;
import fr.formation.model.Test;

@Controller
@RequestMapping(value="/test")
public class TestController
{
	
	@Autowired
	@Qualifier("TestDAO")
	private IDAO<Test, Integer> testDAO;
	
	
	@RequestMapping("")
	public String getAll(Model model) {
		model.addAttribute("tests", this.testDAO.findAll());
		
		return "tests";
	}
	
	@RequestMapping(value={ "/edit", "/edit/{id}" }, method=RequestMethod.GET)
	public String edit(@PathVariable(value="id", required=false) Integer testId, Model model) {
		if (testId != null) {
			model.addAttribute("test", this.testDAO.find(testId));
		}
		
		return (testId != null) ? "editTest" : "addTest";
	}
	
	@RequestMapping(value={ "/edit", "/edit/{id}" }, method=RequestMethod.POST)
	public String edit(@PathVariable(value="id", required=false) String tetriminoId, @Valid @ModelAttribute("tetrimino") Test test, BindingResult result) {
		test = this.testDAO.save(test);
		return "redirect:/test/edit/" + test.getIdTest();
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer testId) {
		this.testDAO.delete(this.testDAO.find(testId));
		return "redirect:/test";
	}
}

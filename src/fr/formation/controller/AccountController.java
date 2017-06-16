package fr.formation.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.formation.dao.IPersonneDAO;
import fr.formation.exception.WrongUsernameOrPasswordException;
import fr.formation.model.Admin;
import fr.formation.model.noentity.Inscription;
import fr.formation.validator.PasswordCheckValidator;

@Controller
@RequestMapping("/account")
public class AccountController
{
	@Autowired
	private IPersonneDAO personneDAO;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute("user") Admin admin, BindingResult result, Model model, HttpSession session) {
		if ((!result.hasErrors()) || (result.getErrorCount() == 2)) {
			try {
				admin = (Admin) this.personneDAO.auth(admin.getUsername(),admin.getPassword());
				
				if (admin != null) {
					session.setAttribute("utilisateur", admin);
					session.setAttribute("username", admin.getUsername());
					return "redirect:/home";
				}
			}
			
			catch (WrongUsernameOrPasswordException ex) {
				result.rejectValue("password", ex.getCode(), ex.getMessage());
			}
		}
		
		return "login";
	}
	
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:login";
	}
	
	
	
	@RequestMapping(value="subscribe", method=RequestMethod.GET)
	public String subscribe() {
		return "subscribe";
	}
	
	
	@RequestMapping(value="/subscribe", method=RequestMethod.POST)
	public String subscribe(@Valid @ModelAttribute("inscription") Inscription inscriptionUtilisateur, BindingResult result, Model model, HttpSession session) {
		new PasswordCheckValidator().validate(inscriptionUtilisateur, result);
		
		if (!result.hasErrors()) {
			Admin myUtilisateur = null;
//			
//			switch (inscriptionUtilisateur.getType()) {
//				case 2: myUtilisateur = new Spectateur(); break;
//				default: myUtilisateur = new Joueur(); break;
//			}
			
			inscriptionUtilisateur.setProperties(myUtilisateur);
			this.personneDAO.save(myUtilisateur);
			
			return "redirect:/home";
		}
		
		return "subscribe";
	}
	
	
	
	@ModelAttribute("user")
	public Admin initUtilisateur() {
		return new Admin();
	}
	
	
	
	@ModelAttribute("inscription")
	public Inscription initInscriptionUtilisateur() {
		return new Inscription();
	}
}
package fr.formation.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import fr.formation.model.noentity.Inscription;

public class PasswordCheckValidator implements Validator
{
	@Override
	public boolean supports(Class<?> cls) {
		return Inscription.class.equals(cls);
	}
	
	
	@Override
	public void validate(Object obj, Errors e) {
		Inscription myInscriptionUtilisateur = (Inscription)obj;
		
		if (!myInscriptionUtilisateur.getPassword().equals(myInscriptionUtilisateur.getPasswordCheck())) {
			e.rejectValue("password", "pwdcheck");
		}
	}
}
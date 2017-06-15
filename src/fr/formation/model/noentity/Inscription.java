package fr.formation.model.noentity;

import fr.formation.model.Personne;


public class Inscription extends Personne
{
	private static final long serialVersionUID = 1L;
	
	
	private String passwordCheck;
	
	
	public String getPasswordCheck() {
		return passwordCheck;
	}
	
	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}
	
	
	public void setProperties(Personne utilisateur) {
		utilisateur.setNom(this.getNom());
		utilisateur.setPrenom(this.getPrenom());
	}
}

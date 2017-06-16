package fr.formation.model.noentity;

import fr.formation.model.Admin;


public class Inscription extends Admin
{
	private static final long serialVersionUID = 1L;
	
	
	private String passwordCheck;
	
	
	public String getPasswordCheck() {
		return passwordCheck;
	}
	
	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}
	
	
	public void setProperties(Admin utilisateur) {
		utilisateur.setNom(this.getNom());
		utilisateur.setPrenom(this.getPrenom());
		utilisateur.setMotDePasse(this.getMotDePasse());
		utilisateur.setUserName(this.getUserName());
	}
}

package fr.formation.dao;
import fr.formation.exception.WrongUsernameOrPasswordException;
import fr.formation.model.Admin;
import fr.formation.model.Personne;


public interface IPersonneDAO extends IDAO<Personne, String> {

	public Admin auth(String username, String password) throws WrongUsernameOrPasswordException;

}


//package fr.ascadis.dao;
//
//import fr.ascadis.exception.WrongUsernameOrPasswordException;
//import fr.ascadis.model.Utilisateur;
//
//
//public interface IUtilisateurDAO extends IDAO<Utilisateur, Integer>
//{
//	public Utilisateur auth(String username, String password) throws WrongUsernameOrPasswordException;
//}
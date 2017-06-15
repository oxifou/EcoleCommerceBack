package fr.formation.model;

import java.util.List;

public class Matiere
{
	private Integer idMatiere;
	private String nom;
	
	private List<Questionnaire> questionnaires;

	public Matiere()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idMatiere
	 */
	public Integer getIdMatiere()
	{
		return idMatiere;
	}

	/**
	 * @param idMatiere the idMatiere to set
	 */
	public void setIdMatiere(Integer idMatiere)
	{
		this.idMatiere = idMatiere;
	}

	/**
	 * @return the nom
	 */
	public String getNom()
	{
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom)
	{
		this.nom = nom;
	}

	/**
	 * @return the questionnaires
	 */
	public List<Questionnaire> getQuestionnaires()
	{
		return questionnaires;
	}

	/**
	 * @param questionnaires the questionnaires to set
	 */
	public void setQuestionnaires(List<Questionnaire> questionnaires)
	{
		this.questionnaires = questionnaires;
	}

}

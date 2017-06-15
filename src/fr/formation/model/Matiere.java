package fr.formation.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="matiere")
public class Matiere implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MAT_ID")
	private Integer idMatiere;
	
	@Column(name="MAT_NAME")
	private String nom;
	
	@OneToMany
	@JoinColumn(name="MAT_QUESTIONNAIRE_ID")
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

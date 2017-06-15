package fr.formation.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="QUESTION_ID")
	private Integer idQuestion;
	
	@Column(name="QUESTION_INTI")
	private String intitule;
	
	@Column(name="QUESTION_NUM")
	private Integer numero;

	@OneToOne
	private Questionnaire questionnaire;
	
	@OneToMany(mappedBy="question")
	private List<Proposition> propositions;

	public Question()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idQuestion
	 */
	public Integer getIdQuestion()
	{
		return idQuestion;
	}

	/**
	 * @param idQuestion
	 *            the idQuestion to set
	 */
	public void setIdQuestion(Integer idQuestion)
	{
		this.idQuestion = idQuestion;
	}

	/**
	 * @return the intitule
	 */
	public String getIntitule()
	{
		return intitule;
	}

	/**
	 * @param intitule
	 *            the intitule to set
	 */
	public void setIntitule(String intitule)
	{
		this.intitule = intitule;
	}

	/**
	 * @return the numero
	 */
	public Integer getNumero()
	{
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(Integer numero)
	{
		this.numero = numero;
	}

	/**
	 * @return the questionnaire
	 */
	public Questionnaire getQuestionnaire()
	{
		return questionnaire;
	}

	/**
	 * @param questionnaire
	 *            the questionnaire to set
	 */
	public void setQuestionnaire(Questionnaire questionnaire)
	{
		this.questionnaire = questionnaire;
	}

	/**
	 * @return the propositions
	 */
	public List<Proposition> getPropositions()
	{
		return propositions;
	}

	/**
	 * @param propositions
	 *            the propositions to set
	 */
	public void setPropositions(List<Proposition> propositions)
	{
		this.propositions = propositions;
	}

}

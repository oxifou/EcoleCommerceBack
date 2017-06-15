package fr.formation.model;

import java.util.List;

public class Question
{

	private Integer idQuestion;
	private String intitule;
	private Integer numero;

	private Questionnaire questionnaire;
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

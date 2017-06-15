package fr.formation.model;

public class Proposition
{
	
	private Integer idProposition;
	private boolean isCorrect;
	private char numero;
	
	private Question question;
	
	public Proposition()
	{
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @return the idProposition
	 */
	public Integer getIdProposition()
	{
		return idProposition;
	}

	/**
	 * @param idProposition the idProposition to set
	 */
	public void setIdProposition(Integer idProposition)
	{
		this.idProposition = idProposition;
	}

	/**
	 * @return the isCorrect
	 */
	public boolean isCorrect()
	{
		return isCorrect;
	}

	/**
	 * @param isCorrect the isCorrect to set
	 */
	public void setCorrect(boolean isCorrect)
	{
		this.isCorrect = isCorrect;
	}

	/**
	 * @return the numero
	 */
	public char getNumero()
	{
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(char numero)
	{
		this.numero = numero;
	}

	/**
	 * @return the question
	 */
	public Question getQuestion()
	{
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(Question question)
	{
		this.question = question;
	}	
}

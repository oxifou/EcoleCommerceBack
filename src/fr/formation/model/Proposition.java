package fr.formation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="proposition")
public class Proposition implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PROP_ID")
	private Integer idProposition;
	
	@Column(name="PROP_ISCOR")
	private boolean isCorrect;
	
	@Column(name="PROP_NUM")
	private char numero;
	
	@OneToOne
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

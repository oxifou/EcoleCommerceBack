package fr.formation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reponse")
public class Reponse implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RESP_ID")
	private Integer idReponse;
	
	@Column(name="RESP_TEMPS")
	private Integer temps;
	
	@Column(name="RESP_RESPONSE")
	private String Reponse;
	
	@ManyToOne
	private Question question;
	
	@ManyToOne
	private Test test;

	public Reponse()
	{
		// TODO Auto-generated constructor stub
	}

}

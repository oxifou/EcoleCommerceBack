package fr.formation.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import fr.formation.classeEnum.Branche;
import fr.formation.classeEnum.Niveau;

@Entity
@Table(name="test")
public class Test implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer idTest;
	private Date date;	

	private Branche branche;
	private Niveau niveau;

	public Test()
	{
		// TODO Auto-generated constructor stub
	}

}

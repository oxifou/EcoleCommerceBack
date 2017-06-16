package fr.formation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "personne"/*
						 * , uniqueConstraints = { @UniqueConstraint(columnNames
						 * = "PERS_USERNAME") }
						 */)
// @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
// @DiscriminatorColumn(name="PERS_TYPE",
// discriminatorType=DiscriminatorType.INTEGER)

public class Personne implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "PERS_ID")
	private String id;

	@Column(name = "PERS_NOM")
	@NotBlank
	private String nom;

	@Column(name = "PERS_PRENOM")
	@NotBlank
	private String prenom;

	@Column(name = "PERS_TYPE", insertable = false, updatable = false)
	@NotBlank
	private String type;

	/**
	 * 
	 */
	public Personne()
	{
	}

	public String getType()
	{
		return this.type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getId()
	{
		return this.id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getNom()
	{
		return this.nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getPrenom()
	{
		return this.prenom;
	}

	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}

}

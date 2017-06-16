
package fr.formation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "admin"/*
						 * , uniqueConstraints = { @UniqueConstraint(columnNames =
						 * "CAND_USERNAME") }
						 */)
// @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
// @DiscriminatorColumn(name="CAND_TYPE",
// discriminatorType=DiscriminatorType.INTEGER)

public class Admin extends Personne implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "ADMIN_NAME")
	@NotBlank
	private String username;

	@Column(name = "ADMIN_MOTDEPASSE")
	@NotBlank
	private String password;

	public Admin()
	{
		super();
	}

	public String getUsername()
	{
		return this.username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
}

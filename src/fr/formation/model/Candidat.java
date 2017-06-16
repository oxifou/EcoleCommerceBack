
package fr.formation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;

@Entity
// @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
// @DiscriminatorColumn(name="ADMIN_TYPE",
// discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue("candidat")
public class Candidat extends Personne implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "CAND_CLEACCES")
	@NotBlank
	private String cleAcces;

	/**
	 * 
	 */
	public Candidat()
	{
		super();
	}

	public String getCleAcces()
	{
		return this.cleAcces;
	}

	public void setCleAcces(String cleAcces)
	{
		this.cleAcces = cleAcces;
	}
}

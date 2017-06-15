

package fr.formation.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="admin"/*, uniqueConstraints = { @UniqueConstraint(columnNames = "CAND_USERNAME") }*/)
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="CAND_TYPE", discriminatorType=DiscriminatorType.INTEGER)




public class Admin extends Personne implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="ADMIN_NAME")
	@NotBlank
	private String userName;
	
	@Column(name="ADMIN_MOTDEPASSE")
	@NotBlank
	private String motDePasse;
	 
	public String getUserName() {
		return userName;
		}

		public void setUserName(String userName) {
		this.userName = userName;
		}
		
	public String getMotDePasse() {
			return motDePasse;
			}

	public void setMotDePasse(String motDePasse) {
			this.motDePasse = motDePasse;
			}
}


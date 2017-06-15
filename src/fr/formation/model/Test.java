package fr.formation.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TEST_ID")
	private Integer idTest;
	
	@Column(name="TEST_DATE")
	private Date date;	
	
	@Column(name="TEST_BRANCH")
	private Branche branche;
	
	@Column(name="TEST_NIVEAU")
	private Niveau niveau;
	
	@OneToMany(mappedBy="tests")
	private List<Questionnaire> questionnaires;

	public Test()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idTest
	 */
	public Integer getIdTest()
	{
		return idTest;
	}

	/**
	 * @param idTest the idTest to set
	 */
	public void setIdTest(Integer idTest)
	{
		this.idTest = idTest;
	}

	/**
	 * @return the date
	 */
	public Date getDate()
	{
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date)
	{
		this.date = date;
	}

	/**
	 * @return the branche
	 */
	public Branche getBranche()
	{
		return branche;
	}

	/**
	 * @param branche the branche to set
	 */
	public void setBranche(Branche branche)
	{
		this.branche = branche;
	}

	/**
	 * @return the niveau
	 */
	public Niveau getNiveau()
	{
		return niveau;
	}

	/**
	 * @param niveau the niveau to set
	 */
	public void setNiveau(Niveau niveau)
	{
		this.niveau = niveau;
	}

	/**
	 * @return the questionnaires
	 */
	public List<Questionnaire> getQuestionnaires()
	{
		return questionnaires;
	}

	/**
	 * @param questionnaires the questionnaires to set
	 */
	public void setQuestionnaires(List<Questionnaire> questionnaires)
	{
		this.questionnaires = questionnaires;
	}
	
	
	

}

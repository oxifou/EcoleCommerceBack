package fr.formation.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="questionnaire")
public class Questionnaire implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="QUESTIONAIRE_ID")
	private Integer idQuestionnaire;
	
	@Column(name="QUESTIONAIRE_DUREE")
	private Integer Duree;
	
	@ManyToMany
	@JoinColumn(name="QUESTIONNAIRE_TEST_ID")
	private List<Test> tests;
	
	@OneToMany(mappedBy="questionnaire")
	private List<Question> question;
	
	@OneToOne(mappedBy = "questionnaires")
	private Matiere matiere;
	
	public Questionnaire()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idQuestionnaire
	 */
	public Integer getIdQuestionnaire()
	{
		return idQuestionnaire;
	}

	/**
	 * @param idQuestionnaire the idQuestionnaire to set
	 */
	public void setIdQuestionnaire(Integer idQuestionnaire)
	{
		this.idQuestionnaire = idQuestionnaire;
	}

	/**
	 * @return the duree
	 */
	public Integer getDuree()
	{
		return Duree;
	}

	/**
	 * @param duree the duree to set
	 */
	public void setDuree(Integer duree)
	{
		Duree = duree;
	}

	/**
	 * @return the tests
	 */
	public List<Test> getTests()
	{
		return tests;
	}

	/**
	 * @param tests the tests to set
	 */
	public void setTests(List<Test> tests)
	{
		this.tests = tests;
	}

	/**
	 * @return the question
	 */
	public List<Question> getQuestion()
	{
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(List<Question> question)
	{
		this.question = question;
	}

	/**
	 * @return the matiere
	 */
	public Matiere getMatiere()
	{
		return matiere;
	}

	/**
	 * @param matiere the matiere to set
	 */
	public void setMatiere(Matiere matiere)
	{
		this.matiere = matiere;
	}	
}

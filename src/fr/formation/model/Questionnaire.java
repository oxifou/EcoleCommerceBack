package fr.formation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="questionnaire")
public class Questionnaire
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="QUEST_ID")
	private Integer idQuestionnaire;
	
	@Column(name="QUEST_DUREE")
	private Integer Duree;
	
	@ManyToMany
	@JoinColumn(name="QUEST_TEST_ID")
	@JsonIgnore
	private List<Test> tests;
	
	@OneToMany(mappedBy="questionnaire")
	private List<Question> question;
	
	
	private Matiere matiere;
	
	public Questionnaire()
	{
		// TODO Auto-generated constructor stub
	}

}

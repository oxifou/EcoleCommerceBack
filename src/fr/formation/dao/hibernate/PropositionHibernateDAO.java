package fr.formation.dao.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.dao.IDAO;
import fr.formation.model.Proposition;


@Repository("PropositionDAO")
@Transactional
public class PropositionHibernateDAO implements IDAO<Proposition, Integer>
{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Proposition> findAll()
	{
		try {
			return this.entityManager.createQuery("from proposition", Proposition.class).getResultList();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Proposition find(Integer id)
	{
		try {
			return this.entityManager.find(Proposition.class, id);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Proposition save(Proposition proposition)
	{
		try {
			return this.entityManager.merge(proposition);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return proposition;
	}

	@Override
	public void delete(Proposition proposition)
	{
		try {
			this.entityManager.remove(this.entityManager.merge(proposition));
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

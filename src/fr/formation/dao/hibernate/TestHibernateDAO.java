package fr.formation.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.formation.dao.IDAO;
import fr.formation.model.Test;

@Repository("TestDAO")
@Transactional
public class TestHibernateDAO implements IDAO<Test, Integer>
{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Test> findAll()
	{
		try {
			return this.entityManager.createQuery("from test", Test.class).getResultList();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Test find(Integer id)
	{
		try {
			return this.entityManager.find(Test.class, id);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Test save(Test test)
	{
		try {
			return this.entityManager.merge(test);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return test;
	}

	@Override
	public void delete(Test test)
	{
		try {
			this.entityManager.remove(this.entityManager.merge(test));
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

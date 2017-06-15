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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Test save(Test test)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Test test)
	{
		// TODO Auto-generated method stub

	}

}

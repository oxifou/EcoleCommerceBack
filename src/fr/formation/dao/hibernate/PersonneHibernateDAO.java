package fr.formation.dao.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.dao.IPersonneDAO;
import fr.formation.model.Personne;

@Repository("PersonneDAO")
@Transactional
public class PersonneHibernateDAO implements IPersonneDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personne find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personne save(Personne obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Personne obj) {
		// TODO Auto-generated method stub
		
	}
}

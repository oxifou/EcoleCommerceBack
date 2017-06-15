package fr.formation.dao.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.exception.WrongUsernameOrPasswordException;
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
		try {
			return this.entityManager.createQuery("from Personne", Personne.class).getResultList();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Personne find(String id) {
		try {
			return this.entityManager.find(Personne.class, id);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Personne save(Personne personne) {
		try {
			return this.entityManager.merge(personne);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return personne;
	}

	@Override
	public void delete(Personne personne) {
		try {
			this.entityManager.remove(this.entityManager.merge(personne));
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Personne auth(String username, String password) throws WrongUsernameOrPasswordException {
		try {
			return this.entityManager.createQuery("from Peronne p where u.username = :username AND u.password = :password", Personne.class)
					.setParameter("username", username)
					.setParameter("password", password)
					.getSingleResult();
		}
		
		catch (Exception e) {
			throw new WrongUsernameOrPasswordException();
		}
	}
}


package fr.formation.dao.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.dao.IDAO;
import fr.formation.model.Matiere;

@Repository("MatiereDAO")
@Transactional
public class MatiereHibernateDAO implements IDAO<Matiere, Integer>
{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Matiere> findAll()
	{
		try {
			return this.entityManager.createQuery("from Matiere", Matiere.class).getResultList();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Matiere find(Integer id)
	{
		try {
			return this.entityManager.find(Matiere.class, id);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Matiere save(Matiere matiere)
	{
		try {
			return this.entityManager.merge(matiere);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return matiere;
	}

	@Override
	public void delete(Matiere matiere)
	{
		try {
			this.entityManager.remove(this.entityManager.merge(matiere));
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

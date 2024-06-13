package com.sharath.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.sharath.dto.ShowroomsDto;
import com.sharath.service.ShowroomsService;

public class ShowroomsRepoImpl implements ShowroomsRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Servlet");
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(ShowroomsDto d) {

		if (em != null) {
			em.getTransaction().begin();

			em.persist(d);
			em.getTransaction().commit();
			return true;

		}
		return false;
	}

	@Override
	public List<ShowroomsDto> readAll() {

		Query query = em.createNamedQuery("readAll");

		return query.getResultList();
	}

	@Override
	public ShowroomsDto readByname(String name) {

		Query query = em.createNamedQuery("readByName", ShowroomsDto.class);
		query.setParameter("showroomName", name);
		return (ShowroomsDto) query.getSingleResult();
	}

	@Override
	public boolean updateDealsWithByNameAndLocation(String dealsWith, String name, String location) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("update");

		query.setParameter("dealsWith", dealsWith);
		query.setParameter("showroomName", name);
		query.setParameter("location", location);
		if(query.executeUpdate() > 0) {
			em.getTransaction().commit();
			return true;
		}
		em.getTransaction().commit();
		return false;

	}

	@Override
	public boolean deleteByNameAndDealsWith(String name, String dealsWith) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("delete");

		query.setParameter("showroomName", name);
		query.setParameter("dealsWith", dealsWith);
		if(query.executeUpdate() > 0) {
			em.getTransaction().commit();
			return true;
		}
		em.getTransaction().commit();
		return false;

	}

}

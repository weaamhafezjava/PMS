package com.whsolutions.core.dao;

// Generated Jan 21, 2014 5:03:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.whsolutions.core.mappings.PmsUsers;

/**
 * Dao object for domain model class PmsUsers.
 * @see com.whsolutions.core.mappings.PmsUsers
 * @author Weaam
 */
public class PmsUsersDao extends GenericDao {

	private static final Logger log = LoggerFactory.getLogger(PmsUsersDao.class);


	public void persist(PmsUsers transientInstance) {
		log.debug("persisting PmsUsers instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PmsUsers persistentInstance) {
		log.debug("removing PmsUsers instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PmsUsers merge(PmsUsers detachedInstance) {
		log.debug("merging PmsUsers instance");
		try {
			PmsUsers result = (PmsUsers)sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PmsUsers findById(int id) {
		log.debug("getting PmsUsers instance with id: " + id);
		try {
			PmsUsers instance = (PmsUsers) sessionFactory.getCurrentSession().get(PmsUsers.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

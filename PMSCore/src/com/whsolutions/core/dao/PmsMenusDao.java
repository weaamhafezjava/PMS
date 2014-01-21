package com.whsolutions.core.dao;

// Generated Jan 21, 2014 5:03:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.whsolutions.core.mappings.PmsMenus;

/**
 * Home object for domain model class PmsMenus.
 * @see com.whsolutions.core.mappings.PmsMenus
 * @author Hibernate Tools
 */
public class PmsMenusDao {

	private static final Logger log = LoggerFactory.getLogger(PmsMenusDao.class);


	public void persist(PmsMenus transientInstance) {
		log.debug("persisting PmsMenus instance");
		try {
//			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PmsMenus persistentInstance) {
		log.debug("removing PmsMenus instance");
		try {
//			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PmsMenus merge(PmsMenus detachedInstance) {
		log.debug("merging PmsMenus instance");
		try {
			PmsMenus result = null;//entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PmsMenus findById(int id) {
		log.debug("getting PmsMenus instance with id: " + id);
		try {
			PmsMenus instance = null;//entityManager.find(PmsMenus.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

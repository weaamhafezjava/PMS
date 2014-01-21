package com.whsolutions.core.dao;

// Generated Jan 21, 2014 5:03:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.whsolutions.core.mappings.PmsPriviliges;

/**
 * Dao object for domain model class PmsPriviliges.
 * @see com.whsolutions.core.mappings.PmsPriviliges
 * @author Weaam
 */
public class PmsPriviligesDao {

	private static final Logger log = LoggerFactory.getLogger(PmsPriviligesDao.class);
	

	public void persist(PmsPriviliges transientInstance) {
		log.debug("persisting PmsPriviliges instance");
		try {
//			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PmsPriviliges persistentInstance) {
		log.debug("removing PmsPriviliges instance");
		try {
//			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PmsPriviliges merge(PmsPriviliges detachedInstance) {
		log.debug("merging PmsPriviliges instance");
		try {
			PmsPriviliges result = null;//entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PmsPriviliges findById(int id) {
		log.debug("getting PmsPriviliges instance with id: " + id);
		try {
			PmsPriviliges instance = null;//entityManager.find(PmsPriviliges.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

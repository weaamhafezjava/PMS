package com.whsolutions.core.dao;

// Generated Jan 21, 2014 5:03:48 PM by Hibernate Tools 3.4.0.CR1

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.whsolutions.core.mappings.PmsGroups;

/**
 * Home object for domain model class PmsGroups.
 * @see com.whsolutions.core.mappings.PmsGroups
 * @author Weaam
 */
public class PmsGroupsDao {

	private static final Logger log = LoggerFactory.getLogger(PmsGroupsDao.class);


	public void persist(PmsGroups transientInstance) {
		log.debug("persisting PmsGroups instance");
		try {
//			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PmsGroups persistentInstance) {
		log.debug("removing PmsGroups instance");
		try {
//			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PmsGroups merge(PmsGroups detachedInstance) {
		log.debug("merging PmsGroups instance");
		try {
//			PmsGroups result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return null;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PmsGroups findById(int id) {
		log.debug("getting PmsGroups instance with id: " + id);
		try {
//			PmsGroups instance = entityManager.find(PmsGroups.class, id);
			log.debug("get successful");
			return null;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

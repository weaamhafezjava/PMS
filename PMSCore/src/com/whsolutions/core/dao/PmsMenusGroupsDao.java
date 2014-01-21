package com.whsolutions.core.dao;

// Generated Jan 21, 2014 5:03:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.whsolutions.core.mappings.PmsMenusGroups;
import com.whsolutions.core.mappings.PmsMenusGroupsId;

/**
 * Dao object for domain model class PmsMenusGroups.
 * @see com.whsolutions.core.mappings.PmsMenusGroups
 * @author Weaam
 */
public class PmsMenusGroupsDao {

	private static final Logger log = LoggerFactory.getLogger(PmsMenusGroupsDao.class);


	public void persist(PmsMenusGroups transientInstance) {
		log.debug("persisting PmsMenusGroups instance");
		try {
//			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PmsMenusGroups persistentInstance) {
		log.debug("removing PmsMenusGroups instance");
		try {
//			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PmsMenusGroups merge(PmsMenusGroups detachedInstance) {
		log.debug("merging PmsMenusGroups instance");
		try {
			PmsMenusGroups result = null;//entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PmsMenusGroups findById(PmsMenusGroupsId id) {
		log.debug("getting PmsMenusGroups instance with id: " + id);
		try {
			PmsMenusGroups instance = null;//entityManager.find(PmsMenusGroups.class,
					//id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

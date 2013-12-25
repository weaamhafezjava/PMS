package com.whsolutions.pms.ejb;

//import org.slf4j.Logger;

import javax.ejb.Stateless;

//import org.slf4j.LoggerFactory;

/**
 * Session Bean implementation class AdminEjb
 */
@Stateless
public class AdminEjb implements AdminEjbLocal {

//	private Logger log = LoggerFactory.getLogger(AdminEjb.class);
    /**
     * Default constructor. 
     */
    public AdminEjb() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void testEjb() {
		
//		log.info("Test EJB");
		System.out.println("Testing EJB");
		// TODO Auto-generated method stub
		
	}

}

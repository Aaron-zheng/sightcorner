/**
 * 
 */
package com.sightcorner.www.util;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

/**
 * @author Aaron ZHENG
 * @email fucheng.zheng@gmail.com
 * @createAt 31 Jul, 2015 3:34:37 am
 * @history 
 *
 */
public class PMF {
	private static final PersistenceManagerFactory pmfInstance =
        JDOHelper.getPersistenceManagerFactory("transactions-optional");

    private PMF() {}

    public static PersistenceManagerFactory getPersistenceManagerFactory() {
        return pmfInstance;
    }
    
    public static PersistenceManager getPersistenceManager() {
    	return getPersistenceManagerFactory().getPersistenceManager();
    }
}

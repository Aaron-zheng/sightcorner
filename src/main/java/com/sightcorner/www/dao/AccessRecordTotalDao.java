/**
 * 11:28:01 pm
 */
package com.sightcorner.www.dao;

import javax.jdo.PersistenceManager;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.sightcorner.www.po.AccessRecordTotal;
import com.sightcorner.www.util.PMF;
import com.sightcorner.www.util.Utility;

/**
 * @author Aaron ZHENG
 * @email fucheng.zheng@gmail.com
 * @createAt 6 Mar, 2016 11:28:01 pm
 * @history 
 *
 */
public class AccessRecordTotalDao {
	
	public static Key accessRecordTotalKey = KeyFactory.createKey(AccessRecordTotal.class.getSimpleName(), "sightcorner");

	/**
	 * 
	 * @author Aaron ZHENG
	 * @email fucheng.zheng@gmail.com
	 * @createAt 7 Mar, 2016 12:21:26 am
	 * @history
	 *
	 */
	public static void createUpdateAccessRecordTotal(){
		PersistenceManager pm = PMF.getPersistenceManager();
		AccessRecordTotal accessRecordTotal = null;
		try { 
			accessRecordTotal = pm.getObjectById(AccessRecordTotal.class, accessRecordTotalKey);
			updateAccessRecordTotal(pm, accessRecordTotal);
		} catch (Exception ex) {
			createAccessRecordTotal(pm, accessRecordTotal);
		} finally {
			pm.close();
		}
	}
	
	/**
	 * 
	 * @author Aaron ZHENG
	 * @email fucheng.zheng@gmail.com
	 * @createAt 7 Mar, 2016 12:21:32 am
	 * @history
	 * @return
	 *
	 */
	public static long getAccessRecordTotal() {
		PersistenceManager pm = PMF.getPersistenceManager();
		try {
			AccessRecordTotal accessRecordTotal = pm.getObjectById(AccessRecordTotal.class, accessRecordTotalKey);
			if (null != accessRecordTotal) {
				return accessRecordTotal.getTotal();
			}
		} catch (Exception e) {
			
		} finally {
			pm.close();
		}
		return 0;
	}
	
	/**
	 * 
	 * @author Aaron ZHENG
	 * @email fucheng.zheng@gmail.com
	 * @createAt 7 Mar, 2016 12:21:36 am
	 * @history
	 * @param pm
	 * @param accessRecordTotal
	 *
	 */
	private static void createAccessRecordTotal (PersistenceManager pm, AccessRecordTotal accessRecordTotal) {
		accessRecordTotal = new AccessRecordTotal();
		accessRecordTotal.setKey(accessRecordTotalKey);
		accessRecordTotal.setCreateDate(Utility.getDate());
		accessRecordTotal.setTotal(1);
		pm.makePersistent(accessRecordTotal);
	}
	
	/**
	 * 
	 * @author Aaron ZHENG
	 * @email fucheng.zheng@gmail.com
	 * @createAt 7 Mar, 2016 12:21:40 am
	 * @history
	 * @param pm
	 * @param accessRecordTotal
	 *
	 */
	private static void updateAccessRecordTotal (PersistenceManager pm, AccessRecordTotal accessRecordTotal) {
		accessRecordTotal.setTotal(accessRecordTotal.getTotal() + 1);
		accessRecordTotal.setLastUpdateDate(Utility.getDate());
	}
	
	public static void setAccessRecordTotal (long total) {
		PersistenceManager pm = PMF.getPersistenceManager();
		AccessRecordTotal accessRecordTotal = pm.getObjectById(AccessRecordTotal.class, accessRecordTotalKey);
		accessRecordTotal.setTotal(total);
		accessRecordTotal.setLastUpdateDate(Utility.getDate());
		pm.close();
	}
}

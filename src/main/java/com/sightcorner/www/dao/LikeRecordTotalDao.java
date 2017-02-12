/**
 * 12:17:34 am
 */
package com.sightcorner.www.dao;

import javax.jdo.PersistenceManager;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.sightcorner.www.po.LikeRecordTotal;
import com.sightcorner.www.util.PMF;
import com.sightcorner.www.util.Utility;

/**
 * @author Aaron ZHENG
 * @email fucheng.zheng@gmail.com
 * @createAt 7 Mar, 2016 12:17:34 am
 * @history 
 *
 */
public class LikeRecordTotalDao {
	public static Key likeRecordTotalKey = KeyFactory.createKey(LikeRecordTotal.class.getSimpleName(), "sightcorner");
	
	/**
	 * 
	 * @author Aaron ZHENG
	 * @email fucheng.zheng@gmail.com
	 * @createAt 7 Mar, 2016 12:21:22 am
	 * @history
	 *
	 */
	public static void createUpdateLikeRecordTotal() {
		PersistenceManager pm = PMF.getPersistenceManager();
		LikeRecordTotal likeRecordTotal = null;
		try {
			likeRecordTotal = pm.getObjectById(LikeRecordTotal.class, likeRecordTotalKey);
			updateLikeRecordTotal(pm, likeRecordTotal);
		} catch (Exception e) {
			createLikeRecordTotal(pm, likeRecordTotal);
		} finally {
			pm.close();
		}
	}

	/**
	 * @author Aaron ZHENG
	 * @email fucheng.zheng@gmail.com
	 * @createAt 7 Mar, 2016 12:21:12 am
	 * @history
	 * @param pm
	 * @param likeRecordTotal
	 *
	 */
	private static void createLikeRecordTotal(PersistenceManager pm,
			LikeRecordTotal likeRecordTotal) {
		likeRecordTotal = new LikeRecordTotal();
		likeRecordTotal.setKey(likeRecordTotalKey);
		likeRecordTotal.setCreateDate(Utility.getDate());
		likeRecordTotal.setTotal(1);
		pm.makePersistent(likeRecordTotal);
	}

	/**
	 * @author Aaron ZHENG
	 * @email fucheng.zheng@gmail.com
	 * @createAt 7 Mar, 2016 12:21:05 am
	 * @history
	 * @param pm
	 * @param likeRecordTotal
	 *
	 */
	private static void updateLikeRecordTotal(PersistenceManager pm,
			LikeRecordTotal likeRecordTotal) {
		likeRecordTotal.setTotal(likeRecordTotal.getTotal() + 1);
		likeRecordTotal.setLastUpdateDate(Utility.getDate());
	}
	
	public static void setLikeRecordTotal (long total) {
		PersistenceManager pm = PMF.getPersistenceManager();
		LikeRecordTotal likeRecordTotal = pm.getObjectById(LikeRecordTotal.class, likeRecordTotalKey);
		likeRecordTotal.setTotal(total);
		likeRecordTotal.setLastUpdateDate(Utility.getDate());
		pm.close();
	}
	
	public static long getLikeRecordTotal() {
		PersistenceManager pm = PMF.getPersistenceManager();
		try{
			LikeRecordTotal likeRecordTotal = pm.getObjectById(LikeRecordTotal.class, likeRecordTotalKey);
			if (null != likeRecordTotal) {
				return likeRecordTotal.getTotal();
			}
		} catch (Exception ex) {
			
		} finally {
			pm.close();
		}
		return 0;
	}
}

/**
 * 
 */
package com.sightcorner.www.dao;


import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.sightcorner.www.po.AccessRecord;
import com.sightcorner.www.po.LikeRecord;
import com.sightcorner.www.util.PMF;
import com.sightcorner.www.util.Utility;

/**
 * @author Aaron ZHENG
 * @email fucheng.zheng@gmail.com
 * @createAt 31 Jul, 2015 3:33:02 am
 * @history 
 *
 */
public class AccessRecordDao {

	public static void createAccessRecprd(){
		PersistenceManager pm = PMF.getPersistenceManager();
		AccessRecord accessRecord = new AccessRecord();
		accessRecord.setCreateDate(Utility.getDate());
		pm.makePersistent(accessRecord);
		pm.close();
	}
	
	public static void createLikeRecord(){
		PersistenceManager pm = PMF.getPersistenceManager();
		LikeRecord likeRecord = new LikeRecord();
		likeRecord.setCreateDate(Utility.getDate());
		pm.makePersistent(likeRecord);
		pm.close();
	}

	public static long recordCount(Class<?> clazz){
		PersistenceManager pm = PMF.getPersistenceManager();
		Query query = pm.newQuery(clazz);
		query.setResult("count(1)");
		Long recordCount = (Long) query.execute();
		if(null != recordCount) {
			return recordCount;
		}else {
			return 0;
		}
	}
}

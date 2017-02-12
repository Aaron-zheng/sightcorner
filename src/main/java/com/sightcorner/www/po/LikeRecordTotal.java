/**
 * 12:15:54 am
 */
package com.sightcorner.www.po;

import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

/**
 * @author Aaron ZHENG
 * @email fucheng.zheng@gmail.com
 * @createAt 7 Mar, 2016 12:15:54 am
 * @history 
 *
 */
@PersistenceCapable
public class LikeRecordTotal extends BasePo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 341847506822556039L;

	@Persistent 
	private long total;


	/**
	 * @return the total
	 */
	public long getTotal() {
		return total;
	}


	/**
	 * @param total the total to set
	 */
	public void setTotal(long total) {
		this.total = total;
	}
}

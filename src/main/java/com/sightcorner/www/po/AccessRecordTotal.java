/**
 * 11:25:02 pm
 */
package com.sightcorner.www.po;

import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

/**
 * @author Aaron ZHENG
 * @email fucheng.zheng@gmail.com
 * @createAt 6 Mar, 2016 11:25:02 pm
 * @history 
 *
 */
@PersistenceCapable
public class AccessRecordTotal extends BasePo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5270197005553945372L;

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

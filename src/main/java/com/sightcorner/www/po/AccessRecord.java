/**
 * 
 */
package com.sightcorner.www.po;

import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

/**
 * @author Aaron ZHENG
 * @email fucheng.zheng@gmail.com
 * @createAt 31 Jul, 2015 3:28:09 am
 * @history 
 *
 */

@PersistenceCapable
public class AccessRecord extends BasePo implements Serializable {
	
	/**
	 *
	 */
	private static final long serialVersionUID = 5467135915632297166L;
	
	@Persistent
	private String ipAddress;

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	
}

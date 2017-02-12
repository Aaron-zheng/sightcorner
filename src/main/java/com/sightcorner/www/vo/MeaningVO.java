/**
 * @author Aaron
 * @contact fucheng.zheng@gmail.com
 * @create 2013-5-31
 * @history 
 *
 */
package com.sightcorner.www.vo;

/**
 * @author Aaron
 * @contact fucheng.zheng@gmail.com
 * @create 2013-5-31
 * @history 
 *
 */
public class MeaningVO {

	private String meaningID;
	private String meaningName;
	private String meaningPath;
	
	public MeaningVO(String meaningID, String meaningName, String meaningPath) {
		super();
		this.meaningID = meaningID;
		this.meaningName = meaningName;
		this.meaningPath = meaningPath;
	}
	
	public String getMeaningID() {
		return meaningID;
	}
	public void setMeaningID(String meaningID) {
		this.meaningID = meaningID;
	}
	public String getMeaningName() {
		return meaningName;
	}
	public void setMeaningName(String meaningName) {
		this.meaningName = meaningName;
	}
	public String getMeaningPath() {
		return meaningPath;
	}
	public void setMeaningPath(String meaningPath) {
		this.meaningPath = meaningPath;
	}
	
	
}

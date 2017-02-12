/**
 * @author Aaron
 * @contact fucheng.zheng@gmail.com
 * @create 2013-5-16
 * @history 
 *
 */
package com.sightcorner.www.vo;

/**
 * @author Aaron
 * @contact fucheng.zheng@gmail.com
 * @create 2013-5-16
 * @history 
 *
 */
public class ArchiveVO{
	private String title;
	private String description;
	private String subTitle; 
	private String portfolioNumber;
	
	public ArchiveVO(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	public ArchiveVO(String title, String description, String subTitle, String portfolioNumber) {
		this.title = title;
		this.description = description;
		this.subTitle = subTitle;
		this.portfolioNumber = portfolioNumber;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public String getPortfolioNumber() {
		return portfolioNumber;
	}
	public String getSubTitle() {
		return subTitle;
	}
	
}
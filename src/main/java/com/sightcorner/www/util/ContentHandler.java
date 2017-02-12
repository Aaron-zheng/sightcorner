/**
 * 
 */
package com.sightcorner.www.util;

import java.util.List;

/**
 * @author Aaron ZHENG
 * @email fucheng.zheng@gmail.com
 * @createAt Aug 25, 2014 2:17:42 AM
 * @history 
 *
 */
public abstract class ContentHandler {

	/**
	 * @author Aaron ZHENG
	 * @email fucheng.zheng@gmail.com
	 * @createAt Sep 7, 2014 12:32:19 PM
	 * @history
	 * @param output
	 * @param tmp
	 *
	 */
	public abstract void lineHandle(StringBuffer output, String tmp);
	

	/**
	 * @author Aaron ZHENG
	 * @email fucheng.zheng@gmail.com
	 * @createAt Sep 7, 2014 12:32:19 PM
	 * @history
	 * @param content
	 * @param list
	 *
	 */
	public void blockHandle(StringBuffer content, List<String> list){
		for(String tmp: list){
			if(content.length() > 0){
				content.append("\n");
			}
			content.append(tmp);
		}
	}
	
	/**
	 * 
	 * @author Aaron ZHENG
	 * @email fucheng.zheng@gmail.com
	 * @createAt 17 Jul, 2016 8:47:37 pm
	 * @history
	 * @param content
	 * @param tmp
	 *
	 */
	public void lineHandleWithHTML(StringBuffer content, String tmp){
		if(content.length() > 0){
			content.append("\n");
		}
		content.append(tmp);
	}
}

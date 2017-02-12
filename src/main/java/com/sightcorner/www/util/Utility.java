/**
 * 
 */
package com.sightcorner.www.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author Aaron ZHENG
 * @email fucheng.zheng@gmail.com
 * @createAt 2 Aug, 2015 5:31:03 am
 * @history 
 *
 */
public class Utility {

	public static Date getDate(){
		return Calendar.getInstance(Locale.CHINA).getTime();
	}
}

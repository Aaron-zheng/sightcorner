/**
 * 
 */
package com.sightcorner.www.util;

import java.util.Calendar;

/**
 * @author Aaron ZHENG
 * @email fucheng.zheng@gmail.com
 * @createAt Jan 6, 2015 11:32:47 PM
 * @history 
 *
 */
public class AutoMain {

	public static void main(String[] args){
		
		Calendar initial = Calendar.getInstance();
		initial.set(2016, 0, 3);
		
		for (int i = 0; i <= 50; i++){
			
			initial.add(Calendar.DATE, 1);
			String previousMonth = initial.get(Calendar.MONTH) + 1 < 10 ? "0" + "" + (initial.get(Calendar.MONTH) + 1) : "" + (initial.get(Calendar.MONTH) + 1);
			String previousDate = initial.get(Calendar.DATE) < 10 ? "0" + "" + initial.get(Calendar.DATE) : "" + initial.get(Calendar.DATE);
			
			initial.add(Calendar.DATE, 6);
//			System.out.println(initial.get(Calendar.MONTH) + 1 + " " + initial.get(Calendar.DATE));
			String month = initial.get(Calendar.MONTH) + 1 < 10 ? "0" + "" + (initial.get(Calendar.MONTH) + 1) : "" + (initial.get(Calendar.MONTH) + 1);
			String date = initial.get(Calendar.DATE) < 10 ? "0" + "" + initial.get(Calendar.DATE) : "" + initial.get(Calendar.DATE);
			System.out.println("EVENT_SINGLE_MAP.put(\"2016_" + month + "_" + date + "\", new ArchiveVO(\"我与树莓在纽村打工旅行第" + (9 + i) + "周(" + previousMonth + "." + previousDate + "~" + month + "." + date + ")\", \"...\"));");
		}
	}
}

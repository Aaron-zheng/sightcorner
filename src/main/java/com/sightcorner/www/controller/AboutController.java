/**
 * 
 */
package com.sightcorner.www.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sightcorner.www.util.PageUtility;

/**
 * @author Aaron ZHENG
 * @email fucheng.zheng@gmail.com
 * @createAt Mar 6, 2015 2:46:54 AM
 * @history 
 *
 */
@Controller
public class AboutController {

	@RequestMapping("/about")
	public ModelAndView about(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tag", "about");
		map.put("load_main_content", "about");
		return PageUtility.getInitialModelAndView(map);
	}
}

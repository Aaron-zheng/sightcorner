package com.sightcorner.www.controller;



import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sightcorner.www.util.PageUtility;


/**
 * 
 * @author Aaron
 * @contact fucheng.zheng@gmail.com
 * @create 2013-6-7
 * @history 
 *
 */
@Controller
public class InitController {


	@RequestMapping("/") 
	public ModelAndView init(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tag", "article");
		return PageUtility.getInitialModelAndView(map);
	}
	

	@RequestMapping("/record_count") 
	public @ResponseBody Map<String, Object> recordCount(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("vistorRecordCount", 0L);
		map.put("likeRecordCount", 0L);
		return map;
	}

	@RequestMapping("/like") 
	public @ResponseBody Map<String, Object> like(){
		Map<String, Object> map = new HashMap<String, Object>();
		return map;
	}

}
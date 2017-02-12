package com.sightcorner.www.controller;



import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sightcorner.www.dao.AccessRecordDao;
import com.sightcorner.www.dao.AccessRecordTotalDao;
import com.sightcorner.www.dao.LikeRecordTotalDao;
import com.sightcorner.www.po.AccessRecord;
import com.sightcorner.www.po.LikeRecord;
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
		AccessRecordDao.createAccessRecprd();
		AccessRecordTotalDao.createUpdateAccessRecordTotal();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tag", "event");
		return PageUtility.getInitialModelAndView(map);
	}
	

	@RequestMapping("/record_count") 
	public @ResponseBody Map<String, Object> recordCount(){ 
		long likeRecordCount = LikeRecordTotalDao.getLikeRecordTotal();
		long vistorRecordCount = AccessRecordTotalDao.getAccessRecordTotal();
		
		String displayVistorRecordCount = String.valueOf(vistorRecordCount).replaceAll("(?<=\\d)(?=(?:\\d{3})+$)", ",");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("vistorRecordCount", displayVistorRecordCount);
		map.put("likeRecordCount", likeRecordCount);
		return map;
	}

	@RequestMapping("/like") 
	public @ResponseBody Map<String, Object> like(){ 
		AccessRecordDao.createLikeRecord();
		LikeRecordTotalDao.createUpdateLikeRecordTotal();
		Map<String, Object> map = new HashMap<String, Object>();
		return map;
	}

//	@RequestMapping("/test") 
	public ModelAndView test(){ 
		return new ModelAndView("test");
	}

//	@RequestMapping("/getOldAccessRecordTotal")
	public @ResponseBody String getOldAccessRecordTotal(){
		long vistorRecordCount = AccessRecordDao.recordCount(AccessRecord.class);
		return "" + vistorRecordCount;
	}
	
//	@RequestMapping("/getOldLikeRecordTotal")
	public @ResponseBody String getOldLikeRecordTotal(){
		long likeRecordCount = AccessRecordDao.recordCount(LikeRecord.class);
		return "" + likeRecordCount;
	}
	
//	@RequestMapping("/setAccessRecordTotal/{total}")
	public @ResponseBody String setAccessRecordTotal(@PathVariable final String total) {
		AccessRecordTotalDao.setAccessRecordTotal(Long.parseLong(total));
		return total;
	}
	
//	@RequestMapping("/setLikeRecordTotal/{total}")
	public @ResponseBody String setLikeRecordTotal(@PathVariable final String total) {
		LikeRecordTotalDao.setLikeRecordTotal(Long.parseLong(total));
		return total;
		
	}
}
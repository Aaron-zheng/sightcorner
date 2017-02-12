/**
 * 
 */
package com.sightcorner.www.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sightcorner.www.util.Constant;
import com.sightcorner.www.util.ContentHandler;
import com.sightcorner.www.util.PageUtility;
import com.sightcorner.www.vo.ArchiveVO;

/**
 * @author Aaron ZHENG
 * @email fucheng.zheng@gmail.com
 * @createAt Dec 7, 2014 11:16:46 PM
 * @history 
 *
 */
@Controller
public class EventController {
	
	@RequestMapping("/event")
	public ModelAndView event(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tag", "event");
		return PageUtility.getInitialModelAndView(map);
	}
	

	@RequestMapping("/event/data")
	public @ResponseBody Map<String,ArchiveVO> eventData(){
		return Constant.EVENT_SINGLE_MAP.descendingMap();
	}
	

	@RequestMapping("/event/{p}")
	public ModelAndView eventPage(@PathVariable final String p){
		Map<String, Object> map = new HashMap<String, Object>();
		String content = PageUtility.getFileContent(Constant.DATA_FILE + "/event/" + p.split("_")[0] + "/event_" + p + ".sc", new ContentHandler(){
			@Override
			public void lineHandle(StringBuffer content, String tmp) {
				if(content.length() > 0){
					content.append("\n");
				}
				Matcher matcher = Constant.EVENT_IMAGE_PATTERN.matcher(tmp);
				if(matcher.matches()){
					tmp=matcher.group();
					tmp="<div class='image-package imagebubble'><img src='/sightcorner/event/" + tmp + ".jpg'></img></div>";
					content.append(tmp);
				}else{
					content.append("<p>").append(tmp).append("</p>");
				}
			}
		});
		content = PageUtility.convertByEnvironmentIndicator(content, Constant.CURRENT_ENVIRONMENT_INDICATOR);
		map.put("tag", "event");
		map.put("content", content);
		map.put("title", Constant.EVENT_SINGLE_MAP.get(p).getTitle());
		map.put("time", p.replace("_", "-"));
		return PageUtility.getInitialModelAndView(map);
	}
}

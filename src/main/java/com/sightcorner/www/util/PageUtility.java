/**
 * @author Aaron
 * @contact fucheng.zheng@gmail.com
 * @create 2013-6-8
 * @history
 */
package com.sightcorner.www.util;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.HtmlUtils;

import com.sightcorner.www.controller.InitController;


/**
 * @author Aaron
 * @contact fucheng.zheng@gmail.com
 * @create 2013-6-8
 * @history
 */
public class PageUtility {

    private static final String path = "http://sightcorner.oss-cn-beijing.aliyuncs.com";

    public static ModelAndView getInitialModelAndView(Map<String, Object> map) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("number_archive", Constant.ARTICLE_SINGLE_MAP.size() + Constant.EVENT_SINGLE_MAP.size() + Constant.TECHNIQUE_SINGLE_MAP.size());
        result.put("number_portfolio", Constant.ARTICLE_SINGLE_MAP.size());
        result.put("number_like", 0);
        result.put("number_guess", 0);
        if (map.size() > 1) {
            result.put("load_main_content", "archive");
        } else {
            result.put("load_main_content", "list");
        }
        result.putAll(map);
        return new ModelAndView("index", result);
    }


    public static String convertByEnvironmentIndicator(String content, int environmentIndicator) {
        String result = "";
        if (Constant.ENVIRONMENT_INDICATOR_LOCAL == environmentIndicator) {
            result = content.replace("src=\"", "src=\"");
        } else if (Constant.ENVIORNMENT_INDICATOR_PRODUCTION == environmentIndicator) {
            if (content.contains("iframe")) {
                result = content;
            } else {
                result = content
                        .replace("src=\"", "src=\"" + path)
                        .replace("href=\"", "href=\"" + path)
                        .replace("data-url=\"", "data-url=\"" + path)

                        .replace("src='", "src='" + path)
                        .replace("href='", "href='" + path)
                        .replace("data-url='", "data-url='" + path)
                ;
            }
        }
        return result;
    }


    public static void main(String args[]) throws Exception {
        String path = "/Users/zhengfucheng/Documents/workspace/sightcorner/target/sightcorner-1.0-SNAPSHOT/WEB-INF/classes/data/event/2016/README.md";
//                "/Users/zhengfucheng/Downloads/README.md";
                //"/Users/zhengfucheng/Documents/workspace/sightcorner/target/sightcorner-1.0-SNAPSHOT/WEB-INF/classes/data/event/2016/event_2016_11_13.sc";
        InputStream is = new FileInputStream(new File(path));

        BufferedReader bufferedReader = null;
        StringBuffer content = new StringBuffer();
        bufferedReader = new BufferedReader(
                new InputStreamReader(
                        is, "UTF-8"
                )
        );

        String tmp;
        while (null != (tmp = bufferedReader.readLine())) {
            System.out.println(tmp);
        }
    }


    /**
     * @author Aaron
     * @contact fucheng.zheng@gmail.com
     * @create 2013-6-7
     * @history
     */
    public static String getFileContent(String path, ContentHandler handler) {
        BufferedReader bufferedReader = null;
        StringBuffer content = new StringBuffer();
        try {
            String tmp = "";
            bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            InitController.class.getResourceAsStream(path), "UTF-8"
                    )
            );
            List<String> list = new ArrayList<String>();
            boolean isBlock = false;
            while (null != (tmp = bufferedReader.readLine())) {
                if (tmp.indexOf(Constant.PREFIX_HTML) >= 0) {
                    if (tmp.indexOf(Constant.SUFFIX_HTML) > 0) {//html start and end in same line
                        handler.lineHandleWithHTML(content, tmp);
                    } else {
                        list.add(tmp);
                        isBlock = true;
                    }
                } else if (isBlock) {
                    if (tmp.indexOf(Constant.SUFFIX_HTML) >= 0) {
                        list.add(tmp);
                        handler.blockHandle(content, list);
                        isBlock = false;
                        list = new ArrayList<String>();
                    } else {
                        tmp = HtmlUtils.htmlEscape(tmp);
                        list.add(tmp);
                    }
                } else {
                    handler.lineHandle(content, tmp);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return content.toString();
    }

    /**
     * @author Aaron
     * @contact fucheng.zheng@gmail.com
     * @create 2013-6-7
     * @history
     */
    public static String getComponent(String path) {
        StringBuffer out = new StringBuffer();
        BufferedReader reader = null;
        InputStreamReader read = null;
        try {
            String temp = InitController.class.getResource("/").getPath();
            String websiteUrl = temp.replace("/classes", "").replace("%20", " ") + "/pages/component/" + path;
            read = new InputStreamReader(
                    new FileInputStream(websiteUrl), "UTF-8");
            reader = new BufferedReader(read);
            String line;
            while ((line = reader.readLine()) != null) {
                out.append(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                read.close();
                reader.close();
            } catch (IOException e) {

            }
        }
        return out.toString();
    }


}

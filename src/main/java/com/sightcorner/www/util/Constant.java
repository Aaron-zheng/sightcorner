package com.sightcorner.www.util;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

import com.sightcorner.www.vo.ArchiveVO;
import com.sightcorner.www.vo.MeaningVO;
/**
 * 
 * @author Aaron
 * @contact fucheng.zheng@gmail.com
 * @create 2013-6-7
 * @history 
 *
 */
public class Constant {
	
	public static final int ENVIRONMENT_INDICATOR_LOCAL = 1;
	public static final int ENVIORNMENT_INDICATOR_PRODUCTION = 2;
	public static final int CURRENT_ENVIRONMENT_INDICATOR = ENVIORNMENT_INDICATOR_PRODUCTION;
	
	public static final Pattern ARTICLE_IMAGE_PATTERN = Pattern.compile("sightcorner-\\d+");
	public static final Pattern EVENT_IMAGE_PATTERN = Pattern.compile("\\d{4}_\\d{2}_\\d{2}.*");
	public static final Pattern ORDER_PATTERN = Pattern.compile("\\d{1,2}\\..*");
	
	public static final String PREFIX_HTML = "<pre>";
	public static final String SUFFIX_HTML = "</pre>";
	
	public static final String DATA_FILE="/data";
	
	public static final TreeMap<String, ArchiveVO> EVENT_SINGLE_MAP=new TreeMap<String, ArchiveVO>();
	public static final TreeMap<String, ArchiveVO> ARTICLE_SINGLE_MAP=new TreeMap<String, ArchiveVO>();
	public static final TreeMap<String, ArchiveVO> TECHNIQUE_SINGLE_MAP=new TreeMap<String, ArchiveVO>();
	public static final Map<String, MeaningVO> MEANING_SINGLE_MAP=new LinkedHashMap<String, MeaningVO>();
	public static final Map<String, String> ALBUM_SINGLE_MAP=new LinkedHashMap<String, String>();
	public static final LinkedHashMap<String, String> ALBUM_LIE_DOWN_ANGLE=new LinkedHashMap<String, String>();
	static{
		//article
		ARTICLE_SINGLE_MAP.put("2009_08", new ArchiveVO("上海-苏州-周庄-西塘-乌镇-杭州", "OH, year!第一次的旅游啊，第一次搭那么远火车的旅游，两个背包客上路了。...", "我们的第一次大旅游","114"));
		ARTICLE_SINGLE_MAP.put("2009_10", new ArchiveVO("海南-三亚-蜈支洲岛", "国庆长假，我们的第二次旅游。出发海南了。不过提早十天买火车票，发现火车票已经卖光光了...", "背包之旅Take2","40"));
		ARTICLE_SINGLE_MAP.put("2010_01", new ArchiveVO("北京-哈尔滨-雪乡-蚌埠-黄山-南昌", "放寒假，火车票不好买，经历过海南之旅，我们懂得了要错开高峰期买火车票...", "计划最久时间跨度最大的背包旅行","61"));
		ARTICLE_SINGLE_MAP.put("2010_08", new ArchiveVO("上海-世博会", "世博会，圈宝儿一直吵了要去，但是暑假时间都在跟着老师做项目...", "最急速的旅行","46"));
		ARTICLE_SINGLE_MAP.put("2010_10", new ArchiveVO("桂林-龙脊梯田-漓江-西街", "十一拉又到十一啦，众所周知，到十一，火车票就是一票难求啊，坑爹的火车票啊。...", "发掘梯田发掘自然之旅启程","59"));
		ARTICLE_SINGLE_MAP.put("2011_02", new ArchiveVO("西安-壶口-嵩山少林-白马寺-龙门石窟", "主页君偷懒了，看图片想故事的发生吧。", "...","69"));
		ARTICLE_SINGLE_MAP.put("2011_06", new ArchiveVO("厦门-鼓浪屿", "依旧是以火车开始我们的旅程，到达了厦门的一刻，倒模般的高楼大厦，络绎的人群，实在很难...", "做一只慵懒的猫咪悠闲之旅","55"));
		ARTICLE_SINGLE_MAP.put("2011_09", new ArchiveVO("成都-乐山大佛-峨眉山-九寨沟-重庆", "主页君偷懒了，看图片想故事的发生吧。", "...","83"));
		ARTICLE_SINGLE_MAP.put("2012_02", new ArchiveVO("凤凰-张家界-长沙", "“K9064，14：06”，16小时后的我们将会在这个湘西古镇渡过学生生涯的最后一次电波之旅。...", "这不是最后一次的电波之旅你答应过的","52"));
		ARTICLE_SINGLE_MAP.put("2012_09", new ArchiveVO("贵州-黄果树瀑布-西江千户苗寨", "毕业后工作的第一个长假——国庆假，23小时卧铺，4年前26小时硬座的勇气随着年龄增长已经不知道逃到哪里。...", "最终还是躲不过人满为患","69"));
		ARTICLE_SINGLE_MAP.put("2013_04", new ArchiveVO("泰国-芭提雅-曼谷-清迈-拜县", "2013年4月9号，这次，是我们第一次出国啊！一直从别人口中听到国外的世界的花花绿绿，到现在正式踏出国门，感谢主，让我们开始认识世界。...", "第一次自由行走出国门Thailand我们来了","106"));
		ARTICLE_SINGLE_MAP.put("2013_11", new ArchiveVO("暹粒-吴哥窟-西哈努克港-金边","刚下飞机时，tutu司机问我们来自新加坡还是日本，到我们启程回归祖国那天，tutu司机问我们是菲律宾人还是越南人。这趟旅程到底是晒得有多凶狠，到底被旅行成啥样了...","高棉的朴实微笑","88"));
		ARTICLE_SINGLE_MAP.put("2014_04", new ArchiveVO("西宁-青海-敦煌-兰州","出发的时候，广州就开始下大雨，机场开始播报延迟起机的消息...","满满的都是特别的人和事","101"));
		ARTICLE_SINGLE_MAP.put("2015_03", new ArchiveVO("河内-岘港-会安-芽庄-大叻-美奈-西贡","第一站河内，飞机是小飞机啦，不过南航好好地帮我们升级了机位...","","0"));
		//event
		EVENT_SINGLE_MAP.put("2012_09_15", new ArchiveVO("爱国需要抵制蠢货而不仅是日货", "2012年9月14号，中国6艘海监船抵达钓鱼岛..."));
		EVENT_SINGLE_MAP.put("2012_09_16", new ArchiveVO("要么滚回去，要么拼命", "当想要放弃的时候，想一下你的梦想，成真是需要你的奋斗的..."));
		EVENT_SINGLE_MAP.put("2012_10_03", new ArchiveVO("驴友们的开山祖师爷其实是—徐霞客", "在贵阳的黄果树大瀑布中，发现了徐霞客的身影..."));
		EVENT_SINGLE_MAP.put("2012_10_05", new ArchiveVO("广州公交车也应该有自己的特色", "广州公交车也应该有自己的特色..."));
		EVENT_SINGLE_MAP.put("2012_10_06", new ArchiveVO("旅行不分穷富，走着自己的旅途中", "这次十一的贵阳旅游，出发是火车票，回来是飞机票..."));
		EVENT_SINGLE_MAP.put("2012_10_25", new ArchiveVO("精心设计界面被ban了，哎呀呀", "奋身去做了，做了我不擅长既设计，做了很久..."));
		EVENT_SINGLE_MAP.put("2012_11_01", new ArchiveVO("《财富》江山代有才俊出", "中国新一代互联网英雄们纷纷踏入四字头，今年评选出的40岁以下精英只有2个中国面孔..."));
		EVENT_SINGLE_MAP.put("2012_11_07", new ArchiveVO("Elance，Java到达top20%", "周末的时候无聊，上了很久没上了elance，看着JAVA..."));
		EVENT_SINGLE_MAP.put("2012_12_12", new ArchiveVO("终于完成第一个项目，好想去台湾吖", "终于成功做了第一个project啦，好耐无写日记啦..."));
		EVENT_SINGLE_MAP.put("2012_12_25", new ArchiveVO("圣~诞~快~乐~吖 mini8", "最近看到有一段话：“当你不去旅行，不去冒险..."));
		EVENT_SINGLE_MAP.put("2013_01_01", new ArchiveVO("不做小肥羊的羊，更不做肯德基的鸡", "2013年到啦，新年到啦，2012年12月21号世界末日就感过左拉..."));
		EVENT_SINGLE_MAP.put("2013_01_04", new ArchiveVO("201314", "201314，感谢圈宝儿你一直陪着我度过，很庆幸..."));
		EVENT_SINGLE_MAP.put("2013_01_10", new ArchiveVO("爸爸妈妈原来已经老了那么多", "最近在忙一点签证的事，再填写起家人的出生年月的时候..."));
		EVENT_SINGLE_MAP.put("2013_01_24", new ArchiveVO("Hong Kong QlikView Training", "4日的Training，YO~YO~YO..."));
		EVENT_SINGLE_MAP.put("2013_02_06", new ArchiveVO("爬虫Cralwer4j", "最近自己写了个爬虫crawler，赚了10美元呢..."));
		EVENT_SINGLE_MAP.put("2013_02_09", new ArchiveVO("年29，农历新年来啦", "今年2012年无年30，所以年29就系最后一日啦，宝儿去左香港过，又系得翻我一个啦..."));
		EVENT_SINGLE_MAP.put("2013_03_09", new ArchiveVO("第一台入手既单反 Canon650D", "其实呢，想买单反好耐啦，储左好耐既钱，之前一直叫宝儿同我去..."));
		EVENT_SINGLE_MAP.put("2013_03_21", new ArchiveVO("老婆破蛋日", "今日系老婆宝儿既破蛋日啦，本身呢今日就林住去长隆玩噶..."));
		EVENT_SINGLE_MAP.put("2013_03_26", new ArchiveVO("九把刀&方所", "今日系宝儿同学的拉扯下，终于去了楼下的方所，终于见到传说中既九把刀..."));
		EVENT_SINGLE_MAP.put("2013_04_27", new ArchiveVO("致我们终将逝去的青春", "这部电影，我就是冲着名字去的，对于许多人来说，青春其实说白了就是一场喜剧和悲剧的混合体..."));
		EVENT_SINGLE_MAP.put("2013_05_16", new ArchiveVO("Google I/O 2013", "这次是我第一次及时观看Google I/O的大会，说实话，有点激动..."));
		EVENT_SINGLE_MAP.put("2013_05_18", new ArchiveVO("吖琪新婚快乐啊", "吖琪成为了我们高中班里面最早结婚的一个了，祝福新婚愉快啊..."));
		EVENT_SINGLE_MAP.put("2013_05_22", new ArchiveVO("Mobile Banking Innovation", "GLTc开展了一个Mobile Banking Innovation..."));
		EVENT_SINGLE_MAP.put("2013_07_18", new ArchiveVO("所谓的碎片时间", "每天不停地幻想着，想去旅行，想要赚钱，想买苹果，想做创新，想到产业，想起家人，想..."));
		EVENT_SINGLE_MAP.put("2013_07_29", new ArchiveVO("是什么打破了你的梦想", "经常会听到很多人的想多年梦想：想做画家，想做设计师，想做发明家..."));
		EVENT_SINGLE_MAP.put("2013_08_01", new ArchiveVO("反叛的鲁路修", "这段日子，突然看起了..."));
		EVENT_SINGLE_MAP.put("2013_08_02", new ArchiveVO("当临时面试官的感想", "最近我们团队招人，因为boss大大去了UK，这边只剩下一个面试官..."));
		EVENT_SINGLE_MAP.put("2013_08_03", new ArchiveVO("食货们的英语水平", "见证英语的时刻到了，让我们测试一下，你的英语到底过关了么..."));
		EVENT_SINGLE_MAP.put("2013_08_05", new ArchiveVO("人生只有900个月", "很久很久很久以前，一直在想人生究竟是不是真的有尽头..."));
		EVENT_SINGLE_MAP.put("2013_08_10", new ArchiveVO("怀旧看似是一种时代病", "上一年走出大学校门，到现在刚好工作满一年，偶尔也会失神转过头往回看..."));
		EVENT_SINGLE_MAP.put("2013_08_21", new ArchiveVO("Business term", "The TOR of the TOM is WIP, but based on the pilot's PIR..."));
		EVENT_SINGLE_MAP.put("2013_09_21", new ArchiveVO("我就係Mr.", "蹭着宝儿的福，出发去看演唱会！..."));
		EVENT_SINGLE_MAP.put("2013_09_25", new ArchiveVO("HSDC Toastmaster", "第一次参加..."));
		EVENT_SINGLE_MAP.put("2013_10_02", new ArchiveVO("老鼠莹新婚快乐", "四朵金花，接到第三棒拉..."));
		EVENT_SINGLE_MAP.put("2013_10_13", new ArchiveVO("人到老年", "最近看新闻，有篇报道些写的是，人到老的时候，不怕死，怕的是老无所依。..."));
		EVENT_SINGLE_MAP.put("2013_10_17", new ArchiveVO("于娟的《为啥是我得癌症？》", "近日读起了复旦女博士于娟：《为啥是我得癌症？》，使我反复思考生命的长短真的是你所想象的那么简单么..."));
		EVENT_SINGLE_MAP.put("2013_10_20", new ArchiveVO("环境的腹黑", "啥是环境的腹黑，就是：买着世界最贵的房子，开着世界最贵的车子，加着上涨最快的汽油，吃着世界最不安全的食品..."));
		EVENT_SINGLE_MAP.put("2013_10_24", new ArchiveVO("健康像列车", "你很有钱，但你的生命可以用钱衡量么？ ..."));
		EVENT_SINGLE_MAP.put("2013_10_29", new ArchiveVO("Test Management Open Talk", "似是而非的Test management故事，而你是什么角色..."));
		EVENT_SINGLE_MAP.put("2013_10_30", new ArchiveVO("R&R Team Award", "全Team人的努力，终于在3Q的时候有回报了，我们成功获得了3Q团体奖。Cooooool！..."));
		EVENT_SINGLE_MAP.put("2013_11_02", new ArchiveVO("长隆万圣节", "万圣节到啦，中国的农历七月鬼节是要处处谨慎小心，而西方的万圣节则是一个鬼马神秘而又欢乐的节日..."));
		EVENT_SINGLE_MAP.put("2013_11_09", new ArchiveVO("说话的艺术", "前一秒还是我爱你，后一秒就转身拜拜不带走一丝云彩。你走的潇洒，我还呆在原地，默默地想着究竟为什么我会站在这里..."));
		EVENT_SINGLE_MAP.put("2013_12_04", new ArchiveVO("在死之前，我想要", "Before I die, I want to..."));
		EVENT_SINGLE_MAP.put("2013_12_05", new ArchiveVO("出生", "每个人从细胞开始到真正呼吸着外来的空气，都背着有上一代人的故事..."));
		EVENT_SINGLE_MAP.put("2013_12_06", new ArchiveVO("Risk", "刚刚毕业的时候，同学亲戚朋友都会问我哪里工作，我回答银行软件部做风险，得到的反应往往都是不解、疑惑、神秘和莫名其妙..."));
		EVENT_SINGLE_MAP.put("2013_12_10", new ArchiveVO("我的桌子", "2013年就快接近尾声了，终于完成今年愿望，买了一个苹果奖励自己..."));
		EVENT_SINGLE_MAP.put("2013_12_18", new ArchiveVO("家庭小旅游", "很久很久，没和家里人一起出动了，最上一次居然是爸爸妈妈陪我去看病的时候..."));
		EVENT_SINGLE_MAP.put("2014_01_01", new ArchiveVO("2014跨年倒数", "话说新年，谁陪你跨越2013年到2014年，那个人则能陪你一生一世，节日真得很多很多，多到都不能预计了..."));
		EVENT_SINGLE_MAP.put("2014_01_18", new ArchiveVO("一起开工社区", "一起(Yi-Gather)” 开工社区是目前广州最大的联合办公空间（co-working space），于2013年10月正式对外开放。..."));
		EVENT_SINGLE_MAP.put("2014_02_20", new ArchiveVO("伪心灵鸡汤", "最近一天都被刷屏幕，facebook用接近1/10的市值190亿美金收购了whatsapp。..."));
		EVENT_SINGLE_MAP.put("2014_03_21", new ArchiveVO("生日快乐", "这个背影呢，就是和我拖了5年的圈圈小朋友啦，背影还是不错的，当然正面也ok的啦！..."));
		EVENT_SINGLE_MAP.put("2014_03_27", new ArchiveVO("一起开工社区2.0", "2.0全新空间！！！等我post照啦！！！..."));
		EVENT_SINGLE_MAP.put("2014_04_06", new ArchiveVO("一个酱油志愿者眼中的‘晒广州’", "首先在进入文章前呢，我要用3秒解释下什么是‘晒广州’..."));
		EVENT_SINGLE_MAP.put("2014_05_13", new ArchiveVO("再次挑战Mr.X", "继上次挑战第二关天使岛，超失望的情绪后，今次我们再次原班人马去挑战第一关..."));
		EVENT_SINGLE_MAP.put("2014_05_16", new ArchiveVO("Risk Strategy Team Build", "我是这次活动的记录者，现在正式开波去片回播..."));
		EVENT_SINGLE_MAP.put("2014_05_31", new ArchiveVO("一起开瓶0531", "一起开瓶，创变者计划，你准备好了么..."));
		EVENT_SINGLE_MAP.put("2014_06_07", new ArchiveVO("一起开瓶0607", "IDEO，一个领先全球的设计与商务创新公司，今天开课了..."));
		EVENT_SINGLE_MAP.put("2014_06_08", new ArchiveVO("一起开瓶0608", "设计思维工作坊..."));
		EVENT_SINGLE_MAP.put("2014_06_09", new ArchiveVO("一起开瓶0609", "如何讲故事，衷声，人物周刊编辑..."));
		EVENT_SINGLE_MAP.put("2014_06_28", new ArchiveVO("一起开瓶0628", "今天由郭洪伟给我们上小米路由器的设计课..."));
		EVENT_SINGLE_MAP.put("2014_06_29", new ArchiveVO("一起嘉年华", "好吧，突然就跟你说这里是嘉年华..."));
		EVENT_SINGLE_MAP.put("2014_08_11", new ArchiveVO("香港奶粉传销", "这个是发生在我自己身上的故事，差点被骗了..."));
		EVENT_SINGLE_MAP.put("2014_08_15", new ArchiveVO("豆比Joy小伙伴拜拜", "若旧有记忆不可以用慢镜拍低，随时代变迁快乐流逝..."));
		EVENT_SINGLE_MAP.put("2014_08_27", new ArchiveVO("仓鼠新婚快乐", "第二个高中同学结婚啦..."));
		EVENT_SINGLE_MAP.put("2014_09_21", new ArchiveVO("和爸爸妈妈北京行", "小时候，北京，对于一个生在南方的人来说..."));
		EVENT_SINGLE_MAP.put("2014_10_01", new ArchiveVO("大学同学结婚了又", "十月一号，阳江。大学同学结婚，一直在路上。..."));
		EVENT_SINGLE_MAP.put("2014_10_15", new ArchiveVO("喜窝的一些事一些情", "话说这个故事很长很长。有人在朋友圈说那个..."));
		EVENT_SINGLE_MAP.put("2014_10_26", new ArchiveVO("TOGAF培训", "四天的TOGAF小分队结束了..."));
		EVENT_SINGLE_MAP.put("2014_11_01", new ArchiveVO("Risk Strategy Team build", "好久没组织team build活动了..."));
		EVENT_SINGLE_MAP.put("2014_12_12", new ArchiveVO("HSBC E2E SA", "有幸参加了汇丰的4.5个月（快接近5个月，18周）的 End to End Program，这是一个针对 Solution Architect的program..."));
		EVENT_SINGLE_MAP.put("2014_12_20", new ArchiveVO("广州谷歌开发者社区DevFest2014", "第一次由参与者到志愿者到组织者的尝试，虽然昨天晚上我们五人还手忙脚乱着，今天也突发各种状况，而且也只有三天的时间准备和宣传，最后完成惊天逆袭，接近百人的出席率..."));
		EVENT_SINGLE_MAP.put("2015_01_15", new ArchiveVO("小分队清心火锅去", "小分队出发。这次的目的地到达了清心..."));
		EVENT_SINGLE_MAP.put("2015_01_16", new ArchiveVO("Global Risk Annual Dinner", "#Global Risk# #1.16 250人# 第一次我们的Annual dinner..."));
		EVENT_SINGLE_MAP.put("2015_01_17", new ArchiveVO("一起的一周年庆", "一起二期。这里已经由原先的三四层发展到现在的打通地面一二层。这里已经变大了。一年的时间，这里已经发生了很多的改变了。望着第一次到来的一起二期，感觉有点点陌生之余，又有点点的兴奋..."));
		EVENT_SINGLE_MAP.put("2015_02_22", new ArchiveVO("谷歌北京峰会", "凌晨到达北京，出发的时候就经历了很多了..."));
		EVENT_SINGLE_MAP.put("2015_05_28", new ArchiveVO("Google I/O 2015 广州直播夜", "广州直播活动..."));
		EVENT_SINGLE_MAP.put("2015_06_07", new ArchiveVO("中澳千禧计划5天悉尼之旅", "流水账般纪录发生在5.30到6.7的事和遇见的人，感谢遇见你们..."));
		EVENT_SINGLE_MAP.put("2015_07_12", new ArchiveVO("广州GDG技术分享会", "Google的胡坤特意从香港赶到广州..."));
		EVENT_SINGLE_MAP.put("2015_07_25", new ArchiveVO("1200bookshop的新西兰打工假期分享会", "演讲者一共做了10份工，有苹果工 生蚝工 泰国餐厅 拾番茄..."));
		EVENT_SINGLE_MAP.put("2015_07_26", new ArchiveVO("Google I/O Recap", "今天有2个cardboard和1个android wear现场玩..."));
		EVENT_SINGLE_MAP.put("2015_08_15", new ArchiveVO("双月湾", "住宿都是出发前一晚搞定的，所以对这次行程感到好兴奋啊！！！YOYOYO！！！..."));
		EVENT_SINGLE_MAP.put("2015_08_28", new ArchiveVO("欢送能哥和弗兰克", "To 你们..."));
		EVENT_SINGLE_MAP.put("2015_09_08", new ArchiveVO("广州3W咖啡 广州羊城同创汇 入孵开幕式", "因为3W的邀请，所以去参加了广州羊城同创汇入孵开幕式，地址在这个旧羊城晚报的旧址..."));
		EVENT_SINGLE_MAP.put("2015_10_08", new ArchiveVO("卢卡斯新婚快乐，我第一次做婚礼主持人", "恭喜卢卢同小钰，新婚大快乐啊，第一次发现卢卢可以有那么滑顺的皮肤，小钰靓爆镜的说..."));
		EVENT_SINGLE_MAP.put("2015_11_15", new ArchiveVO("我与树莓在纽村打工旅行第1周(11.12~11.15)", "11.11 凌晨的时候，相信很多人都在做一样事情，打开淘宝，购物车，付款。..."));
		EVENT_SINGLE_MAP.put("2015_11_22", new ArchiveVO("我与树莓在纽村打工旅行第2周(11.16~11.22)", "在奥克兰生活了4天，就搭捷星飞皇后镇 (Queenstown)，抱着在新西兰南岛会比较容易找到季节工的念头..."));
		EVENT_SINGLE_MAP.put("2015_11_29", new ArchiveVO("我与树莓在纽村打工旅行第3周(11.23~11.29)", "开车到达，瓦纳卡 (Wanaka)，在来的路上，我已经格外努力了，还是经常被人超车。用了几天时间才习惯..."));
		EVENT_SINGLE_MAP.put("2015_12_06", new ArchiveVO("我与树莓在纽村打工旅行第4周(11.30~12.06)", "这周出发去我们心愿之一的特卡波镇 (Tekapo)，做两样事情。第一个是看鲁冰花，第二个是夜晚观星星..."));
		EVENT_SINGLE_MAP.put("2015_12_13", new ArchiveVO("我与树莓在纽村打工旅行第5周(12.07~12.13)", "但尼丁 (达尼丁 / Dunedin) 的路上，会经过摩拉基 (Moeraki)。每当海水退潮的时候，这些巨大的圆石头就会露出海面..."));
		EVENT_SINGLE_MAP.put("2015_12_20", new ArchiveVO("我与树莓在纽村打工旅行第6周(12.14~12.20)", "跌宕起伏的樱桃工，过上了有米的生活了..."));
		EVENT_SINGLE_MAP.put("2015_12_27", new ArchiveVO("我与树莓在纽村打工旅行第7周(12.21~12.27)", "新西兰的圣诞节，和中国的圣诞节是有天大区别。..."));
		EVENT_SINGLE_MAP.put("2016_01_03", new ArchiveVO("我与树莓在纽村打工旅行第8周(12.28~01.03)", "樱桃包装工的日子，和地球最早的2016年的来临..."));
		EVENT_SINGLE_MAP.put("2016_01_10", new ArchiveVO("我与树莓在纽村打工旅行第9周(01.04~01.10)", "踏上我们心愿之一的摘(吃)樱桃之旅，逛魔戒之称的格林诺奇..."));
		EVENT_SINGLE_MAP.put("2016_01_17", new ArchiveVO("我与树莓在纽村打工旅行第10周(01.11~01.17)", "摘了两星期的樱桃，果园结束了。超级大型的老爷车展，只有想不到，没有见不到的车型..."));
		EVENT_SINGLE_MAP.put("2016_01_24", new ArchiveVO("我与树莓在纽村打工旅行第11周(01.18~01.24)", "自从摘樱桃结束后，我们就开始花时间在克伦威尔 (Cromwell) 这个小镇上的徒步径了..."));
		EVENT_SINGLE_MAP.put("2016_01_31", new ArchiveVO("我与树莓在纽村打工旅行第12周(01.25~01.31)", "樱桃工的内（黑）幕爆料，不知不觉地与《打工旅行》男神见面了..."));
		EVENT_SINGLE_MAP.put("2016_02_07", new ArchiveVO("我与树莓在纽村打工旅行第13周(02.01~02.07)", "赛羊比赛，樱桃山上的大年30和年初一..."));
		EVENT_SINGLE_MAP.put("2016_02_14", new ArchiveVO("我与树莓在纽村打工旅行第14周(02.08~02.14)", "我居然中了200刀。曾经创造过吉尼斯纪录的胸罩墙。走瓦纳卡最美的徒步径，差点走不下去了。接待树莓的好姐妹。..."));
		EVENT_SINGLE_MAP.put("2016_02_21", new ArchiveVO("我与树莓在纽村打工旅行第15周(02.15~02.21)", "第一次近距离经历地震（里氏5.7级）。海边180度图书馆。羊屎遍地的徒步径。..."));
		EVENT_SINGLE_MAP.put("2016_02_28", new ArchiveVO("我与树莓在纽村打工旅行第16周(02.22~02.28)", "收割洋葱花，捡蒜的日子。从骨子里嗅出的洋葱气息。..."));
		EVENT_SINGLE_MAP.put("2016_03_06", new ArchiveVO("我与树莓在纽村打工旅行第17周(02.29~03.06)", "葡萄园打杂。凯库拉路边吃龙虾。听老奶奶说捕鲸的小内幕。..."));
		EVENT_SINGLE_MAP.put("2016_03_13", new ArchiveVO("我与树莓在纽村打工旅行第18周(03.07~03.13)", "蒂姆卡 (Temuka)，一个有点像老人院的城市。在超市找复活蛋，最后发现..."));
		EVENT_SINGLE_MAP.put("2016_03_20", new ArchiveVO("我与树莓在纽村打工旅行第19周(03.14~03.20)", "我以为在跳伞，其实我只是被吊起来摘苹果..."));
		EVENT_SINGLE_MAP.put("2016_03_27", new ArchiveVO("我与树莓在纽村打工旅行第20周(03.21~03.27)", "被告知晚上摘苹果，表情傻掉了。关注儿童贫困问题..."));
		EVENT_SINGLE_MAP.put("2016_04_03", new ArchiveVO("我与树莓在纽村打工旅行第21周(03.28~04.03)", "摘苹果结束了。有人会把生命比作文章，因为文章比较的不是长短，而是内容。分离其实也是一样的道理..."));
		EVENT_SINGLE_MAP.put("2016_04_10", new ArchiveVO("我与树莓在纽村打工旅行第22周(04.04~04.10)", "佳沛奇异果厂，让我左手右手一个慢动作，教你挑选出最棒的奇异果..."));
		EVENT_SINGLE_MAP.put("2016_04_17", new ArchiveVO("我与树莓在纽村打工旅行第23周(04.11~04.17)", "中国人在新西兰过的泰国新年..."));
		EVENT_SINGLE_MAP.put("2016_04_24", new ArchiveVO("我与树莓在纽村打工旅行第24周(04.18~04.24)", "3天时间，24小时车程，南半球之秋，绚烂五彩林的箭镇。..."));
		EVENT_SINGLE_MAP.put("2016_05_01", new ArchiveVO("我与树莓在纽村打工旅行第25周(04.25~05.01)", "五一小长假，钓三文鱼，看号称世界上最清澈的泉水（能见度达63米）..."));
		EVENT_SINGLE_MAP.put("2016_05_08", new ArchiveVO("我与树莓在纽村打工旅行第26周(05.02~05.08)", "第26篇周记，半年来的感想。（图片比较少，文字有点多。）..."));
		EVENT_SINGLE_MAP.put("2016_05_15", new ArchiveVO("我与树莓在纽村打工旅行第27周(05.09~05.15)", "我和树莓，上上上了报纸头版（打字的手在震）。周末和小伙伴们去划艇，结果全身湿了..."));
		EVENT_SINGLE_MAP.put("2016_05_22", new ArchiveVO("我与树莓在纽村打工旅行第28周(05.16~05.22)", "和我一起工作的3个男人的故事。我和树莓的3小时面试之海鲜厂 Sealord..."));
		EVENT_SINGLE_MAP.put("2016_05_29", new ArchiveVO("我与树莓在纽村打工旅行第29周(05.23~05.29)", "早上在新西兰的南岛最北看海，晚上在24小时牛奶店喝牛奶。欢乐了一天，结果车子又踩狗屎了..."));
		EVENT_SINGLE_MAP.put("2016_06_05", new ArchiveVO("我与树莓在纽村打工旅行第30周(05.30~06.05)", "奇异果包装厂全方位揭秘，围炉夜话中度过莫图伊卡的最后一晚..."));
		EVENT_SINGLE_MAP.put("2016_06_12", new ArchiveVO("我与树莓在纽村打工旅行第31周(06.06~06.12)", "切鱼工作，上班第一天，右手拿刀，左手按着鱼，切下去。结果，鱼被我左手捏粉碎了，粉！碎！了！周六，和小伙伴们准备了一个惊喜生日趴，结果主角放飞机了..."));
		EVENT_SINGLE_MAP.put("2016_06_18", new ArchiveVO("我与树莓在纽村打工旅行番外篇(越南春卷)", "虽然每周会写一篇周记，但有时候觉得有些很有趣的东西，不是2、3张图可以表达的。如果遇到一些有趣的，好玩的，好吃的，就会开一个番外篇来写下。这篇是正宗越南春卷..."));
		EVENT_SINGLE_MAP.put("2016_06_19", new ArchiveVO("我与树莓在纽村打工旅行第32周(06.13~06.19)", "下班后，我都可以发现我的左右手，手筋都异常突出..."));
		EVENT_SINGLE_MAP.put("2016_06_26", new ArchiveVO("我与树莓在纽村打工旅行第33周(06.20~06.26)", "有时候做出抉择前，总是犹豫不决担心前路，而跳出舒适环境需要勇气，但请相信在新的地方，会有更好的事情发生..."));
		EVENT_SINGLE_MAP.put("2016_07_03", new ArchiveVO("我与树莓在纽村打工旅行第34周(06.27~07.03)", "貌似已经连续2个星期没更新了。最近一直在写代码开发，所以已经很久没写文字了。（树莓经常说我拿写代码做借口，不煮饭。哈哈，其实这才是我的计谋）..."));
		EVENT_SINGLE_MAP.put("2016_07_10", new ArchiveVO("我与树莓在纽村打工旅行第35周(07.04~07.10)", "和当地人住，有个好处就是可以贴近他们的生活。大卫出现在厨房，往往是来说笑话的，基本每次见到他都是笑哈哈的。而琼斯的话没有大卫的话多，她会负责两人的晚餐。偶尔琼斯也会烤饼干、熬蘑菇汤和弄蛋糕。我们也会幸福地蹭到吃的。..."));
		EVENT_SINGLE_MAP.put("2016_07_17", new ArchiveVO("我与树莓在纽村打工旅行第36周(07.11~07.17)", "尼尔森灯光节 (Light Nelson) 持续5晚。我和树莓每天晚上的活动，就是在逛下这个灯光节。下方高能量多图，请注意..."));
		EVENT_SINGLE_MAP.put("2016_07_19", new ArchiveVO("我与树莓在纽村打工旅行番外篇(精灵宝可梦GO)", "7月6号，Pokemon GO 在新西兰首发。满满的小时候回忆，树莓也玩疯了。（而我作为一个技术宅，开始研究，足不出户，捉小精灵。）..."));
		EVENT_SINGLE_MAP.put("2016_07_24", new ArchiveVO("我与树莓在纽村打工旅行第37周(07.18~07.24)", "延签小攻略，DIY 大头照..."));
		EVENT_SINGLE_MAP.put("2016_07_31", new ArchiveVO("我与树莓在纽村打工旅行第38周(07.25~07.31)", "1年1度的尼尔森夜市 (Nelson night market) 开始了，就只有这么1晚。感觉整个城市的人都突然空降在这里了..."));
		EVENT_SINGLE_MAP.put("2016_08_07", new ArchiveVO("我与树莓在纽村打工旅行第39周(08.01~08.07)", "不得不说，作为小编的我，生日啦！！！在新西兰度过我的生日，8月3号，我要对我的26岁说再见，从此踏进了27的年轮了..."));
		EVENT_SINGLE_MAP.put("2016_08_14", new ArchiveVO("我与树莓在纽村打工旅行第40周(08.08~08.14)", "工厂的工作是重复的，没有太多可以选择，只有生活是可以自己选择的。最近写的文章有点渣，这次写点额外的。写一下工作以外的工作，俗称应该是“兼职”..."));
		EVENT_SINGLE_MAP.put("2016_08_21", new ArchiveVO("我与树莓在纽村打工旅行第41周(08.15~08.21)", "经过一天下来，树莓的滑雪，已经大大提高了。放一段树莓的成功片段，而且片段最精彩在于最后的那一下急停，超级帅的噢。（一定要坚持看完啊！！！我至今还没学懂树莓这招超级刹停）..."));
		EVENT_SINGLE_MAP.put("2016_08_28", new ArchiveVO("我与树莓在纽村打工旅行第42周(08.22~08.28)", "特意飞去看无论怎么都要看一次的橄榄球赛，作为世仇的 新西兰VS澳大利亚，超级多图的 All Blacks ..."));
		EVENT_SINGLE_MAP.put("2016_09_04", new ArchiveVO("我与树莓在纽村打工旅行第43周(08.29~09.04)", "首先感谢各位朋友的关心！！！我和树莓一切安好，去了一个长途旅行（瓦努阿图，斐济，和汤加），都是一些南太平洋的岛屿国家，网络覆盖的地方不是太多，来不及写文章。不过现在，正式归来了！！..."));
		EVENT_SINGLE_MAP.put("2016_09_11", new ArchiveVO("我与树莓在纽村打工旅行第44周(09.05~09.11)", "送别周又到了。每一段工作，都会有一个期间，会突然泛起送别潮，这个说走，那个又要走，最后连欢送别人的自己都走了..."));
		EVENT_SINGLE_MAP.put("2016_09_18", new ArchiveVO("我与树莓在纽村打工旅行第45周(09.12~09.18)", "樱花节小体验..."));
		EVENT_SINGLE_MAP.put("2016_09_25", new ArchiveVO("我与树莓在纽村打工旅行第46周(09.19~09.25)", "出发去走著名的，亚伯塔斯曼海滨步道..."));
		EVENT_SINGLE_MAP.put("2016_10_02", new ArchiveVO("我与树莓在纽村打工旅行第47周(09.26~10.02)", "鳕鱼季终于要终结了。从6月开始做到了9月底，算下来也有4个月了。原来我和树莓呆在尼尔森 (Nelson) 已经4个月了，是时候做一个超级无敌鳕鱼厂大揭秘了..."));
		EVENT_SINGLE_MAP.put("2016_10_09", new ArchiveVO("我与树莓在纽村打工旅行第48周(10.03~10.09)", "南太平洋小岛国——瓦努阿图。在全球唯一的水底邮局邮寄明信片，跑去最最最亲近的活活活火山看上帝礼花。（全文达6000字，超多图。准备好就来看吧）..."));
		EVENT_SINGLE_MAP.put("2016_10_16", new ArchiveVO("我与树莓在纽村打工旅行第49周(10.10~10.16)", "终于到了斐济，吃了椰子蟹，度过斐济国庆日，呆在最远的外岛亚萨瓦岛 (Yasawa) 浮潜..."));
		EVENT_SINGLE_MAP.put("2016_10_23", new ArchiveVO("我与树莓在纽村打工旅行第50周(10.17~10.23)", "我和树莓苦练超久游泳，就是为了在 汤加 (Tonga) 和座头鲸 (Humpback Whale) 一起游泳，结果..."));
		EVENT_SINGLE_MAP.put("2016_10_30", new ArchiveVO("我与树莓在纽村打工旅行第51周(10.24~10.30)", "旅行完回来，隔天就开始新工作拔萝卜，结果连中介都做到亏钱不做了..."));
		EVENT_SINGLE_MAP.put("2016_11_06", new ArchiveVO("我与树莓在纽村打工旅行第52周(10.31~11.06)", "在不是奇异果季节，去了奇异果之乡蒂普基 (Te Puke) 做奇异果工作..."));
		EVENT_SINGLE_MAP.put("2016_11_13", new ArchiveVO("我与树莓在纽村打工旅行第53周(11.07~11.13)", "来，和大型奇异果拍照..."));
		EVENT_SINGLE_MAP.put("2016_11_20", new ArchiveVO("我与树莓在纽村打工旅行第54周(11.14~11.20)", "和树莓玩了2天后，她就飞回广州参加朋友的婚礼了，而我只能默默地呆在新西兰..."));
//		EVENT_SINGLE_MAP.put("2016_11_27", new ArchiveVO("我与树莓在纽村打工旅行第55周(11.21~11.27)", "..."));
//		EVENT_SINGLE_MAP.put("2016_12_04", new ArchiveVO("我与树莓在纽村打工旅行第56周(11.28~12.04)", "..."));
//		EVENT_SINGLE_MAP.put("2016_12_11", new ArchiveVO("我与树莓在纽村打工旅行第57周(12.05~12.11)", "..."));
//		EVENT_SINGLE_MAP.put("2016_12_18", new ArchiveVO("我与树莓在纽村打工旅行第58周(12.12~12.18)", "..."));
//		EVENT_SINGLE_MAP.put("2016_12_25", new ArchiveVO("我与树莓在纽村打工旅行第59周(12.19~12.25)", "..."));
//		EVENT_SINGLE_MAP.put("2016_01_01", new ArchiveVO("我与树莓在纽村打工旅行第60周(12.26~01.01)", "..."));
//		EVENT_SINGLE_MAP.put("2016_01_08", new ArchiveVO("我与树莓在纽村打工旅行第61周(01.02~01.08)", "..."));
//		EVENT_SINGLE_MAP.put("2016_01_15", new ArchiveVO("我与树莓在纽村打工旅行第62周(01.09~01.15)", "..."));
//		EVENT_SINGLE_MAP.put("2016_01_22", new ArchiveVO("我与树莓在纽村打工旅行第63周(01.16~01.22)", "..."));
//		EVENT_SINGLE_MAP.put("2016_01_29", new ArchiveVO("我与树莓在纽村打工旅行第64周(01.23~01.29)", "..."));

//		EVENT_SINGLE_MAP.put("", new ArchiveVO("", ""));
		
		//technique
		TECHNIQUE_SINGLE_MAP.put("2013_06_10", new ArchiveVO("星型数据库","数据仓库的建立是为了某群体提供决策服务的..."));
//		TECHNIQUE_SINGLE_MAP.put("2013_06_15", new ArchiveVO("中国合伙人片尾","中国合伙人片尾人物介绍：柳传志、马云、杨澜、俞敏洪..."));
		TECHNIQUE_SINGLE_MAP.put("2014_03_04", new ArchiveVO("微软翻译API使用教程","手上有一堆需要翻译的简单而又繁多的单词，因为我懒惰不想一个接一个翻译于是就写个翻译程序..."));
//		TECHNIQUE_SINGLE_MAP.put("2014_05_31", new ArchiveVO("解决Use the purchase page to try again","打开命令台..."));
		TECHNIQUE_SINGLE_MAP.put("2014_08_17", new ArchiveVO("发布者&订阅者模型","发布者和订阅者模型是软件架构中的消息模式..."));
//		TECHNIQUE_SINGLE_MAP.put("2014_08_21", new ArchiveVO("Pragmatic Software Architecture Design","..."));
		TECHNIQUE_SINGLE_MAP.put("2014_08_28", new ArchiveVO("Architectural Thinking - Introduction to Architecture","什么是Architecture？简单的工程只需要一个人搭建，只需要简单的过程和工具。而复杂的工程需要一个团队有效率去搭建...."));
		TECHNIQUE_SINGLE_MAP.put("2014_08_30", new ArchiveVO("用户设计体验", "交互设计可以由三方面入手，设计分析，设计实践和设计评估..."));
		TECHNIQUE_SINGLE_MAP.put("2014_09_03", new ArchiveVO("Architectural Thinking - The Rational Unified Process", "Software Development Methodologies..."));
		TECHNIQUE_SINGLE_MAP.put("2014_10_07", new ArchiveVO("Architectural Thinking - Architectural Views", "4+1 view model..."));
		TECHNIQUE_SINGLE_MAP.put("2014_10_08", new ArchiveVO("Architectural Thinking - Documenting Architectures", "Recognize and identify additional architecture documentation views that can complement or replace 4+1 views..."));
		TECHNIQUE_SINGLE_MAP.put("2014_10_21", new ArchiveVO("Architectural Thinking - Architecture Governance", "Architecture governance: Define IT governance and its most common models. Define architecture governance elements and its key enforcement structures..."));
		TECHNIQUE_SINGLE_MAP.put("2014_10_28", new ArchiveVO("Architectural Thinking - Architectural Artifacts in the Enterprise", "what are enterprise architectural artifacts..."));
		TECHNIQUE_SINGLE_MAP.put("2014_11_10", new ArchiveVO("Architectural Thinking - Architecture Modeling", "Three leading OO notations decide to combine..."));
		TECHNIQUE_SINGLE_MAP.put("2015_01_04", new ArchiveVO("Sketch的1-7天设计历程","完成了两个设计，一个是登陆页面的，另外一个是主页，感觉自己的设计有点..."));
//		TECHNIQUE_SINGLE_MAP.put("2015_01_17", new ArchiveVO("Sketch的8-14天设计历程","..."));
		TECHNIQUE_SINGLE_MAP.put("2015_03_30", new ArchiveVO("China Australia CAMP - Milestone 1 Orientation 导览","3月14号受到被选中参加中澳千禧计划的一份子。异常开心..."));
		TECHNIQUE_SINGLE_MAP.put("2015_04_06", new ArchiveVO("China Australia CAMP - Milestone 2 Discover 发现","你的项目团队是时候开始开始创新了。第一步就是了解你们的问题空间和具体挑战..."));
//		TECHNIQUE_SINGLE_MAP.put("2015_04_13", new ArchiveVO("China Australia CAMP - Milestone 3 Ideate 构想","..."));
//		TECHNIQUE_SINGLE_MAP.put("2015_04_20", new ArchiveVO("China Australia CAMP - Milestone 4 Develop 发展","..."));
//		TECHNIQUE_SINGLE_MAP.put("2015_04_27", new ArchiveVO("China Australia CAMP - Milestone 5 Deliver 交付","..."));
//		TECHNIQUE_SINGLE_MAP.put("2015_05_04", new ArchiveVO("China Australia CAMP - Milestone 6 Follow Up 跟进","..."));
		TECHNIQUE_SINGLE_MAP.put("2015_08_09", new ArchiveVO("非功能性需求分析","今年开始做了系统分析师，之前带队做项目的时候主要是..."));
//		TECHNIQUE_SINGLE_MAP.put("2015_09_15", new ArchiveVO("企业型系统灾难恢复", "一般来说，一些比较大的企业都会需要灾难性恢复计划的..."));
//		TECHNIQUE_SINGLE_MAP.put("2016_03_17", new ArchiveVO("Material Design 学习心得", "..."));
		TECHNIQUE_SINGLE_MAP.put("2016_06_08", new ArchiveVO("设计手机 APP 时应该避免的6种问题","Google IO 2016 的其中一场关于设计的视频..."));
		TECHNIQUE_SINGLE_MAP.put("2016_06_19", new ArchiveVO("Google Material Design 学习和移动端的实践1（颜色）","每一个应用，包括网页或者是手机 App 都应该有一套属于自己的风格的，而风格的直接反映其实就是颜色方案..."));
		TECHNIQUE_SINGLE_MAP.put("2016_06_25", new ArchiveVO("Google Material Design 学习和移动端的实践2（基线和间距）","DPI 的计算公式：DPI = 屏幕的像素宽度 / 屏幕的英寸宽度 [DPI = screen width (or height) in pixel / screen width (or height) in inches]..."));
		TECHNIQUE_SINGLE_MAP.put("2016_07_08", new ArchiveVO("顶级架构师的6个秘密","晚上听了1小时的在线讲座 Six secrets of top Enterprise Architect。演讲者是一个有多年经验的架构师..."));
		TECHNIQUE_SINGLE_MAP.put("2016_07_17", new ArchiveVO("模拟 Mac 的鼠标点击","模拟在 Mac 的鼠标点击，主要是通过 .sh 文件控制鼠标移动，然后通过 Python 文件来控制循环..."));
		TECHNIQUE_SINGLE_MAP.put("2016_08_24", new ArchiveVO("腾讯品牌视觉识别的统一性","腾讯 ISUX 团队发布了4个产品的品牌书..."));
		TECHNIQUE_SINGLE_MAP.put("2016_09_04", new ArchiveVO("TensorFlow 在 Mac 下的初体验", "最近在看内部文档的 \"How can you get started with machine learning\" 的时候，看到了 TensorFlow。于是就想去接触一下..."));
		TECHNIQUE_SINGLE_MAP.put("2016_10_25", new ArchiveVO("黑产业白皮书读后感", "朋友推荐，所以特意用了2天时间很快的把这个“黑产白皮书”都浏览一次。在看这本书之前，我一直认为所谓的黑产不外乎什么盗号或者广告的。看完之后，才发现之前的自己真的是 too young too simple..."));
		TECHNIQUE_SINGLE_MAP.put("2017_02_02", new ArchiveVO("java.lang.Object 的默认方法", "java.lang.Object..."));
		TECHNIQUE_SINGLE_MAP.put("2017_02_04", new ArchiveVO("MySQL安装和创建表时候的知识点", "官网下载，选择 download->community->mysql-x.x.x-macos_64.dmg..."));
		TECHNIQUE_SINGLE_MAP.put("2017_02_06", new ArchiveVO("高并发秒杀的简单优化", "用户大量刷新..."));
		TECHNIQUE_SINGLE_MAP.put("2017_02_07", new ArchiveVO("安装Redis", "上官网 https://redis.io/ 选择稳定的版本下载..."));
//		TECHNIQUE_SINGLE_MAP.put("2017_02_08", new ArchiveVO("Capability-Based Planning: The Link between Strategy and Enterprise Architecture", "..."));
        TECHNIQUE_SINGLE_MAP.put("2017_02_14", new ArchiveVO("Class 类文件结构", "Class 文件是以8位字节为基础单位的二进制流。Class 文件格式采用伪结构体来存储，这个结构中只有2种数据类型：无符号数，和表..."));
        TECHNIQUE_SINGLE_MAP.put("2017_02_15", new ArchiveVO("虚拟机 Class 类文件的加载机制", "Class 类的生命周期，是从被加载到虚拟机内存开始，到被卸载出内存..."));
		TECHNIQUE_SINGLE_MAP.put("2017_02_20", new ArchiveVO("Bandwagon VPS 搭建之 JDK 安装", "空出了点时间，打算买个 VPS 来锻炼下自己。比较了价格后，就选择了搬瓦工 (Bandwagon)，买的是19.9刀/年的套餐..."));
		TECHNIQUE_SINGLE_MAP.put("2017_02_21", new ArchiveVO("Bandwagon VPS 搭建之 Tomcat 安装", "这次是安装 Web 服务器 Tomcat..."));

//		TECHNIQUE_SINGLE_MAP.put("", new ArchiveVO("", "..."));
	}
	
	
}

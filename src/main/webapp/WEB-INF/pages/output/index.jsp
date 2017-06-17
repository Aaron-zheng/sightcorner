<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
	<head>
		<jsp:include page = "./component/meta.jsp" />
		<jsp:include page = "./component/title.jsp" />
		<jsp:include page = "./component/css.jsp" />
		<jsp:include page = "./component/script.jsp" />
	</head>
	<body class="user output en mac reader-day-mode reader-font2" data-js-module="user-show" data-locale="en">
		<div class="row-fluid">
			<div class="user-aside span3">
				<div class="people">
					<div class="basic-info">
						<div class="avatar">
							<img quality="100" src="${pageContext.request.contextPath}/sightcorner/asset/profile.jpg" thumbnail="90x90">
						</div>
						<h3>
							<a>Aaron</a>
						</h3>
						<div class="btn-group">
							<a class="btn btn-small btn-success follow" data-signin-link="true" data-toggle="modal" href="#" id="like_button">
								<i class="icon-plus icon-ok"></i>喜欢
							</a>
						</div>
						<div class="about">
							<p class="intro">做一只有趣的灵魂在世界游荡。</p>
						</div>
						<div class="sns">
							<a href="https://github.com/Aaron-zheng" target = "_blank"><img alt="github" src="${pageContext.request.contextPath}/sightcorner/icon/github-48.png" style="background-color: #4183C4;"></a>
							<a href="https://cn.linkedin.com/in/aaronzh" target = "_blank"><img alt="linkedin" src="${pageContext.request.contextPath}/sightcorner/icon/linkedin-48.png" style="background-color: #007FB1;"></a>
							<!-- 
							<a href="https://www.facebook.com/profile.php?id=100004525598072" target = "_blank"><img alt="facebook" src="${pageContext.request.contextPath}/sightcorner/icon/facebook-48.png" style="background-color: #3B5998;"></a>
							<a href="http://instagram.com/aaronzheng_zzz/" target = "_blank"><img alt="instagram" src="${pageContext.request.contextPath}/sightcorner/icon/instagram-48.png" style="background-color: #3F729B;"></a>
							<a href="http://weibo.com/u/1738813331/" target = "_blank"><img alt="sinaweibo" src="${pageContext.request.contextPath}/sightcorner/icon/sinaweibo-48.png" style="background-color: #E6162D;"></a>
							<a href="https://plus.google.com/104516558891560307692/posts" target = "_blank"><img alt="googleplus" src="${pageContext.request.contextPath}/sightcorner/icon/googleplus-48.png" style="background-color: #D14836;"></a>
							<a href="http://stackoverflow.com/users/1125169/fucheng-zheng" target = "_blank"><img alt="stackoverflow" src="${pageContext.request.contextPath}/sightcorner/icon/stackoverflow-48.png" style="background-color: #F47920;"></a>
							<a class="qrcode-wrap" href="javascript:void(null)">
							<img alt="" src="#"/>
							<div class="qrcode">
							<img alt="" quality="100" src="#"/>
							</div>
							</a> 
							 -->   
						</div>
					</div>
					<div class="user-stats">
						<ul class="clearfix">
							<li><a id="record_count_1"><b>${number_archive}</b><span>文章</span></a></li>
							<%-- <li><a href="#" id="record_count_2"><b>${number_portfolio}</b><span>相册</span></a></li> --%>
							<li><a id="record_count_3"><b>${number_guess}</b><span>访客</span></a></li>
							<li><a id="record_count_4"><b>${number_like}</b><span>喜欢</span></a></li>
						</ul>
					</div>
				</div>
				<div class="my-books">
				    <h5 class="title"></h5>
				    <ul class="unstyled">
				        <%-- <li><a class="icon-book" href="${pageContext.request.contextPath}/">文章</a></li> --%>
				        <!-- <li><a class="icon-book" href="#">相册</a></li> -->
				        <%-- <li><a class="icon-book" href="${pageContext.request.contextPath}/about">关于</a></li> --%>
				    </ul>
				    <div class="article-info"><span>SightCorner | 视角</span></div>
				    <div class="article-info"><span>粤ICP备15004628号</span></div>
				    <div class="article-info"><span>2012 - 2017</span></div>
			    </div>
			</div>		
			<div class="span9 offset3 recent-post">
				<ul class="nav nav-tabs nav-articles">
					<li id="li_event" style="display:none;"><a href="${pageContext.request.contextPath}/event">生活碎事</a></li>
					<li id="li_technique" style="display:none;"><a href="${pageContext.request.contextPath}/technique">技术黑板</a></li>
					<li id="li_article" style="display:none;"><a href="${pageContext.request.contextPath}/article">背包旅行</a></li>
					<li id="li_portfolio" style="display:none;"><a href="${pageContext.request.contextPath}/portfolio">相册</a></li>
					<li id="li_about" style="display:none;"><a href="${pageContext.request.contextPath}/about">关于</a></li> 
				</ul>
				<jsp:include page = "./component/${load_main_content}.jsp" />
			</div>
		</div>
		<script type="text/javascript">
		var arr = ["article","event","technique","about","portfolio"];
		var tag = '${tag}';
		function menuItemsDisplay(){
			if('about' == tag){
				$('#li_' + 'about').show();
			}else if('portfolio' == tag){
				$('#li_' + 'portfolio').show();
			}else{
				for(var index in arr){
					if(arr[index] != 'about' && arr[index] != 'portfolio'){
						$('#li_' + arr[index]).show();
					}
				}
			}
			$('#li_' + tag).addClass('active');
		}
		function displayListContainer(tag){
// 			if($('h1.title').length){return;}
			if(tag == 'about' || tag == 'portfolio'){
				return;
			}
			$.post(
				'${pageContext.request.contextPath}' + '/' + tag + '/data',
				{},
				function(map){
					var str = '';
                    var record = 0;
					for(var key in map){
						str += '<li>';
						str += '<a class="title" href="'+tag+'/'+key+'">' + map[key].title + '</a>';
						str += '<p>' + map[key].description + '</p>';
						str += '<div class="article-info"><date class="date"><i class="icon-time"></i>' + key.replace(/_/g,'-') + '</date></div>';
						str += '</li>';

                        record++;
                        if(record == 10) {
                            $('#list-data').html(str);
                            str = '';
                        }
					}
					$('#list-data').append(str);
				}
			);
		}
		function displayRecordCount(){
			$.post(
				'${pageContext.request.contextPath}/record_count',
				{},
				function(r){
					$('#record_count_3 b').html(r.vistorRecordCount);
					$('#record_count_4 b').html(r.likeRecordCount);
				}
			);
		}
		$(function(){
			menuItemsDisplay();
			displayListContainer('${tag}');
			displayRecordCount();
		});
		
		$('#like_button').click(function(){
			$.post(
				'${pageContext.request.contextPath}/like',
				{},
				function(){
					$('#like_button').hide();
					var likeNumber = Number($('#record_count_4 b').html());
					$('#record_count_4 b').html(likeNumber+1);
				}
			);
			return false;
		});
		</script>
		
	</body>		
</html>
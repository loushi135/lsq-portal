var timoutid;
$(document).ready(function(){
	//找到所有的标签
	/*
	$("li").mouseover(function(){
		//将原来显示的内容区域进行隐藏
		$("div.contentin2").hide();
		//当前标签所对应的内容区域显示出来
		});
	*/
	$("#new_ct_ul li").each(function(index){
		//每一个包装li的jquery对象都会执行function中的代码
		//index是当前执行这个function代码的li对应在所有li组成的数组中的索引值
		//有了index的值之后，就可以找到当前标签对应的内容区域
		$(this).mouseover(function(){	
			var liNode = $(this);
			timoutid = setTimeout(function(){
				//将原来显示的内容区域进行隐藏
				$("div.contentin2").removeClass("contentin2");
				//对有new_lt_ul2的class定义的li清除new_lt_ul2的class
				$("#new_ct_ul li.new_lt_ul2").removeClass("new_lt_ul2");
				//当前标签所对应的内容区域显示出来
				//$("div").eq(index).addClass("contentin2");
				$("div.contentfirst2:eq(" + index + ")").addClass("contentin2");
				liNode.addClass("new_lt_ul2");	
			},300);			
		}).mouseout(function(){
			clearTimeout(timoutid);	
		});
	});
	
	//在整个页面装入完成后，标签效果2的内容区域需要装入静态的html页面内容
	$("#realcontent").load("TabLoad.html");
	//找到标签2效果对应的三个标签，注册鼠标点击事件
	$("#tabsecond li").each(function(index){
		$(this).click(function(){
			$("#tabsecond li.new_lt_ul2").removeClass("new_lt_ul2");
			$(this).addClass("new_lt_ul2");
			if (index == 0) {
				//装入静态完成页面
				$("#realcontent").load("TabLoad.html");
			} else if (index == 1) {
				//装入动态部分页面
				$("#realcontent").load("TabLoad.jsp h2");
			} else if (index == 2) {
				//装入远程数据（这里也是一个动态页面输出的数据）
				$("#realcontent").load("TabData.jsp")
			}
		});
	});
	//对于loading图片绑定ajax请求开始和交互结束的事件
	$("#contentsecond img").bind("ajaxStart",function(){
		//把div里面的内容清空
		$("#realcontent").html("");
		//整个页面中任意ajax交互开始前，function中的内容会被执行
		$(this).show();
	}).bind("ajaxStop",function(){
		//整个页面中任意ajax交互结束后，function中的内容会被执行	
		$(this).slideUp("1000");
	});
});

//*健康体检
var timoutid;
$(document).ready(function(){
	//找到所有的标签
	/*
	$("li").mouseover(function(){
		//将原来显示的内容区域进行隐藏
		$("div.contentin3").hide();
		//当前标签所对应的内容区域显示出来
		});
	*/
	$("#yu_rt_ul li").each(function(index){
		//每一个包装li的jquery对象都会执行function中的代码
		//index是当前执行这个function代码的li对应在所有li组成的数组中的索引值
		//有了index的值之后，就可以找到当前标签对应的内容区域
		$(this).mouseover(function(){	
			var liNode = $(this);
			timoutid = setTimeout(function(){
				//将原来显示的内容区域进行隐藏
				$("div.contentin3").removeClass("contentin3");
				//对有yu_rt_ul2的class定义的li清除yu_rt_ul2的class
				$("#yu_rt_ul li.sever").removeClass("sever");
				//当前标签所对应的内容区域显示出来
				//$("div").eq(index).addClass("contentin3");
				$("div.contentfirst3:eq(" + index + ")").addClass("contentin3");
				liNode.addClass("sever");	
			},300);			
		}).mouseout(function(){
			clearTimeout(timoutid);	
		});
	});
	
	//在整个页面装入完成后，标签效果2的内容区域需要装入静态的html页面内容
	$("#realcontent").load("TabLoad.html");
	//找到标签2效果对应的三个标签，注册鼠标点击事件
	$("#tabsecond li").each(function(index){
		$(this).click(function(){
			$("#tabsecond li.sever").removeClass("sever");
			$(this).addClass("sever");
			if (index == 0) {
				//装入静态完成页面
				$("#realcontent").load("TabLoad.html");
			} else if (index == 1) {
				//装入动态部分页面
				$("#realcontent").load("TabLoad.jsp h2");
			} else if (index == 2) {
				//装入远程数据（这里也是一个动态页面输出的数据）
				$("#realcontent").load("TabData.jsp")
			}
		});
	});
	//对于loading图片绑定ajax请求开始和交互结束的事件
	$("#contentsecond img").bind("ajaxStart",function(){
		//把div里面的内容清空
		$("#realcontent").html("");
		//整个页面中任意ajax交互开始前，function中的内容会被执行
		$(this).show();
	}).bind("ajaxStop",function(){
		//整个页面中任意ajax交互结束后，function中的内容会被执行	
		$(this).slideUp("1000");
	});
});


/* find_password */
var timoutid;
$(document).ready(function(){
	//找到所有的标签
	/*
	$("li").mouseover(function(){
		//将原来显示的内容区域进行隐藏
		$("div.contentin4").hide();
		//当前标签所对应的内容区域显示出来
		});
	*/
	$("#find_ul  li").each(function(index){
		//每一个包装li的jquery对象都会执行function中的代码
		//index是当前执行这个function代码的li对应在所有li组成的数组中的索引值
		//有了index的值之后，就可以找到当前标签对应的内容区域
		$(this).mousedown(function(){	
			var liNode = $(this);
			timoutid = setTimeout(function(){
				//将原来显示的内容区域进行隐藏
				$("div.find_password").removeClass("find_password");
				//对有sp_ct_ul2的class定义的li清除sp_ct_ul2的class
				$("#find_ul  li.find_ul2").removeClass("find_ul2");
				//当前标签所对应的内容区域显示出来
				//$("div").eq(index).addClass("contentin4");
				$("div.find_password_first:eq(" + index + ")").addClass("find_password");
				liNode.addClass("find_ul2");	
			},300);			
		}).mouseout(function(){
			clearTimeout(timoutid);	
		});
	});
	
	//在整个页面装入完成后，标签效果2的内容区域需要装入静态的html页面内容
	$("#realcontent").load("TabLoad.html");
	//找到标签2效果对应的三个标签，注册鼠标点击事件
	$("#tabsecond li").each(function(index){
		$(this).click(function(){
			$("#tabsecond li.find_ul2").removeClass("find_ul2");
			$(this).addClass("find_ul2");
			if (index == 0) {
				//装入静态完成页面
				$("#realcontent").load("TabLoad.html");
			} else if (index == 1) {
				//装入动态部分页面
				$("#realcontent").load("TabLoad.jsp h2");
			} else if (index == 2) {
				//装入远程数据（这里也是一个动态页面输出的数据）
				$("#realcontent").load("TabData.jsp")
			}
		});
	});
	//对于loading图片绑定ajax请求开始和交互结束的事件
	$("#contentsecond img").bind("ajaxStart",function(){
		//把div里面的内容清空
		$("#realcontent").html("");
		//整个页面中任意ajax交互开始前，function中的内容会被执行
		$(this).show();
	}).bind("ajaxStop",function(){
		//整个页面中任意ajax交互结束后，function中的内容会被执行	
		$(this).slideUp("1000");
	});
});

package com.pingan.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pingan.ssm.pojo.Items;

/**
 * 配置注解驱动的Controller
 * @author SHAWN
 *
 */

@Controller
public class ItemController3 {

	//查询商品列表
	//RequestMapping实现方法和url的映射，一个方法对应一个url
	@RequestMapping("/Items/queryList")
	public ModelAndView queryItem() throws Exception{
		List<Items> itemsList = new ArrayList<Items>();
		//向list中填充静态数据
		
		Items items_1 = new Items(); 
		items_1.setName("联想笔记本");
		items_1.setPrice(6000f); 
		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
		
		Items items_2 = new Items();
		items_2.setName("苹果手机"); 
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6苹果手机！");
		
		itemsList.add(items_1);
		itemsList.add(items_2);

		//返回ModelAndView
		ModelAndView modelAndView =  new ModelAndView();
		//相当 于request的setAttribut，在jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList", itemsList);
		
		//指定视图
		//如果没有在viewResolver中配置view的前缀和后缀，则需要用下面view的完整路径写法
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		//如果配置了view的前缀和后缀，则可以用下面的简易写法
		//modelAndView.setViewName("items/itemsList");

		return modelAndView;
	}

	
	//这里可以定义其他方法
	
	
}

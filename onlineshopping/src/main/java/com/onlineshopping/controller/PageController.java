package com.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onlineshopping.bean.Category;
import com.onlineshopping.service.CategoryService;

@Controller
public class PageController {
		
		@Autowired
		private CategoryService categoryService;
		
		@RequestMapping(value={"/", "/home", "/index"})
		public ModelAndView index(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","Home");
			mv.addObject("userClickHome",true);
			mv.addObject("categories",categoryService.categoryList());
			return mv;
		}
		@RequestMapping(value="/about")
		public ModelAndView about(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","About Us");
			mv.addObject("userClickAbout",false);
			return mv;
		}
		@RequestMapping(value="/contact")
		public ModelAndView contact(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","Contact Us");
			mv.addObject("userClickContact",true);
			return mv;
		}
		@RequestMapping(value="/show/all/products")
		public ModelAndView showAllProducts(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("categories",categoryService.categoryList());
			mv.addObject("title","All Products");
			mv.addObject("userClickAllProducts",true);
			return mv;
		}
		@RequestMapping(value="/show/category/{id}/products")
		public ModelAndView showCategoryProducts(@PathVariable("id") int id){
			ModelAndView mv = new ModelAndView("page");
			
			Category category=null;
			category=categoryService.get(id);
			mv.addObject("title",category.getName());
			mv.addObject("userClickCategoryProducts",true);
			mv.addObject("categories",categoryService.categoryList());
			mv.addObject("category",category);
			return mv;
		}
		
		@RequestMapping(value="/pdf")
		public ModelAndView showPdf(){
			return new ModelAndView("pdfView","data","wellcome vinod");
		}
}

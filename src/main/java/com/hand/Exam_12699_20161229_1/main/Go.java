package com.hand.Exam_12699_20161229_1.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.Exam_12699_20161229_1.mapper.FilmMapper;
import com.hand.Exam_12699_20161229_1.po.Film;
import com.hand.Exam_12699_20161229_1.service.FilmService;
import com.hand.Exam_12699_20161229_1.service.impl.FilmServiceImpl;

public class Go {
	private static Scanner scanner = new Scanner(System.in);
   
    private static AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	public static void main(String[] args) {
			Film film = new Film();
            film.setTitle(inputTitle());
            film.setTitle(inputDescription());
            film.setLanguage_id(inputLanguageId());
            FilmService filmService= (FilmService) applicationContext.getBean("FilmService");
            filmService.insertFilm(film);
            applicationContext.close();
	}

	public static String inputTitle() {
		int flig=0;
		String title=null;
		while (flig==0) {
			System.out.println("请输入电影名称(title)");
			title=scanner.nextLine();
			if (title==null||title=="") {
				System.out.println("电影名称不能为空");
				continue;
			}
			flig=1;
		}	
		return title;
	}
	public static String inputDescription() {
		int flig=0;
		String description=null;
		while (flig==0) {
			System.out.println("请输入电影描述(description)");
			description=scanner.nextLine();
			if (description==null||description=="") {
				System.out.println("电影描述不能为空");
				continue;
			}
			flig=1;
		}	
		return description;
	}
	public static Integer inputLanguageId() {
		int flig=0;
		String language_id=null;
		while (flig==0) {
			System.out.println("请输入语言ID(language_id)");
			language_id=scanner.nextLine();
			if (language_id==null||language_id==""||!isInteger(language_id)) {
				System.out.println("电影语言ID不能为空或ID输入错误");
				continue;
			}
			flig=1;
		}	
		return Integer.parseInt(language_id);
	}
	public static boolean isInteger(String value) {
		  try {
		   Integer.parseInt(value);
		   return true;
		  } catch (NumberFormatException e) {
		   return false;
		  }
		 }
}

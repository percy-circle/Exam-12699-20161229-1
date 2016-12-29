package com.hand.Exam_12699_20161229_1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.Exam_12699_20161229_1.mapper.FilmMapper;
import com.hand.Exam_12699_20161229_1.po.Film;
import com.hand.Exam_12699_20161229_1.service.FilmService;

public class FilmServiceImpl implements FilmService {
	@Autowired
	private FilmMapper filmMapper;
	public void insertFilm(Film film) {
		// TODO Auto-generated method stub
		filmMapper.insertFilm(film);
	}

}

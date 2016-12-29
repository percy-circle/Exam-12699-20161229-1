package com.hand.Exam_12699_20161229_1.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAop {
	@Before(value="execution(* com.hand.Exam_12699_20161229_1.mapper.FilmMapper.*(..))")
    public void  BeforeInsertFilmEvent(){
		System.out.println("Before Insert Film Data");
	}
	@After(value="execution(* com.hand.Exam_12699_20161229_1.mapper.FilmMapper.*(..))")
	public void  AfterInsertFilmEvent (){
		System.out.println("After Insert Film Data");
	}

	
}
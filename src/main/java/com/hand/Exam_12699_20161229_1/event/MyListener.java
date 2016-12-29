package com.hand.Exam_12699_20161229_1.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;

public class MyListener implements ApplicationListener<ApplicationEvent> {

	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		if (event instanceof MyEvent) {

		} else if (event instanceof ContextRefreshedEvent) {
			System.out.println("Context Start ");
		}else if (event instanceof ContextClosedEvent) {
			System.out.println("Context Stop ");
		}
	}
}

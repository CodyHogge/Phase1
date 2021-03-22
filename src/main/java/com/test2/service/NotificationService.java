package com.test2.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	
	public LocalDateTime sendMsg(String recipient) {
		
		System.out.println("Task S1 start (wait 5). -> " + LocalDateTime.now());
		sleep(5);
		System.out.println("Task S1 complete. -> " + LocalDateTime.now());
		sleep(3);
		System.out.println("Task S2 start (wait 5). -> " + LocalDateTime.now());
		sleep(5);
		System.out.println("Task S2 complete. -> " + LocalDateTime.now());
		
		LocalDateTime comp = LocalDateTime.now();
		
		return comp;
		
	}
	
	@Async
	public LocalDateTime sendAsyncMsg(String recipient) {
		
		System.out.println("Task A1 start (wait 7). -> " + LocalDateTime.now() + " Thread: " + Thread.currentThread().getName());
		sleep(7);
		
		System.out.println("Task A1 complete. -> " + LocalDateTime.now());
		sleep(1);
		
		System.out.println("Task A2 start (wait 7). -> " + LocalDateTime.now() + " Thread: " + Thread.currentThread().getName());
		sleep(2);
		LocalDateTime comp = LocalDateTime.now();
		System.out.println("Task A2 complete. -> " + comp);		
		
		return comp;
		
	}
	
	
	private void sleep(Integer secs) {
		try {
			TimeUnit.SECONDS.sleep(secs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

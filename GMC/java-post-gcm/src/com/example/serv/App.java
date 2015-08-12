package com.example.serv;

import com.example.server.vo.Content;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Sending POST to GCM");
		
		String apiKey = "AIzaSyBklC1HnkiiYN3NhybYgl7KK2cfICTWayc";
		Content content = createContent();
		
		Post2Gcm.post(apiKey, content);
	}

	public static Content createContent() {
		Content c = new Content();
		
		c.addRegId("APA91bGJPQDdA9RL24DvrdO_78IU9ur7rGhApK3DDWUcAXyi7GJimMWuRJa23_uvRiX_2q9msGRa2xfmcvjjjKuRBRBvMbv_tjkI6KM1zHsydHb8K4HuaxTNQYPh7FNRzl2QCBtcaIVG");
		
		c.createData("Testing Google cloud Message-title", "Testing Google cloud Message-body");
		
		return c;
	}
}

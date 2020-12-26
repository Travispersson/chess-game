package com.chessthingy.demo;

import com.chessthingy.models.board.Board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Board b = new Board();
		System.out.println(b); 
		//SpringApplicatison.run(DemoApplication.class, args);
	}

}

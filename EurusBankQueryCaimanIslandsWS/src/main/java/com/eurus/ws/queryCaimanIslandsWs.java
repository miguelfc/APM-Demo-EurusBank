package com.eurus.ws;

import java.util.Random;

public class queryCaimanIslandsWs {

	public String sayHello(String name) {
		if (name == null) {
			return "Hello";
		}

		return "Hello, " + name + "!";
	}

	public String queryAccountsByName(String name) {
		Random rand = new Random();
		int randomNum = rand.nextInt(2000);
		return randomNum + " USD";
	}

	public String queryAccountsByNameAndBranch(String name, String branch) {
		Random rand = new Random();
		int randomNum = rand.nextInt(2000);
		return randomNum + " USD";
	}
}

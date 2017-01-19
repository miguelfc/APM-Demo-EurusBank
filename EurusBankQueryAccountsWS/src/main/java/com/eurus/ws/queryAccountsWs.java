package com.eurus.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class queryAccountsWs {

	public String sayHello(String name) {
		if (name == null) {
			return "Hello";
		}

		return "Hello, " + name + "!";
	}

	public String queryAccountsByName(String name) throws MalformedURLException {

		String accountBalance = "Account balance for [" + name + "] is: \n";

		queryCaimanIslandsWs caimanIslands = new queryCaimanIslandsWs();
		QueryCaimanIslandsWsPortType caimanPort = caimanIslands.getQueryCaimanIslandsWsHttpSoap11Endpoint();
		String caimanIslandsBalance = caimanPort.queryAccountsByName(name);
		accountBalance += "Caiman Islands: [" + caimanIslandsBalance + "]";

		// TODO Add Andorra Branch
		accountBalance += "\n";
		accountBalance += "Andorra       : [" + "0 EUR" + "]";

		return accountBalance;
	}

	public String queryAccountsByNameAndBranch(String name, String branch) throws MalformedURLException {

		String branchName = "";
		String balance = "";
		if (branch.equals("caimanIslands")) {
			branchName = "Caiman Islands";
			queryCaimanIslandsWs caimanIslands = new queryCaimanIslandsWs();
			QueryCaimanIslandsWsPortType caimanPort = caimanIslands.getQueryCaimanIslandsWsHttpSoap11Endpoint();
			balance = caimanPort.queryAccountsByName(name);
		} else {
			return "Invalid branch";
		}

		String accountBalance = "Account balance for [" + name + "] in branch [" + branchName + "] is [" + balance
				+ "]";

		return accountBalance;
	}
}

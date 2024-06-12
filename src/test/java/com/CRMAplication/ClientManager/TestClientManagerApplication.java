package com.CRMAplication.ClientManager;

import org.springframework.boot.SpringApplication;

public class TestClientManagerApplication {

	public static void main(String[] args) {
		SpringApplication.from(ClientManagerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

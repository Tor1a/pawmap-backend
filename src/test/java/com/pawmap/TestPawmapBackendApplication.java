package com.pawmap;

import org.springframework.boot.SpringApplication;

public class TestPawmapBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(PawmapBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

package com.example.demoArtifact;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class DemoArtifactApplicationTests {

	@Test
	void contextLoads() {
		//Obtener las variables del entorno
		System.getenv().forEach(
				// recibe un lamba
				(key, value) ->
						System.out.println(key + " " + value));
	}

}

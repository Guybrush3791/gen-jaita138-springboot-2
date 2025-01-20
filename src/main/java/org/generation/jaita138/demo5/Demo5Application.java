package org.generation.jaita138.demo5;

import java.util.List;

import org.generation.jaita138.demo5.db.entity.Animale;
import org.generation.jaita138.demo5.db.service.AnimaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo5Application implements CommandLineRunner {

	@Autowired
	private AnimaleService animaleService;

	public static void main(String[] args) {
		SpringApplication.run(Demo5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello, World!");
		System.out.println("---------------------------------------------------");

		animaleTest();

		System.out.println("---------------------------------------------------");
		System.out.println("The end.");
	}

	private void animaleTest() {
		Animale a1 = new Animale();
		a1.setNome("Marco");
		a1.setRazza("boxer");
		a1.setPeso(25);
		a1.setAltezza(45);

		System.out.println(a1);
		animaleService.insertAnimale(a1);
		System.out.println(a1);

		List<Animale> animali = animaleService.findAll();
		System.out.println(animali);
	}
}

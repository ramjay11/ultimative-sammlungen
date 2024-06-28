package com.ramjava.ultimativ.fruhlingsstiefel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UltimativFruhlingsstiefelApplication {

	public static void main(String[] args) {
		//SpringApplication.run(UltimativFruhlingsstiefelApplication.class, args);
		var ctx = SpringApplication.run(UltimativFruhlingsstiefelApplication.class, args);
		//var ersteKlasse = new MeineErsteKlasse();
		MeineErsteKlasse meineErsteKlasse = ctx.getBean(MeineErsteKlasse.class);
		//System.out.println(ersteKlasse.sagHallo());
		System.out.println(meineErsteKlasse.sagHallo());
	}

	// Bean injection
	@Bean
	public MeineErsteKlasse meineErsteKlasse() {
		return new MeineErsteKlasse();
	}

}

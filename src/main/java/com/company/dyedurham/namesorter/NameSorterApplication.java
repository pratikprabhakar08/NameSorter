package com.company.dyedurham.namesorter;

import com.company.dyedurham.namesorter.service.NameSorterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NameSorterApplication implements CommandLineRunner {

	@Autowired
	private final NameSorterService nameSorterService;

	public NameSorterApplication(NameSorterService nameSorterService) {
		this.nameSorterService = nameSorterService;
	}

	public static void main(String[] args) {
		SpringApplication.run(NameSorterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.nameSorterService.sortName(args[0]);
	}
}

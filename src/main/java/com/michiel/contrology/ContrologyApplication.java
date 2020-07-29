package com.michiel.contrology;

import com.michiel.contrology.api.ClientEndpoints;
import com.michiel.contrology.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContrologyApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ContrologyApplication.class, args);
		System.out.println("\nIts, its... aliiive!\n");
	}
}
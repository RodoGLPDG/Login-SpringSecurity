package com.example;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.entity.ERole;
import com.example.entity.RoleEntity;
import com.example.entity.UserEntity;
import com.example.entity.DTO.CreateUserDTO;
import com.example.repositories.UserRepository;
import com.example.service.UserService;

@SpringBootApplication
public class AppWebExpedientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppWebExpedientesApplication.class, args);
	}

	
	
	//Creacion de usuarios por ahora

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	UserRepository userRepository;

	@Bean
	CommandLineRunner init(){
		return args -> {
			
			
			


		/*	
			UserEntity userEntity = UserEntity.builder()
					.email("santiago@mail.com")
					.username("santiago")
					.apellido("apellido")
					.password(passwordEncoder.encode("1234"))
					.roles(Set.of(RoleEntity.builder()
							.name(ERole.valueOf(ERole.ADMIN.name()))
							.build()))
					.build();
			
			UserEntity userEntity2 = UserEntity.builder()
					.email("anyi@mail.com")
					.username("anyi")
					.apellido("apellido")
					.password(passwordEncoder.encode("1234"))
					.roles(Set.of(RoleEntity.builder()
							.name(ERole.valueOf(ERole.USER.name()))
							.build()))
					.build();
			
			UserEntity userEntity3 = UserEntity.builder()
					.email("correo3@mail.com")
					.username("username3")
					.apellido("apellido3")
					.password(passwordEncoder.encode("1234"))
					.roles(Set.of(RoleEntity.builder()
							.name(ERole.valueOf(ERole.INVITED.name()))
							.build()))
					.build();
			
			userRepository.save(userEntity);
			userRepository.save(userEntity2);
			userRepository.save(userEntity3);
			
			*/

		};

	}
	
	
	
  
	
}



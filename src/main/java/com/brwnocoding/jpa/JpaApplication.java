package com.brwnocoding.jpa;

import com.brwnocoding.jpa.models.Author;
import com.brwnocoding.jpa.models.Video;
import com.brwnocoding.jpa.repositories.AuthorRepository;
import com.brwnocoding.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
		AuthorRepository repository,
		VideoRepository videoRepository
	) {
		return args -> {
//			var author = Author.builder()
//					.firstName("wesley")
//					.lastName("bruno")
//					.age(24)
//					.email("wesley@email.com")
//					.build();
//			repository.save(author);
			var video = Video.builder()
					.name("abc")
					.lenght(5)
					.build();
			videoRepository.save(video);
		};
	}

}

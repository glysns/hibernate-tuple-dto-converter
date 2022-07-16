package digytal.hibernate.tuple.converter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateConverterApplication.class, args);
	}
	@Bean
	public CommandLineRunner run() throws Exception {
		return args -> {

		};
	}


}

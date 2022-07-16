package digytal.hibernate.tuple.converter;

import digytal.hibernate.tuple.converter.model.Marca;
import digytal.hibernate.tuple.converter.model.Produto;
import digytal.hibernate.tuple.converter.service.MarcaService;
import digytal.hibernate.tuple.converter.service.ProdutoService;
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
	public CommandLineRunner run(MarcaService ms, ProdutoService ps) throws Exception {
		return args -> {
			Marca m = new Marca();
			m.setNome("JEEP");

			ms.save(m);

			Produto p = new Produto();
			p.setNome("RENEGADE");
			p.setMarca(1);

			ps.save(p);
		};
	}


}

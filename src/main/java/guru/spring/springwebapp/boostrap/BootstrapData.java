package guru.spring.springwebapp.boostrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.spring.springwebapp.repository.AutorRepository;
import guru.spring.springwebapp.repository.LivroRepository;


@Component
public class BootstrapData implements CommandLineRunner{

	
	private final AutorRepository autorRepository;
	private final LivroRepository livroRepository;
	
	
	
	public BootstrapData(AutorRepository autorRepository, LivroRepository livroRepository) {
		super();
		this.autorRepository = autorRepository;
		this.livroRepository = livroRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}

package guru.spring.springwebapp.boostrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.spring.springwebapp.domain.model.Autor;
import guru.spring.springwebapp.domain.model.Editora;
import guru.spring.springwebapp.domain.model.Livro;
import guru.spring.springwebapp.repository.AutorRepository;
import guru.spring.springwebapp.repository.EditoraRepository;
import guru.spring.springwebapp.repository.LivroRepository;

@Component
public class BootstrapData implements CommandLineRunner {

	private final AutorRepository autorRepository;
	private final LivroRepository livroRepository;
	private final EditoraRepository editoraRepository;

	public BootstrapData(AutorRepository autorRepository, LivroRepository livroRepository,
			EditoraRepository editoraRepository) {
		super();
		this.autorRepository = autorRepository;
		this.livroRepository = livroRepository;
		this.editoraRepository = editoraRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Editora editora = new Editora();
		editora.setNome("Santa cruz");
		editora.setCidade("São Paulo");
		editora.setEndereco("Rua joão dos testes");
		editoraRepository.save(editora);
		
		Autor eric = new Autor();
		eric.setPrimeiroNome("Eric");
		eric.setUltimoNome("Evans");
		
		Livro ddd = new Livro();
		ddd.setIsbn("123123");
		ddd.setTitulo("Domain Drive Design");
		eric.getLivros().add(ddd);
		ddd.getAutores().add(eric);
		
		ddd.setEditora(editora);
		editora.getLivros().add(ddd);
		
		autorRepository.save(eric);
		livroRepository.save(ddd);
		editoraRepository.save(editora);
		
		
		System.out.println("Started in boostrap!!!");
		System.out.println("Número de livros: "+livroRepository.count());
		System.out.println("Número de editoras: "+editora.getLivros().size());
		
	}

}

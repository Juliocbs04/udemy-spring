package guru.spring.springwebapp.repository;

import org.springframework.data.repository.CrudRepository;

import guru.spring.springwebapp.domain.model.Livro;

public interface LivroRepository extends CrudRepository<Livro,Long>{

}

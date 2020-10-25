package guru.spring.springwebapp.repository;

import org.springframework.data.repository.CrudRepository;

import guru.spring.springwebapp.domain.model.Autor;

public interface AutorRepository extends CrudRepository<Autor, Long> {

}

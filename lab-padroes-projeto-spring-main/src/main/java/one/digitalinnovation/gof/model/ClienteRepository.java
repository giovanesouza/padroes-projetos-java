package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Anotação não obrigatória
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
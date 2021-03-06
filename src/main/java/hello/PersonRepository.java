package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "people")
public interface PersonRepository extends CrudRepository<Person, Long> {

	List<Person> findByLastName(@Param("lastname") String lastName);

}



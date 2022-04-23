package luiz.souza.firstproject.repositories;

import org.springframework.data.repository.CrudRepository;

import luiz.souza.firstproject.model.UserModel;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
  
}

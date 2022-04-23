package luiz.souza.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import luiz.souza.firstproject.model.UserModel;
import luiz.souza.firstproject.repositories.UserRepository;

@RestController
public class UserController {

  @Autowired
  private UserRepository repository;

  @GetMapping(path = "/api/user/{id}")
  public ResponseEntity list(@PathVariable("id") Integer id) {
    return repository.findById(id).map(record -> ResponseEntity.ok().body(record)).orElse(ResponseEntity.notFound().build());
  }

  @PostMapping(path = "/api/user/create")
  public UserModel create(@RequestBody UserModel user) {
    return repository.save(user);
  }
}

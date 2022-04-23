package luiz.souza.firstproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user")
public class UserModel {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  public Integer id;
  
  @Column(nullable = false, length = 15)
  public String name;

  @Column(nullable = false, length = 15)
  public String login;
  
  @Column(nullable = false, length = 15)
  public String password;

  public void createdUser(String name, String login, String password) {
    this.name = name;
    this.login = login;
    this.password = password;
  }

  public Integer getID() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getLogin() {
    return login;
  }
}

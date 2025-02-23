package dev.java10x.cadastrodeninjas.Ninjas.Model;

import dev.java10x.cadastrodeninjas.Missions.Model.MissionsModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "tb_registry")
public class NinjaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String email;
  private int age;
  @ManyToOne // A Ninja can only have one mission
  @JoinColumn(name = "missions_id") // Foreign Key from tb_missions
  private MissionsModel missions;

  public NinjaModel() {
  }

  public NinjaModel(String name, String email, int age) {
    this.name = name;
    this.email = email;
    this.age = age;
  }

  public Long getId() { return id; }

  public void setId(Long id) { this.id = id; }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

package dev.java10x.cadastrodeninjas.Missions.Model;

import dev.java10x.cadastrodeninjas.Ninjas.Model.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "tb_missions")
public class MissionsModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String difficulty;

  @OneToMany(mappedBy = "missions")   // A mission can be assigned to multiple Ninjas | missions is the foreign key set in tb_registry
  private List<NinjaModel> ninjas;

  public MissionsModel() {
  }

  public MissionsModel(Long id, String name, String rank) {
    this.id = id;
    this.name = name;
    this.difficulty = rank;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }
}

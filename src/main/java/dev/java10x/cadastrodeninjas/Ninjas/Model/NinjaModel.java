package dev.java10x.cadastrodeninjas.Ninjas.Model;

import dev.java10x.cadastrodeninjas.Missions.Model.MissionsModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_registry")
@Data //Creates Getters and Setters Automatically
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @Column(unique = true)
  private String email;

  private int age;

  @ManyToOne // A Ninja can only have one mission
  @JoinColumn(name = "missions_id") // Foreign Key from tb_missions
  private MissionsModel missions;
}

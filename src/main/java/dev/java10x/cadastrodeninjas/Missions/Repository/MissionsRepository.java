package dev.java10x.cadastrodeninjas.Missions.Repository;

import dev.java10x.cadastrodeninjas.Missions.Model.MissionsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionsRepository extends JpaRepository<MissionsModel, Long> {

}

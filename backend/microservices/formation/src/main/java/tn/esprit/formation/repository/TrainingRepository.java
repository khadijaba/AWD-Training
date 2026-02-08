package tn.esprit.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.formation.entity.Training;

public interface TrainingRepository extends JpaRepository<Training, Long> {
}

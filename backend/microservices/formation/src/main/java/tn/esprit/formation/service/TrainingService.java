package tn.esprit.formation.service;

import tn.esprit.formation.entity.Training;
import tn.esprit.formation.repository.TrainingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingService {

    private final TrainingRepository trainingRepository;

    public TrainingService(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    public List<Training> getAllTrainings() {
        return trainingRepository.findAll();
    }

    public Training getTrainingById(Long id) {
        return trainingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Training not found with id " + id));
    }

    public Training createTraining(Training training) {
        return trainingRepository.save(training);
    }

    public Training updateTraining(Long id, Training trainingDetails) {
        Training training = trainingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Training not found with id " + id));

        training.setTitle(trainingDetails.getTitle());
        training.setDescription(trainingDetails.getDescription());
        training.setDuration(trainingDetails.getDuration());
        training.setLevel(trainingDetails.getLevel());

        return trainingRepository.save(training);
    }

    public void deleteTraining(Long id) {
        trainingRepository.deleteById(id);
    }
}
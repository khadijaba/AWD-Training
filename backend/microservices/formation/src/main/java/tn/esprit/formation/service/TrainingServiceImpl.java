package tn.esprit.formation.service;

import tn.esprit.formation.entity.Training;

import java.util.List;

public interface TrainingServiceImpl {

        List<Training> getAllTrainings();

        Training getTrainingById(Long id);

        Training createTraining(Training training);

        Training updateTraining(Long id, Training training);

        void deleteTraining(Long id);
    }


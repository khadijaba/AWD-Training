package tn.esprit.formation.controller;

import tn.esprit.formation.entity.Training;
import tn.esprit.formation.service.TrainingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trainings")
public class TrainingController {

    private final TrainingService trainingService;

    public TrainingController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    @GetMapping
    public List<Training> getAllTrainings() {
        return trainingService.getAllTrainings();
    }

    @GetMapping("/{id}")
    public Training getTrainingById(@PathVariable Long id) {
        return trainingService.getTrainingById(id);
    }

    @PostMapping
    public Training createTraining(@RequestBody Training training) {
        return trainingService.createTraining(training);
    }

    @PutMapping("/{id}")
    public Training updateTraining(@PathVariable Long id, @RequestBody Training training) {
        return trainingService.updateTraining(id, training);
    }

    @DeleteMapping("/{id}")
    public void deleteTraining(@PathVariable Long id) {
        trainingService.deleteTraining(id);
    }
}
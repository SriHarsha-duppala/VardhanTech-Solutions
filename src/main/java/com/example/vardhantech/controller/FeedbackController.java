package com.example.vardhantech.controller;

import com.example.vardhantech.model.Feedback;
import com.example.vardhantech.repository.FeedbackRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin(origins = "*")
public class FeedbackController {

    private final FeedbackRepository repository;

    public FeedbackController(FeedbackRepository repository) {
        this.repository = repository;
    }

    // POST feedback
    @PostMapping
    public Feedback saveFeedback(@RequestBody Feedback feedback) {
        return repository.save(feedback);
    }

    // GET all feedback
    @GetMapping
    public List<Feedback> getAllFeedback() {
        return repository.findAll();
    }
}

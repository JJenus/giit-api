package com.giit.giitInterview.controller;

import com.giit.giitInterview.model.Candidate;
import com.giit.giitInterview.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/candidates")
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    @PostMapping
    public Candidate save(@RequestBody Candidate candidate){
        return candidateService.save(candidate);
    }

    @GetMapping
    public List<Candidate> candidates(){
        return candidateService.getCandidates();
    }
}

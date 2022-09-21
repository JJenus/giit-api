package com.giit.giitInterview.service;

import com.giit.giitInterview.model.Candidate;
import com.giit.giitInterview.repository.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    CandidateRepo repo;
    public List<Candidate> getCandidates() {
        return repo.findAll();
    }

    public Candidate save(Candidate candidate) {
        return  repo.save(candidate);
    }
}

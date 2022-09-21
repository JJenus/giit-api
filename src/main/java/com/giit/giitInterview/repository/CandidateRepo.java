package com.giit.giitInterview.repository;

import com.giit.giitInterview.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepo extends JpaRepository<Candidate, Long> {
}

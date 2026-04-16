package com.example.votingsystem.model;

import jakarta.persistence.*;

@Entity
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String candidateName;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCandidateName() { return candidateName; }
    public void setCandidateName(String candidateName) { this.candidateName = candidateName; }
}

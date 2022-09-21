package com.giit.giitInterview.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String imgUrl;
    //social
    private String github;
    private String linkedin;
    @ElementCollection
    private List<String> skills;
}

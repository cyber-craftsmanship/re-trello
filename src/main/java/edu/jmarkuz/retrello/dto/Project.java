package edu.jmarkuz.retrello.dto;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {

    private Long id;

    private String name;

    private Instant createdAt;
}

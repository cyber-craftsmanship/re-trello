package edu.jmarkuz.retrello.dto;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {

    private Long id;

    private String name;

    private String description;

    private Instant createdAt;
}

package edu.jmarkuz.retrello.dto;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskState {

    private Long id;

    private String name;

    private Long ordinal;

    private Instant createdAt;
}

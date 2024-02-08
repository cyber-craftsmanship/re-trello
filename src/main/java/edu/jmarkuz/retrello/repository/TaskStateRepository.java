package edu.jmarkuz.retrello.repository;

import edu.jmarkuz.retrello.entity.TaskState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskStateRepository extends JpaRepository<TaskState, Long> {
}

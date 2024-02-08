package edu.jmarkuz.retrello.repository;

import edu.jmarkuz.retrello.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

package edu.jmarkuz.retrello.repository;

import edu.jmarkuz.retrello.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

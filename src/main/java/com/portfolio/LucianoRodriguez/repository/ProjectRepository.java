package com.portfolio.LucianoRodriguez.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.LucianoRodriguez.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    public Optional<Project> getByName(String name);
    public boolean existsByName(String name);
}

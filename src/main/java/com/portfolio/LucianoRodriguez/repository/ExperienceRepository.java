package com.portfolio.LucianoRodriguez.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.LucianoRodriguez.entity.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
    public Optional<Experience> findByPosition(String position);
    public boolean exitsByPosition(String position);
}

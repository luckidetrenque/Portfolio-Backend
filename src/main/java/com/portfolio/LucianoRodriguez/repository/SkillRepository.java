package com.portfolio.LucianoRodriguez.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.LucianoRodriguez.entity.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
    public Optional<Skill> findByName(String name);
    public boolean existsByName(String name);
}

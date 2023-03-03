package com.portfolio.LucianoRodriguez.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.LucianoRodriguez.entity.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {
    public Optional<Education> findByIntitution (String institution);
    public boolean exitsByInstitution(String institution);
    public Optional<Education> findByDegree(String degree);
    public boolean exitsByDegree(String degree);
}

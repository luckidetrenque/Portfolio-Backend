package com.portfolio.LucianoRodriguez.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.LucianoRodriguez.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    public Optional<Person> findByFullname(String name, String surname);
    public boolean exitsByFullname(String name, String surname);    
}

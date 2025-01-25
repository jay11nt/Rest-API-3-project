package com.example.projectname.repository;

import com.example.projectname.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
}


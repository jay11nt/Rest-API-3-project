package com.example.projectname.service;

import com.example.projectname.model.Developer;
import com.example.projectname.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperService {

    @Autowired
    private DeveloperRepository developerRepository;

    public Developer saveDeveloper(Developer developer) {
        return developerRepository.save(developer);
    }

    public List<Developer> getAllDevelopers() {
        return developerRepository.findAll();
    }

    public Developer getDeveloperById(Long id) {
        return developerRepository.findById(id).orElse(null);
    }

    public void deleteDeveloper(Long id) {
        developerRepository.deleteById(id);
    }
}


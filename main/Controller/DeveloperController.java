package com.example.projectname.controller;

import com.example.projectname.model.Developer;
import com.example.projectname.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/developers")
public class DeveloperController {

    @Autowired
    private DeveloperService developerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Developer createDeveloper(@RequestBody Developer developer) {
        return developerService.saveDeveloper(developer);
    }

    @GetMapping
    public List<Developer> getAllDevelopers() {
        return developerService.getAllDevelopers();
    }

    @GetMapping("/{id}")
    public Developer getDeveloperById(@PathVariable Long id) {
        return developerService.getDeveloperById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDeveloper(@PathVariable Long id) {
        developerService.deleteDeveloper(id);
    }
}


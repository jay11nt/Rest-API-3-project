package com.example.projectname.controller;

import com.example.projectname.model.Tester;
import com.example.projectname.service.TesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/testers")
public class TesterController {

    @Autowired
    private TesterService testerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tester createTester(@RequestBody Tester tester) {
        return testerService.saveTester(tester);
    }

    @GetMapping
    public List<Tester> getAllTesters() {
        return testerService.getAllTesters();
    }

    @GetMapping("/{id}")
    public Tester getTesterById(@PathVariable Long id) {
        return testerService.getTesterById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTester(@PathVariable Long id) {
        testerService.deleteTester(id);
    }
}


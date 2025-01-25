package com.example.projectname.service;

import com.example.projectname.model.Tester;
import com.example.projectname.repository.TesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TesterService {

    @Autowired
    private TesterRepository testerRepository;

    public Tester saveTester(Tester tester) {
        return testerRepository.save(tester);
    }

    public List<Tester> getAllTesters() {
        return testerRepository.findAll();
    }

    public Tester getTesterById(Long id) {
        return testerRepository.findById(id).orElse(null);
    }

    public void deleteTester(Long id) {
        testerRepository.deleteById(id);
    }
}

package com.buildSchoolManagement.service.classes;

import com.buildSchoolManagement.model.Classes;
import com.buildSchoolManagement.repository.IClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClassesService implements IClassesService{
    @Autowired
    private IClassesRepository classesRepository;

    @Override
    public Classes save(Classes classes) {
        return classesRepository.save(classes);
    }

    @Override
    public Iterable<Classes> findAll() {
        return classesRepository.findAll();
    }

    @Override
    public Optional<Classes> findById(Long id) {
        return classesRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        classesRepository.deleteById(id);
    }
}

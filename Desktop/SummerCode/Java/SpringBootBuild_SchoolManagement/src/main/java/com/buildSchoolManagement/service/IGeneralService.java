package com.buildSchoolManagement.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IGeneralService<T> {
    T save (T t);

    //Iterable is the most abstract form of collection
    Iterable<T> findAll();

    // Optional to handle truong hop Null (id without object)
    Optional<T> findById(Long id);

    void deleteById(Long id);

}

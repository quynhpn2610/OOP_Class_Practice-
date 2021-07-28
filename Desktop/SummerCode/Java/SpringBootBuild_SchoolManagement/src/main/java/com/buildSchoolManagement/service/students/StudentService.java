package com.buildSchoolManagement.service.students;

import com.buildSchoolManagement.model.Students;
import com.buildSchoolManagement.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public Students save(Students student) {
        return studentRepository.save(student);
    }

    @Override
    public Iterable<Students> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Students> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);

    }
}

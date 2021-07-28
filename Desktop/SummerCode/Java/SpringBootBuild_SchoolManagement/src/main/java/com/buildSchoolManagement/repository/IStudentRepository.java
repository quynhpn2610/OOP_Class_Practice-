package com.buildSchoolManagement.repository;

import com.buildSchoolManagement.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Students, Long> {


}

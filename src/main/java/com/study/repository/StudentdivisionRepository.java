package com.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.entity.Studentdivision;

@Repository("studentdivision")
public interface StudentdivisionRepository extends JpaRepository<Studentdivision, Integer>{

}


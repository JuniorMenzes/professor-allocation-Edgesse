package com.project.professorallocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professorallocation.model.Allocation;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation, Long>{
	List<Allocation> findByProfessorId(Allocation newAllocation);
	List<Allocation> findByCourseId(Long courseId); 
	List<Allocation> findByProfessorIdAndCourseId(Long professorId, Long courseId);
	}

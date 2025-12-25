package com.jamail.Labour.Repository;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jamail.Labour.DTO.LabourerDTO;


public interface LabourerRepository extends JpaRepository<LabourerDTO, UUID> {

    List<LabourerDTO> findByNameContainingIgnoreCase(String name);
}
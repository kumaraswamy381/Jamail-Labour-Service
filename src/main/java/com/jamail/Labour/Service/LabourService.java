package com.jamail.Labour.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jamail.Labour.DTO.LabourerDTO;
import com.jamail.Labour.Repository.LabourRepository;

@Service
public class LabourService {

    private final LabourRepository labourRepository;

    public LabourService(LabourRepository labourRepository) {
        this.labourRepository = labourRepository;
    }

    public LabourerDTO createLabourer(LabourerDTO labourer) {
        return labourRepository.save(labourer);
    }

    public List<LabourerDTO> getAllLabourers() {
        return labourRepository.findAll();
    }

    public LabourerDTO getLabourerById(UUID id) {
        return labourRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Labourer not found"));
    }

    public List<LabourerDTO> searchByName(String name) {
        return labourRepository.findByNameContainingIgnoreCase(name);
    }
}

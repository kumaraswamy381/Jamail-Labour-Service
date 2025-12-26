
package com.jamail.Labour.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jamail.Labour.DTO.LabourerDTO;
import com.jamail.Labour.Service.LabourService;

@RestController
@RequestMapping("/api/labourers")
public class LabourController {

	private final LabourService labourService;

	public LabourController(LabourService labourService) {
		this.labourService = labourService;
	}

	@PostMapping
	public LabourerDTO createLabourer(@RequestBody LabourerDTO labourer) {
		return labourService.createLabourer(labourer);
	}

	@GetMapping
	public List<LabourerDTO> getAllLabourers() {
		return labourService.getAllLabourers();
	}

	@GetMapping("/{id}")
	public LabourerDTO getLabourerById(@PathVariable UUID id) {
		return labourService.getLabourerById(id);
	}

	/*
	 * @GetMapping("/search") public List<LabourerDTO> searchLabourers(@RequestParam
	 * String name) { return labourService.searchByName(name); }
	 */
}

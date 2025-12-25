/*
 * package com.jamail.Labour.controller;
 * 
 * 
 * import java.util.List; import java.util.UUID; import
 * java.util.stream.Collectors;
 * 
 * import org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.*;
 * 
 * import com.jamail.Labour.DTO.LabourerDTO; import
 * com.jamail.Labour.Repository.LabourerRepository;
 * 
 * 
 * @RestController
 * 
 * @RequestMapping("/labourers") public class LabourerController {
 * 
 * private final LabourerRepository labourerRepository;
 * 
 * public LabourerController(LabourerRepository labourerRepository) {
 * this.labourerRepository = labourerRepository; }
 * 
 * // ✅ POST /labourers
 * 
 * @PostMapping public ResponseEntity<LabourerDTO> createLabourer(@RequestBody
 * LabourerDTO dto) {
 * 
 * LabourerDTO labourer = new LabourerDTO(); labourer.setName(dto.getName());
 * labourer.setPhoneNumber(dto.getPhoneNumber());
 * 
 * LabourerDTO saved = labourerRepository.save(labourer);
 * 
 * return new ResponseEntity<>(mapToDTO(saved), HttpStatus.CREATED); }
 * 
 * // ✅ GET /labourers
 * 
 * @GetMapping public ResponseEntity<List<LabourerDTO>> getAllLabourers() {
 * 
 * List<LabourerDTO> response = labourerRepository.findAll() .stream()
 * .map(this::mapToDTO) .collect(Collectors.toList());
 * 
 * return ResponseEntity.ok(response); }
 * 
 * // ✅ GET /labourers/{id}
 * 
 * @GetMapping("/{id}") public ResponseEntity<LabourerDTO>
 * getLabourerById(@PathVariable UUID id) {
 * 
 * return labourerRepository.findById(id) .map(labourer ->
 * ResponseEntity.ok(mapToDTO(labourer)))
 * .orElse(ResponseEntity.notFound().build()); }
 * 
 * // ✅ GET /labourers/search?name=
 * 
 * @GetMapping("/search") public ResponseEntity<List<LabourerDTO>>
 * searchByName(@RequestParam String name) {
 * 
 * List<LabourerDTO> response = labourerRepository
 * .findByNameContainingIgnoreCase(name) .stream() .map(this::mapToDTO)
 * .collect(Collectors.toList());
 * 
 * return ResponseEntity.ok(response); }
 * 
 * // 🔁 Mapper (Entity → DTO) private LabourerDTO mapToDTO(Labourer labourer) {
 * return new LabourerDTO( labourer.getId(), labourer.getName(),
 * labourer.getPhoneNumber(), labourer.isActive() ); } }
 */
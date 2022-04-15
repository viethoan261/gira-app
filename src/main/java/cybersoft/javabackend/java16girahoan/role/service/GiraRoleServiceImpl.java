package cybersoft.javabackend.java16girahoan.role.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import cybersoft.javabackend.java16girahoan.role.dto.GiraRoleDTO;
import cybersoft.javabackend.java16girahoan.role.mapper.GiraRoleMapper;
import cybersoft.javabackend.java16girahoan.role.model.GiraRole;
import cybersoft.javabackend.java16girahoan.role.repository.GiraRoleRepository;

@Service
public class GiraRoleServiceImpl implements GiraRoleService {
	@Autowired
	private GiraRoleRepository repository;

	@Override
	public List<GiraRole> findAllEntity() {
		return repository.findAll();
	}

	@Override
	public GiraRole save(GiraRoleDTO dto) {
		// map dto to entity
		GiraRole role = GiraRoleMapper.INSTANCE.mapToEntity(dto);
		return repository.save(role);
	}
	@CacheEvict("id")
	@Override
	public GiraRole update(UUID id, @Valid GiraRoleDTO dto) {
		Optional<GiraRole> roleOpt = repository.findById(id);
		
		if (roleOpt.isEmpty()) {
			return null;
		}
		GiraRole currentRole = roleOpt.get();
		
		//check if role code is changed
		if(!currentRole.getCode().equals(dto.getCode())) {
			//check if new role code is used?
			Optional<GiraRole> existedRole = repository.findByCode(dto.getCode());
			if (existedRole.isPresent())

				return null;
			currentRole.setCode(dto.getCode());

		}
		currentRole.setDescription(dto.getDescription());
		
		
		return repository.save(currentRole);
	}
	
	@Cacheable("id")
	@Override
	public GiraRole findById(String id) {
		Optional<GiraRole> roleOpt = repository.findById(UUID.fromString(id));
		
		return roleOpt.orElse(null);
	}

}
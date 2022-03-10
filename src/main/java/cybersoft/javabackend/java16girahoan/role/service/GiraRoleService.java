package cybersoft.javabackend.java16girahoan.role.service;

import java.util.List;

import cybersoft.javabackend.java16girahoan.role.dto.GiraRoleDTO;
import cybersoft.javabackend.java16girahoan.role.model.GiraRole;

public interface GiraRoleService {
	List<GiraRole> findAllEntity();
	GiraRole save(GiraRoleDTO dto);
}
package cybersoft.javabackend.java16girahoan.user.service;

import java.util.List;

import cybersoft.javabackend.java16girahoan.user.dto.GiraUserDTO;
import cybersoft.javabackend.java16girahoan.user.dto.GiraUserRolesDTO;
import cybersoft.javabackend.java16girahoan.user.dto.GiraUserWithRolesDTO;

public interface GiraUserService {
	GiraUserDTO createNewUser(GiraUserDTO dto);

	List<GiraUserRolesDTO> findUserWithRolesByUsername(String username);

	GiraUserWithRolesDTO findUserWithRolesByUsernameUsingJoin(String username);
}
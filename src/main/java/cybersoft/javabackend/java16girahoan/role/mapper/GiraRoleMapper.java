package cybersoft.javabackend.java16girahoan.role.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import cybersoft.javabackend.java16girahoan.role.dto.GiraRoleDTO;
import cybersoft.javabackend.java16girahoan.role.model.GiraRole;

@Mapper
public interface GiraRoleMapper {
	GiraRoleMapper INSTANCE = Mappers.getMapper(GiraRoleMapper.class);
	
	GiraRole mapToEntity(GiraRoleDTO dto);

	

	GiraRoleDTO toGiraRoleDTO(GiraRole role);
}
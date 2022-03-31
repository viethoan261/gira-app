package cybersoft.javabackend.java16girahoan.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import cybersoft.javabackend.java16girahoan.user.dto.GiraUserDTO;
import cybersoft.javabackend.java16girahoan.user.model.GiraUser;

@Mapper
public interface GiraUserMapper {
	GiraUserMapper INSTANCE = Mappers.getMapper(GiraUserMapper.class);
	
	GiraUser toModel(GiraUserDTO dto);
	
	GiraUserDTO toDTO(GiraUser model);
}
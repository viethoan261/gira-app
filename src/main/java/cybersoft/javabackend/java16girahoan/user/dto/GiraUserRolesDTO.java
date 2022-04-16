package cybersoft.javabackend.java16girahoan.user.dto;

import java.util.UUID;

public interface GiraUserRolesDTO {
	// Spring Projection
	UUID getId();
	String getCode();
	String getDescription();
}
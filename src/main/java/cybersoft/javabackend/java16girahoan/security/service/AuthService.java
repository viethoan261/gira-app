package cybersoft.javabackend.java16girahoan.security.service;

import cybersoft.javabackend.java16girahoan.security.dto.LoginDTO;

public interface AuthService {
	String login(LoginDTO dto);
}

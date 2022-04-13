package cybersoft.javabackend.java16girahoan.security.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import cybersoft.javabackend.java16girahoan.security.validation.ExistedUser;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
public class LoginDTO {
	@NotBlank(message = "{security.login.username.notblank}")
	@Size(min = 3, max = 100, message = "{user.username.size}")
	@ExistedUser(message = "{security.login.username.notexisted}")
	private String username;
	
	
	@NotBlank(message = "{security.login.password.notblank}")
	@Size(min = 8)
	private String password;
}

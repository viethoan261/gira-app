package cybersoft.javabackend.java16girahoan.user.validation.validator;

import java.util.Optional;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;



import cybersoft.javabackend.java16girahoan.user.model.GiraUser;
import cybersoft.javabackend.java16girahoan.user.repository.GiraUserRepository;
import cybersoft.javabackend.java16girahoan.user.validation.annotation.UniqueUsername;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {
	@Autowired
	private GiraUserRepository repository;
	
	private String message;
	@Override
	public void initialize(UniqueUsername uniqueUsername) {
		 message = uniqueUsername.message();
	}
	@Override
	public boolean isValid(String username, ConstraintValidatorContext context) {
		if(username == null)
			return false;
		
		Optional<GiraUser> userOpt = repository.findByUsername(username);
		
		if(userOpt.isEmpty()) {
			return true;
		}
		
		context.buildConstraintViolationWithTemplate(message)
			.addConstraintViolation()
			.disableDefaultConstraintViolation();
		return false;
	}
	
}

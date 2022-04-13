package cybersoft.javabackend.java16girahoan.security.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import cybersoft.javabackend.java16girahoan.user.validation.validator.UniqueUsernameValidator;

@Constraint(validatedBy = ExistedUserValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ExistedUser {
	String message() default "User is not existed.";
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
}
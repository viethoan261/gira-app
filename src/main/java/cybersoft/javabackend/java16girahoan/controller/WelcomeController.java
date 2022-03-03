package cybersoft.javabackend.java16girahoan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/welcome")
	public Object welcome() {
		return "heloo";
	}
}

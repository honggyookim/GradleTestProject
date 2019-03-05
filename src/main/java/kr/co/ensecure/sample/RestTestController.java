package kr.co.ensecure.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestTestController {
	
	@GetMapping("/test")
	private String test() {
		return "RestController request completed.";
	}
}

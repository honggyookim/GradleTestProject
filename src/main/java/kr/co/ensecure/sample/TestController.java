package kr.co.ensecure.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/")
	private void test() {
		System.out.println("Controller test completed.");
	}
}

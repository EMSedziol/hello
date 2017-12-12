package Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {
	
	@RequestMapping("/Hello")  // pom.xml needs to have the 'web' setting <artifactId>spring-boot-starter-web</artifactId>
	       // maps string to a http site  http://localhost:8080/Hello
	@ResponseBody
		// returns the response coming back

	String home() {
		return "Hello World";
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleController.class, args);

	}

}

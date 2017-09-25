package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
   
	String HELLO_TXT = "Hello World!";
	
    @RequestMapping("/")
    public String index() {
        return HELLO_TXT;
    }
    
}

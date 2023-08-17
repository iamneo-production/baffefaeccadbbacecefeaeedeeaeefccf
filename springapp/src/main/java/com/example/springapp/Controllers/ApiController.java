import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController {
    @GetMapping("/welcome")
    public class Welcome()
    {
        return "Welcome String Boot!";
        
    }
}

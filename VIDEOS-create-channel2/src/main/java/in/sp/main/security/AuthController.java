package in.sp.main.security;

import in.sp.main.security.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Replace with actual user validation logic.
        if ("user".equals(username) && "password".equals(password)) {
            return jwtTokenUtil.generateToken(username);
        }
        throw new RuntimeException("Invalid credentials");
    }
}

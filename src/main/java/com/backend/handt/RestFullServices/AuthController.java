package com.backend.handt.RestFullServices;


import com.backend.handt.Responses.LoginResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @RequestMapping("/v2/account/login")
    @ResponseBody
    public LoginResponse login() {
        return new LoginResponse();
    }
}

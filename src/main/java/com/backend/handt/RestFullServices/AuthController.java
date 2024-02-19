package com.backend.handt.RestFullServices;


import com.backend.handt.DBHandler.UserAccountHandler;
import com.backend.handt.Responses.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class AuthController {

    @Autowired
    UserAccountHandler userHanlder;

    @RequestMapping(value = "/account/login", method = RequestMethod.GET)
    @ResponseBody
    public LoginResponse login() {
        userHanlder.getAllData();
        return new LoginResponse();
    }
}

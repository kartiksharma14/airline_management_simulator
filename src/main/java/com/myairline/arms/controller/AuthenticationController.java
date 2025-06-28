package com.myairline.arms.controller;

import com.myairline.arms.dto.AuthenticationRequest;
import com.myairline.arms.dto.AuthenticationResponse;
import com.myairline.arms.dto.RegisterRequest;
import com.myairline.arms.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;


    @GetMapping("/login")
    public String login(){
        return "User/login";
    }

    @GetMapping("/registration")
    public String registration() {
        return "User/registration";}


    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> registerUser(@RequestBody RegisterRequest request){
        return  ResponseEntity.ok(service.registerUser(request));
    }



  @PostMapping("/authenticate")
  public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
    AuthenticationResponse response = service.authenticate(request);
          if(response !=null) {
              return ResponseEntity.ok(response);
          }
        return null;
}


}

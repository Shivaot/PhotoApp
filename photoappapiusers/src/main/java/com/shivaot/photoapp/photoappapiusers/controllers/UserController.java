package com.shivaot.photoapp.photoappapiusers.controllers;

import com.shivaot.photoapp.photoappapiusers.dtos.ResponseDto;
import com.shivaot.photoapp.photoappapiusers.dtos.UserDto;
import com.shivaot.photoapp.photoappapiusers.models.CreateUserRequestModel;
import com.shivaot.photoapp.photoappapiusers.services.UserService;
import com.shivaot.photoapp.photoappapiusers.services.ValidationErrorService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private Environment env;
    @Autowired
    UserService userService;
    @Autowired
    ValidationErrorService validationErrorService;

    @GetMapping("/status/check")
    public String status() {
        return "Working on port " + env.getProperty("local.server.port");
    }

    @PostMapping
    public ResponseEntity<?> createUser(@Valid @RequestBody CreateUserRequestModel createUserRequestModel, BindingResult result) {

        log.info("Create User is called");

        ResponseEntity<?> errorMap = validationErrorService.ValidationError(result);
        if (errorMap != null) return errorMap;

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDto userDto = modelMapper.map(createUserRequestModel,UserDto.class);
        userService.createUSer(userDto);

        return new ResponseEntity<>(new ResponseDto("User Created",new Date()), HttpStatus.CREATED);
    }
}

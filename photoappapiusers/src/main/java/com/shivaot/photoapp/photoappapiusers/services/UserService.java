package com.shivaot.photoapp.photoappapiusers.services;

import com.shivaot.photoapp.photoappapiusers.dtos.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUSer(UserDto userDto);
    UserDto getUserDetailsByEmail(String email);
}

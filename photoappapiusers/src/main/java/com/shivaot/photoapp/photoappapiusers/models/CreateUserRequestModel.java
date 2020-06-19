package com.shivaot.photoapp.photoappapiusers.models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CreateUserRequestModel {

    @NotNull(message = "First Name cannot be null")
    @Size(min = 2,message = "First Name cannot be less than 2 chars")
    private String firstName;
    @NotNull(message = "Last Name cannot be null")
    @Size(min = 2,message = "Last Name cannot be less than 2 chars")
    private String lastName;
    @NotNull(message = "email cannot be null")
    @Email
    private String email;
    @NotNull(message = "Password cannot be null")
    @Size(min = 8,max = 16,message = "Password must be equal or greater than 8 chars and less than 16 chars")
    private String password;

}

package com.shivaot.photoapp.photoappapiusers.services;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

public interface ValidationErrorService {
    ResponseEntity<?> ValidationError(BindingResult result);
}

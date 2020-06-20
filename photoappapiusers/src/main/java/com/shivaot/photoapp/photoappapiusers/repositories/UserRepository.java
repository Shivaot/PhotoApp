package com.shivaot.photoapp.photoappapiusers.repositories;

import com.shivaot.photoapp.photoappapiusers.data.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Long> {
    UserEntity findByEmail(String email);
}

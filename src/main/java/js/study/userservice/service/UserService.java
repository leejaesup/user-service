package js.study.userservice.service;

import js.study.userservice.dto.UserDto;
import js.study.userservice.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();

}

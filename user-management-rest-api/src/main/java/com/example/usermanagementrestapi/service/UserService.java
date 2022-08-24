package com.example.usermanagementrestapi.service;

import com.example.usermanagementrestapi.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public List<UserDto> getListUser();

    public UserDto getUserByID(int id);

    public List<UserDto> searchUser(String keyword);
}

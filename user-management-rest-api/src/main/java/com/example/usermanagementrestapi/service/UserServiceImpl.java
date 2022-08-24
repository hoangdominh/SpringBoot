package com.example.usermanagementrestapi.service;

import com.example.usermanagementrestapi.entity.User;
import com.example.usermanagementrestapi.exception.NotFoundException;
import com.example.usermanagementrestapi.model.dto.UserDto;
import com.example.usermanagementrestapi.model.mapper.UserMapper;
import com.sun.scenario.effect.impl.prism.ps.PPSBlend_ADDPeer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1,"Đỗ Minh Hoàng", "minhhoang@gmail.com","0373071999","avatar.img","123"));
        users.add(new User(2,"Nguyễn Văn Ninh", "vanninh@gmail.com","0123456789","avatar.img1","1"));
        users.add(new User(3,"Nguyễn Thế Mạnh", "themanh@gmail.com","0254879631","avatar.img2","2"));
        users.add(new User(4,"Lê Đức Minh", "ducminh@gmail.com","1216748455","avatar.img3","3"));
    }

    @Override
    public List<UserDto> getListUser() {
        List<UserDto> result = new ArrayList<UserDto>();
        for (User user :users) {
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }

    @Override
    public UserDto getUserByID(int id) {
        for (User user :users) {
            if (user.getId() == id){
                return UserMapper.toUserDto(user);
            }
        }
        throw new NotFoundException("User không tồn tại trong hệ thống");
    }

    @Override
    public List<UserDto> searchUser(String keyword) {
        List<UserDto> result = new ArrayList<UserDto>();
        for (User user :users) {
            if (user.getName().contains(keyword)){
                result.add(UserMapper.toUserDto(user));
            }
        }
        return result;
    }
}

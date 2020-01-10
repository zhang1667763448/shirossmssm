package com.zyc.dao;

import com.zyc.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User findByName(String name);
}

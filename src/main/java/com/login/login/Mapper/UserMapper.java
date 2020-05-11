package com.login.login.Mapper;

import com.login.login.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author dingwl
 * @date 2020/3/8 9:02
 */
@Mapper
@Repository
public interface UserMapper {

    User login(User user);

    int regist(User user);
}

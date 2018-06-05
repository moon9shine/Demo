package com.njsky.index.mapper;

import com.njsky.kernel.entity.User;

import tk.mybatis.mapper.common.Mapper;

/**
 * Created by mengxu on 2017/9/27.
 */
public interface UserMapper extends Mapper<User> {
     User selectUser(User user);
}

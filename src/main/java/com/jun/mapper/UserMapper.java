package com.jun.mapper;

import com.jun.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getUserById(long id);

}

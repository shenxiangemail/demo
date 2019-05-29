package com.yj.demorepository.mybatisTestRepository.mapper;

import com.yj.demobeen.mybatisTestBeen.MybatisTestBeen;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sx
 * @despriction
 * @date 2019/5/28 16:42
 * @nodify by :
 */
public interface IMybatisTestMapper {
//    @Select("select * from pay_user_info")
    List<MybatisTestBeen> findUserInfo();
}

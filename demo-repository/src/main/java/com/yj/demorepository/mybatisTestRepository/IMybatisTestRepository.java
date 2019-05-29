package com.yj.demorepository.mybatisTestRepository;

import com.yj.demobeen.mybatisTestBeen.MybatisTestBeen;

import java.util.List;

/**
 * @author sx
 * @despriction
 * @date 2019/5/28 16:40
 * @nodify by :
 */
public interface IMybatisTestRepository {
    List<MybatisTestBeen> findUserInfo();
}

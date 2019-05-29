package com.yj.demoservice.mybatisTestService;

import com.yj.demobeen.mybatisTestBeen.MybatisTestBeen;

import java.util.List;

/**
 * @author sx
 * @despriction
 * @date 2019/5/28 16:26
 * @nodify by :
 */
public interface IMybatisTestService {
    List<MybatisTestBeen>  findUserInfo();
}

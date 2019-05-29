package com.yj.demorepository.mybatisTestRepository.impl;

import com.yj.demobeen.mybatisTestBeen.MybatisTestBeen;
import com.yj.demorepository.mybatisTestRepository.IMybatisTestRepository;
import com.yj.demorepository.mybatisTestRepository.mapper.IMybatisTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author sx
 * @despriction
 * @date 2019/5/28 16:41
 * @nodify by :
 */
@Repository
public class MybatisTestRepository implements IMybatisTestRepository {

    @Autowired
    private IMybatisTestMapper mybatisTestMapper;

    public List<MybatisTestBeen> findUserInfo(){
        return mybatisTestMapper.findUserInfo();
    }

}

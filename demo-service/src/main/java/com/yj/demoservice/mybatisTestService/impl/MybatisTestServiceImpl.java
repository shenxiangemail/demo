package com.yj.demoservice.mybatisTestService.impl;

import com.yj.demobeen.mybatisTestBeen.MybatisTestBeen;
import com.yj.demorepository.mybatisTestRepository.IMybatisTestRepository;
import com.yj.demoservice.mybatisTestService.IMybatisTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sx
 * @despriction
 * @date 2019/5/28 16:27
 * @nodify by :
 */

@Service
public class MybatisTestServiceImpl implements IMybatisTestService {

    @Autowired
    private IMybatisTestRepository mybatisTestRepository;

    public List<MybatisTestBeen> findUserInfo(){
      return  mybatisTestRepository.findUserInfo();
    }

}

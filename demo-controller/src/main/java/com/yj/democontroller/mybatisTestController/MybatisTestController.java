package com.yj.democontroller.mybatisTestController;

import com.yj.demobeen.mybatisTestBeen.MybatisTestBeen;
import com.yj.demoservice.mybatisTestService.IMybatisTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sx
 * @despriction
 * @date 2019/5/28 16:21
 * @nodify by :
 */

@RestController
@RequestMapping(value = "/mybatis")
@Slf4j
public class MybatisTestController {

    @Autowired
    private IMybatisTestService mybatisTestService;

    @RequestMapping(value = "/findUserInfo")
    public Object findUserInfo(){

        log.info("接收到请求");
        List<MybatisTestBeen> mybatisTestBeen =mybatisTestService.findUserInfo();
        return mybatisTestBeen;
//        return "";
    }
}

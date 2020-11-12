package cn.ght.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * @Author: ght
 * @Date: 2020/11/12
 */
@RestController
@RequestMapping("/sys/")
@Api("登录页")
public class LoginController {

    @ApiOperation("登录")
    @RequestMapping("/login")
    public Map<String,String> getLogin() {
        return Collections.singletonMap("msg","success");
    }
}

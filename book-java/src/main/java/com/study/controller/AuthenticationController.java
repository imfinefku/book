package com.study.controller;

import com.alibaba.fastjson.JSONObject;
import com.common.bean.*;
import com.common.annotation.NoLogin;
import com.common.bean.CommonResult;
import com.common.util.JWTUtil;
import com.common.util.UserContextHolder;
import com.study.service.AuthenticationService;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.*;

/**
 * 鉴权controller
 */
@RestController
@RequestMapping("authority")
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @Value("${study.wx.appId:}")
    public String appId;

    @Value("${study.wx.appSecret:}")
    public String appSecret;

    @Value("${study.wx.requestUrl:}")
    public String requestUrl;

    @Autowired
    private AuthenticationService authenticationService;

    /**
     * 修改角色
     *
     * @param role
     * @return
     */
    @PostMapping("/updateRole")
    public CommonResult updateRole(@RequestBody @Valid Role role, BindingResult validResult) {
        int result = authenticationService.updateRole(role);
        if (result > 0) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    /**
     * 删除角色
     *
     * @param role
     * @return
     */
    @PostMapping("/deleteRole")
    public CommonResult deleteRole(@RequestBody Role role) {
        int result = authenticationService.deleteRole(role.getId());
        if (result > 0) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    /**
     * 删除菜单
     *
     * @param menu
     * @return
     */
    @PostMapping("/deleteMenu")
    public CommonResult deleteMenu(@RequestBody Menu menu) {
        int result = authenticationService.deleteMenu(menu);
        if (result > 0) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    /**
     *
     * @return
     */
    @GetMapping("/getMenu")
    public CommonResult getMenu() {
        List<Menu> dataList = authenticationService.getMenu();
        return CommonResult.success(dataList);
    }


    /**
     *
     *
     * @param user
     * @return
     */
    @PostMapping("/updateUser")
    public CommonResult updateUser(@RequestBody @Valid User user, BindingResult validResult) {
        return CommonResult.success();
    }

    /**
     *
     *
     * @param user
     * @return
     */
    @PostMapping("/deleteUser")
    public CommonResult deleteUser(@RequestBody User user) {
        authenticationService.deleteUser(user.getId());
        return CommonResult.success();
    }

}

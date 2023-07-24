package com.study.controller;

import com.common.util.UserContextHolder;
import com.study.bean.specific.*;
import com.common.bean.CommonResult;
import com.study.service.SpecificService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("specific")
public class SpecificController {

    @Autowired
    private SpecificService service;


    /**
     * 分页获取标签
     *
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("/getTagPage")
    public CommonResult getTagPage(@RequestParam int page, @RequestParam int limit) {
        Map dataMap = new HashMap();
        List<Tag> dataList = service.getTagPage(dataMap);
        int count = service.getTagCount();
        return CommonResult.success(dataList, count);
    }

    /**
     * 获取所有标签
     *
     * @return
     */
    @GetMapping("/getTagAll")
    public CommonResult getTagAll() {
        List<Tag> dataList = service.getTagAll();
        return CommonResult.success(dataList);
    }

    /**
     * 添加公告
     *
     * @param notice
     * @param validResult
     * @return
     */
    @PostMapping("/addNotice")
    public CommonResult addNotice(@RequestBody @Valid Notice notice, BindingResult validResult) {
        Date date = new Date();
        return CommonResult.success();
    }

    /**
     * 修改公告
     *
     * @param notice
     * @param validResult
     * @return
     */
    @PostMapping("/updateNotice")
    public CommonResult updateNotice(@RequestBody @Valid Notice notice, BindingResult validResult) {
        return CommonResult.success();
    }

    /**
     * 删除公告
     *
     * @param notice
     * @return
     */
    @PostMapping("/deleteNotice")
    public CommonResult deleteNotice(@RequestBody Notice notice) {
        return CommonResult.success();
    }

    /**
     * 分页获取公告
     *
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("/getNoticePage")
    public CommonResult getNoticePage(@RequestParam int page, @RequestParam int limit) {
        Map dataMap = new HashMap();
        List<Notice> dataList = service.getNoticePage(dataMap);
        int count = service.getNoticeCount();
        return CommonResult.success(dataList, count);
    }

}
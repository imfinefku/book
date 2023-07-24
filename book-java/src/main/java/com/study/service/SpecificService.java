package com.study.service;

import com.common.util.UserContextHolder;
import com.study.bean.specific.*;
import com.study.dao.SpecificMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SpecificService {

    @Autowired
    private SpecificMapper mapper;


    public List<Tag> getTagPage(Map dataMap) {
        return mapper.getTagPage(dataMap);
    }

    public List<Tag> getTagAll() {
        return mapper.getTagAll();
    }

    public int getTagCount() {
        return mapper.getTagCount();
    }

    public List<Notice> getNoticePage(Map dataMap) {
        return mapper.getNoticePage(dataMap);
    }

    public int getNoticeCount() {
        return mapper.getNoticeCount();
    }
}

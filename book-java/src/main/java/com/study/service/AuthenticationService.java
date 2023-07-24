package com.study.service;

import com.common.bean.*;
import com.study.dao.AuthenticationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class AuthenticationService {

    @Autowired
    private AuthenticationMapper authenticationMapper;

    public int updateRole(Role role) {
        return authenticationMapper.updateRole(role);
    }

    public int deleteRole(String id) {
        authenticationMapper.deleteRoleMenu(id);
        return authenticationMapper.deleteRole(id);
    }

    public int deleteMenu(Menu menu) {
        return authenticationMapper.deleteMenu(menu);
    }

    public List<Menu> getMenu() {
        return new ArrayList<Menu>();
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void deleteUser(String id) {
        authenticationMapper.deleteUser(id);
        authenticationMapper.deleteUserRole(id);
    }

}

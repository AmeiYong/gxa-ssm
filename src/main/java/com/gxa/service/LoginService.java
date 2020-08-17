package com.gxa.service;

import com.gxa.dto.ResultDTO;
import com.gxa.pojo.Admin;

import javax.servlet.http.HttpSession;
import javax.xml.ws.soap.Addressing;

/**
 *
 */
public interface LoginService {

    /**
     *
     * 管理员登录
     * @param admin
     * @return
     */
       ResultDTO  login(Admin admin, HttpSession session);



}

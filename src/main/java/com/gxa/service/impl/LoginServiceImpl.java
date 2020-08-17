package com.gxa.service.impl;

import com.gxa.dto.ResultDTO;
import com.gxa.mapper.AdminMapper;
import com.gxa.pojo.Admin;
import com.gxa.service.LoginService;
import com.gxa.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;

/**
 * 登录的业务层
 */
@Service
public class LoginServiceImpl  implements LoginService {

    @Autowired
    private AdminMapper adminMapper;
    /**
     * 登录的方法
     * @param admin：管理员对象
     * @return
     */
    @Override
    public ResultDTO login(Admin admin, HttpSession session) {
     //写业务逻辑
        //1.进行数据校验

        //2.通过用户名进行查询
     Admin dbadmin  =   adminMapper.findByName(admin.getName());
      //判断是否存在这个管理员
        if (dbadmin==null) {
            return  new ResultDTO(1001,"用户不存在!",null);
        }
        //比对密码
        if (!dbadmin.getPwd().equals(MD5Util.MD55(admin.getPwd()))) {
            return  new ResultDTO(1002,"密码错误!",null);
        }

       //保持session会话
        session.setAttribute("admin",dbadmin.getName());
        //更新登录时间
        dbadmin.setLastLoginTime(new Timestamp(System.currentTimeMillis()));
        adminMapper.update(dbadmin);


        return new ResultDTO(200,"恭喜你！登录成功！",null);
    }
}

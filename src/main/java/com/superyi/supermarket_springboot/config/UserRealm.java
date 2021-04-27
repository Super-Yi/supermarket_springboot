/*
package com.superyi.supermarket_springboot.config;

import com.superyi.supermarket_springboot.model.entity.User;
import com.superyi.supermarket_springboot.service.AdminService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

import javax.annotation.Resource;

*/
/**
 * @author hzy
 * @date 2021/4/22
 **//*

public class UserRealm extends AuthorizingRealm {
    @Resource
    private AdminService adminService;
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermission("user:add");
        //拿到当前登录的对象
        Subject subject = SecurityUtils.getSubject();
        User currentUser = (User) subject.getPrincipal();
        //设置当前用户的权限
        info.addStringPermission(currentUser.getAddress());

        return info;
    }
    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken userToken = (UsernamePasswordToken) token;
        User user = new User();
        user.setUserName(userToken.getUsername());
        User admin = adminService.getAdmin(user);
        if (admin == null) {//没有这个用户
            return null;//UnKnowAccountException
        }
        //密码认证，shiro做
        return new SimpleAuthenticationInfo(admin,admin.getUserPassword(),"");
    }
}
*/

/*
package com.superyi.supermarket_springboot.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

*/
/**
 * @author hzy
 * @date 2021/4/22
 **//*

//@Configuration
public class ShiroConfig {
    //ShiroFilterFactoryBean
    @Bean
    public ShiroFilterFactoryBean GetShiroFilterFactoryBean(@Qualifier("getDefaultWebSecurityManager") DefaultWebSecurityManager manager) {
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        //设置安全管理器
        bean.setSecurityManager(manager);
        //添加shiro内置过滤器
        */
/*
            anon:无需认证就能访问
            authc:必须认证了才能访问
            user:必须拥有 记住我 功能才能使用
            perms:拥有对某个资源的权限才能访问
            role:拥有某个角色的权限才能访问
         *//*

        Map<String,String> filterMap = new LinkedHashMap<>();
        filterMap.put("/bill/*", "authc");
        bean.setFilterChainDefinitionMap(filterMap);
        return bean;
    }
    //DefaultWebSecurityManager
    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联userRealm
        securityManager.setRealm(userRealm);
        return securityManager;
    }
    //创建realm对象，需要自定义类
    @Bean
    public UserRealm userRealm() {
        return new UserRealm();
    }
}
*/

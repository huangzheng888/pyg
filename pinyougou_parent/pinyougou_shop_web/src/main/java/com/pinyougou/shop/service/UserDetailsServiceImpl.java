package com.pinyougou.shop.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbSeller;
import com.pinyougou.sellergoods.service.SellerService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * 权限拓展认证类
 */
public class UserDetailsServiceImpl implements UserDetailsService {
    //调用服务方法
    @Reference
    private SellerService sellerService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //构造用户的角色列表
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_SELLER"));

        //查询商家信息,并且状态为审核通过
        TbSeller seller = sellerService.getById(username);
        //如果查找到相关信息,并且为审核通过状态
        if (seller!=null && "1".equals(seller.getStatus())){
            //返回真是存在的用户,让security框架对配置用户与密码信息是否匹配
            return new User(username,seller.getPassword(),authorities);
        }
        //商家信息不存在,返回null
        return null;

    }
}

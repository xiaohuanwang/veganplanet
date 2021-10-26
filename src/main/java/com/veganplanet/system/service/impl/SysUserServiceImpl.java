package com.veganplanet.system.service.impl;

import com.veganplanet.system.entity.SysUser;
import com.veganplanet.system.entity.SysUserExample;
import com.veganplanet.system.mapper.SysUserMapper;
import com.veganplanet.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @date: 2021/10/26 3:21 下午
 * @author: 王小欢
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> listSysUser() {
        return sysUserMapper.selectByExample(new SysUserExample());
    }
}

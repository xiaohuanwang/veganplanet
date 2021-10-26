package com.veganplanet.system.controller;

import com.veganplanet.common.util.CommonResult;
import com.veganplanet.system.entity.SysUser;
import com.veganplanet.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:
 * @date: 2021/10/26 2:53 下午
 * @author: 王小欢
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping(value = {"/listSysUser"})
    @ResponseBody
    public CommonResult<List<SysUser>> listSysUser() {
        List<SysUser> sysUserList = sysUserService.listSysUser();
        return CommonResult.success(sysUserList);
    }
}

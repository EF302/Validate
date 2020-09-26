package com.cms.launcher.controller;


import javax.validation.constraints.NotNull;

import com.alibaba.fastjson.JSONObject;
import com.cms.common.util.CommonUtil;
import com.cms.launcher.dao.SponsorForValidatedMapper;
import com.cms.launcher.entity.SponsorForValidated;
import com.cms.launcher.groups.First;
import com.cms.launcher.groups.groupSequence.Group;
import com.cms.launcher.service.imp.SponsorForValidatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sponsorForValidated")
@Validated
public class SponsorControllerForValidatedTest {

    @Autowired
    private SponsorForValidatedService sponsorService;

    @Autowired
    private SponsorForValidatedMapper sponsorMapper;

    //==========说明：这里主要是进行请参数校验，并不需要管方法体中实际实现代码==============
    /**
     * 根据对象中的id查询
     */
    @PostMapping("/selectById")
    public JSONObject selectById(@RequestBody @Validated({First.class})  SponsorForValidated sponsorForValidated){

        return  CommonUtil.successJson("测试成功！");
    }

    /**
     * 根据基本数据类型值id查询
     */
    //注意：spring的MethodValidationPostProcessor拦截器，只可用于基本数据类型及其包装类（包括String）的拦截
    @PostMapping("/selectById2")
    public JSONObject selectById2(@NotNull Integer id){

        return  CommonUtil.successJson("测试成功！");
    }

    /**
     * 根据id更新
     */
    @PostMapping("/updateById")
    public JSONObject updateById(@RequestBody @Validated SponsorForValidated sponsorForValidated){

        return  CommonUtil.successJson(sponsorMapper.updateById(sponsorForValidated));
    }

    /**
     * 根据id和name更新
     */
    @PostMapping("/updateByIdAndName")
    public JSONObject updateByIdAndName(@RequestBody @Validated({Group.class}) SponsorForValidated sponsorForValidated){

        return  CommonUtil.successJson("测试成功！");
    }
}

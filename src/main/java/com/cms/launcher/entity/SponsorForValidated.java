package com.cms.launcher.entity;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.cms.launcher.groups.First;
import com.cms.launcher.groups.Second;
import com.cms.launcher.groups.Third;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 为练习参数数据校验而建
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "sponsor")
public class SponsorForValidated implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "赞助商id不能为空",groups = {First.class})
    @TableId(value = "sponsor_id", type = IdType.AUTO)
    private Integer sponsorId;

    //注意：默认情况下，null的判读逻辑是最优先的，即使设置GroupSequence也没有用,但对于都有判空逻辑的注解，GroupSequence配置可以起作用
    @NotNull(message = "赞助商name不能为空",groups = {First.class})
    @NotBlank(message = "name不能为null或空字符串",groups = {Second.class})
    @Size(min=3,max=10,message = "name长度应该为：3-10",groups = {Third.class})
    private String sponsorName;

    @NotNull
    private String sponsorStatement;

}

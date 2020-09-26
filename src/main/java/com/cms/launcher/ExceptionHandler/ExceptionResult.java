package com.cms.launcher.ExceptionHandler;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * 异常结果封装
 * @param <T>
 */

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExceptionResult<T> {

    private Integer code;
    private String message;
    private T data;

    public ExceptionResult() {
        this.code = 200;
        this.message = "操作成功";
    }

    /**
     * 用于错误处理
     * @param code 错误码
     * @param message 错误提示信息
     */
    public ExceptionResult(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public static ExceptionResult<String> error(Integer code, String msg){
        return new ExceptionResult<>(code,msg);
    }
}

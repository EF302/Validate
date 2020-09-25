package com.cms.launcher.ExceptionHandler;

//注意：由于已经存在全局异常处理类：com.cms.common.exception.GlobalExceptionHandler，所以，这里配置就没有用了，也没必要

/*@Slf4j
@ControllerAdvice
public class GlobalExceptionHandlerForvalidated {

    private final static String EXCEPTION_MSG_KEY = "Exception message : ";

    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ExceptionResult handleValidException(MethodArgumentNotValidException e) {
        //日志记录错误信息
        log.error(Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage());
        //将错误信息返回给前台
        return ExceptionResult.error(103, Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage());
    }
}*/

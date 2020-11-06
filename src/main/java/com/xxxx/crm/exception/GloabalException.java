package com.xxxx.crm.exception;


import com.xxxx.crm.base.ResultInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GloabalException {

    @ResponseBody
    @ExceptionHandler(value=Exception.class)
    public ResultInfo exec(Exception e){
        ResultInfo info = new ResultInfo();
        if(e instanceof ParamsException){
            info.setCode(2001);
            info.setMsg("参数异常");
            info.setResult(((ParamsException)e).getMessage());
        }else if (e instanceof MyException){
            info.setCode(2002);
            info.setMsg("我的异常");
            info.setResult(((MyException) e).getMsg());
        }else if(e instanceof NullPointerException){
            info.setCode(2003);
            info.setMsg("空指针异常");
        }else if(e instanceof NoCookieException){
            info.setCode(2004);
            info.setMsg("没有cookie");
        }
        return info;
    }

}

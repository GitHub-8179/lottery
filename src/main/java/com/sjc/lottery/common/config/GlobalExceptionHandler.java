package com.sjc.lottery.common.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by qhong on 2018/5/28 15:51
 * 配置全局异常捕捉
 **/
@ControllerAdvice
@Controller
public class GlobalExceptionHandler {

	public GlobalExceptionHandler() {
		super();
	}

    /**
     * 全局异常
     * @param req
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseEntity handleException(HttpServletRequest req, Exception e) throws Exception {
        e.printStackTrace();
        return new ResponseEntity("程序异常，请联系管理员！",HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

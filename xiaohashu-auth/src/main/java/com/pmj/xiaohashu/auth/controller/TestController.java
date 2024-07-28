package com.pmj.xiaohashu.auth.controller;

import com.pmj.framework.biz.operationlog.aspect.ApiOperationLog;
import com.pmj.framework.common.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author pmj
 */
@RestController
public class TestController {

    @GetMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response<String> test() {
        return Response.success("Hello, pmj专栏");
    }

    @GetMapping("/test2")
    @ApiOperationLog(description = "测试接口2")
    public Response<User> test2() {
        return Response.success(User.builder()
                .nickName("pmj")
                .createTime(LocalDateTime.now())
                .build());
    }
}

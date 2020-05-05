package com.course.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@Api(value ="/",description = "这个是我全部的get方法")
public class MyGetMethod {

    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
    @ApiOperation(value = "通过这个方法可以获取cookies",httpMethod = "GET")
    public String getCookies(HttpServletResponse response){
         //HttpServerletRequest 装请求信息的类
        //HttpServletResponse 装响应消息的类
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "恭喜您获取cookies成功";
    }


    /**
     *要求客户端携带cookies访问
     */
    @RequestMapping(value="/get/with/cookies",method = RequestMethod.GET)
    @ApiOperation(value = "要求客户端携带cookies访问",httpMethod = "GET")
    public String getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(Objects.isNull(cookies)){
            return "您必须携带cookies信息来";
        }
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                return "恭喜您访问成功！";

            }
        }
        return "您必须携带cookies信息来";
    }

    /**
     * 开发一个需要携带参数才能访问的get请求
     * 第一个实现方式 url : key=value&key =  value
     * 我们来模拟获取商品列表
     */
    @RequestMapping(value = "/get/with/param" ,method = RequestMethod.GET)
    @ApiOperation(value = "开发一个需要携带参数才能访问的get请求 方法一 ",httpMethod = "GET")
    public Map<String ,Integer> getList(@RequestParam Integer start,
                                        @RequestParam Integer end){

        Map<String , Integer>MyList =new HashMap<>();
        MyList.put("鞋",400);
        MyList.put("干脆面",1);
        MyList.put("衬衫",300);
        return MyList;
    }

    /**
     * 第二种需要携带参数访问的get请求
     * url:ip:port/get/with/param/10/20
     */
    @RequestMapping(value = "get/with/param/{start}/{end}")
    @ApiOperation(value = "开发一个需要携带参数才能访问的get请求 方法二 ",httpMethod = "GET")
    public Map myGetList(@PathVariable Integer start,
                         @PathVariable Integer end){
        Map<String , Integer>MyList =new HashMap<>();
        MyList.put("鞋",400);
        MyList.put("干脆面",1);
        MyList.put("衬衫",300);
        return MyList;
    }

}

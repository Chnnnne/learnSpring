package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WangChen
 * @create 2022-11-23 21:14
 * @project: ssm2
 * @ClassName: AccountController
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("findAll方法执行了。。。");
        return "list";
    }
}

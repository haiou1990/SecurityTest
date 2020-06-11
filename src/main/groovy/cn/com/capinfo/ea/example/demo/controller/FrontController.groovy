package cn.com.capinfo.ea.example.demo.controller


import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

import javax.servlet.http.HttpServletRequest

/**
 * 系统前台控制器
 */
@Controller
class FrontController {
    @RequestMapping(value = "/")
    public String index(HttpServletRequest request, Model model) {
        //log
        return "/front/index"
    }
}

package io.saltcat.ucm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by huawei on 3/20/16.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String indexAction(){
        return "index";
    }
}

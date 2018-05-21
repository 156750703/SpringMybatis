package com.jun.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Index {

    Logger logger = Logger.getLogger(Index.class);

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        logger.info("user access index page / ");
        return "Hello World !";
    }
}

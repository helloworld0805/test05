package com.xuecheng.cms.controller;

import com.xuecheng.api.cms.CmsPageControllerApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cms")
@RestController
public class CmsPageController implements CmsPageControllerApi {


    @Override
    @GetMapping("/findList/{page}/{size}")
    public String findList(@PathVariable("page") int page, @PathVariable("size") int size) {
            return "hello"+page+"  "+size;
    }


    @GetMapping("/add")
    public String add(){
        return "添加成功";
    }

    public void insert(){

    }
}

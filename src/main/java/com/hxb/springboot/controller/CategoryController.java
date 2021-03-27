package com.hxb.springboot.controller;

import com.hxb.springboot.pojo.EASYBUY_PRODUCT_CATEGORY;
import com.hxb.springboot.service.CategoryService;
import org.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 和学博
 */
@Controller
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){
        List<EASYBUY_PRODUCT_CATEGORY> list = categoryService.findAll();
        JSONArray array = new JSONArray(list);
        return array.toString();

    }
}

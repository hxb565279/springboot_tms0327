package com.hxb.springboot.controller;

import com.hxb.springboot.pojo.EASYBUY_PRODUCT;
import com.hxb.springboot.service.ProductService;
import org.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author 和学博
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/findByCid")
    @ResponseBody
    public String findByCid(int cid) {
        System.out.println(cid + "============cid");
        List<EASYBUY_PRODUCT> list = productService.findByCid(cid);
        JSONArray productArray = new JSONArray(list);
        return productArray.toString();
    }

    @RequestMapping("/findProductById")
    public ModelAndView findProductById(int id, ModelAndView mv) {
        System.out.println(id);
        EASYBUY_PRODUCT product = productService.findById(id);
        mv.setViewName("productInfo");
        mv.addObject("p1", product);
        return mv;
    }
}

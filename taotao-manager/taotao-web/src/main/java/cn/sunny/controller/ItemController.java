package cn.sunny.controller;

import cn.sunny.pojo.TbItem;
import cn.sunny.service.ItemSeriveImpl;
import cn.sunny.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName
 * @Description TODO
 * @Author sunny
 * @Date 2019-6-19 10:36
 * @Version 1.0
 **/
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/id/{id}")
    @ResponseBody
    public TbItem queryItemById(@PathVariable Long id){
        TbItem item = itemService.getItemById(id);
        return item;
    }
}

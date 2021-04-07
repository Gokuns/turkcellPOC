package com.bilgeadam.gsmhandler.controller;

import com.bilgeadam.gsmhandler.entity.Menu;
import com.bilgeadam.gsmhandler.service.MenuService;
import io.swagger.annotations.Api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api
@RequestMapping("/menu")
@CrossOrigin("*")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<Menu> getMenuList(){
        return menuService.getMenuList();
    }

}

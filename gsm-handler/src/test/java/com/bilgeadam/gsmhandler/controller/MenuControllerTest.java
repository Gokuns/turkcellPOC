package com.bilgeadam.gsmhandler.controller;

import com.bilgeadam.gsmhandler.repository.MenuRepository;
import com.bilgeadam.gsmhandler.service.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MenuControllerTest {

    @InjectMocks
    private MenuController menuController;

    @Mock
    private MenuService menuService;

    @Test
    public void shouldgetMenuList(){
        menuController.getMenuList();
        verify(menuService,times(1)).getMenuList();
    }

}
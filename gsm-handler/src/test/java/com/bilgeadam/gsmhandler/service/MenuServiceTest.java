package com.bilgeadam.gsmhandler.service;

import com.bilgeadam.gsmhandler.entity.Menu;
import com.bilgeadam.gsmhandler.entity.ServiceRequest;
import com.bilgeadam.gsmhandler.repository.MenuRepository;
import com.bilgeadam.gsmhandler.repository.ProductRepository;
import com.bilgeadam.gsmhandler.repository.ServiceRequestRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MenuServiceTest {

    @InjectMocks
    private MenuService menuService;

    @Mock
    private MenuRepository menuRepository;

    @Mock
    private ServiceRequestRepository serviceRequestRepository;

    @Mock
    private ServiceRequestService serviceRequestService;


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void shouldgetMenuList(){
        when(menuRepository.findAll()).thenReturn(new ArrayList<Menu>());
        List<Menu> menuList = menuService.getMenuList();
        assertNotNull(menuList) ;
    }

}
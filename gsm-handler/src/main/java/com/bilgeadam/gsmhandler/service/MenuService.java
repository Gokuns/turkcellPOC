package com.bilgeadam.gsmhandler.service;

import com.bilgeadam.gsmhandler.entity.Menu;
import com.bilgeadam.gsmhandler.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private ServiceRequestService serviceRequestService;

    public List<Menu> getMenuList(){
        serviceRequestService.addServiceRequest(3, "getMenuList", "menüler listelendi");
        return menuRepository.findAll();
    }

}

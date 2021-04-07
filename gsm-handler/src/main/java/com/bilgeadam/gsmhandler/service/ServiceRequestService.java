package com.bilgeadam.gsmhandler.service;

import com.bilgeadam.gsmhandler.entity.ServiceRequest;
import com.bilgeadam.gsmhandler.repository.ServiceRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ServiceRequestService {

    @Autowired
    private ServiceRequestRepository serviceRequestRepository;

    @Async
    public void addServiceRequest(int type, String name, String message){
        ServiceRequest serviceRequest = new ServiceRequest();
        serviceRequest.setId(null);
        serviceRequest.setType(type);
        serviceRequest.setName(name);
        serviceRequest.setMessage(message);
        serviceRequestRepository.save(serviceRequest);
    }



}

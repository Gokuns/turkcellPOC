package com.bilgeadam.gsmhandler.service;

import com.bilgeadam.gsmhandler.entity.ServiceRequest;
import com.bilgeadam.gsmhandler.repository.ServiceRequestRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@RunWith(MockitoJUnitRunner.class)
public class ServiceRequestServiceTest {

    @InjectMocks
    private ServiceRequestService serviceRequestService;

    @Mock
    private ServiceRequestRepository serviceRequestRepository;

    @Test
    public void shouldAddServiceRequest(){
        ServiceRequest s = new ServiceRequest();
        when( serviceRequestRepository.save(any())).thenReturn(s);
        serviceRequestService.addServiceRequest(0,"","");
        verify(serviceRequestRepository,times(1)).save(any());
    }


}
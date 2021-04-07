package com.bilgeadam.gsmhandler.repository;

import com.bilgeadam.gsmhandler.entity.ServiceRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ServiceRequestRepository extends MongoRepository<ServiceRequest, String> {

    public List<ServiceRequest> findByType(int type);

}

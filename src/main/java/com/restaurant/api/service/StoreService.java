package com.restaurant.api.service;

import com.restaurant.api.domain.store.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName : com.restaurant.api.service
 * className : StoreService
 * user : jwlee
 * date : 2023/01/28
 */
@Service
@RequiredArgsConstructor
public class StoreService {

    private final StoreRepository storeRepository;

    public void insert(){

        storeRepository.save(null);
    }
    public void update(){}
    public void delete(){}
}

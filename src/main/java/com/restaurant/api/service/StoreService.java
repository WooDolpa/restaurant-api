package com.restaurant.api.service;

import com.restaurant.api.domain.store.Store;
import com.restaurant.api.domain.store.StoreRepository;
import com.restaurant.api.domain.user.User;
import com.restaurant.api.domain.user.UserRepository;
import com.restaurant.api.dto.store.AddStoreReqDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * packageName : com.restaurant.api.service
 * className : StoreService
 * user : jwlee
 * date : 2023/01/28
 */
@Service
@Slf4j
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StoreService {

    private final UserRepository userRepository;

    private final StoreRepository storeRepository;

    @Transactional
    public void insert(AddStoreReqDto addStoreReqDto){

        User user = userRepository.findById(addStoreReqDto.getUserId()).orElseThrow();
        Store store = Store.builder()
                .storeName(addStoreReqDto.getStoreName())
                .user(user)
                .build();
        storeRepository.save(store);
    }
    public void update(){}
    public void delete(){}
}

package com.restaurant.api.service;

import com.restaurant.api.domain.user.User;
import com.restaurant.api.domain.user.UserRepository;
import com.restaurant.api.dto.user.UserReqDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * packageName : com.restaurant.api.service
 * className : UserService
 * user : jwlee
 * date : 2023/02/25
 * description :
 */
@Service
@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    /**
     * 사용자 등록
     *
     * @param userReqDto
     * @return
     */
    @Transactional
    public Long insert(UserReqDto userReqDto) {
        User user = User.builder()
                .password(userReqDto.getPassword())
                .build();

        Long id = userRepository.save(user).getId();
        return id;
    }
}

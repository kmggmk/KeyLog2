package com.test.logkey.controller;


import com.test.logkey.dto.UserDTO;
import com.test.logkey.entity.User;
import com.test.logkey.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;


    public void join(UserDTO userDTO) {

        //아이디 중복검사
//        boolean result = userRepository.existsById(userDTO.getId());
//        if (result) {
//            return;
//        }
        //DTO > Entity
        User user = User.builder()
                .id(userDTO.getId())
                .password(bCryptPasswordEncoder.encode(userDTO.getPassword()))
                .name(userDTO.getName())
                .nickName(userDTO.getNickName())
                .tel(userDTO.getTel())
                .address(userDTO.getAddress())
                .state(userDTO.getState())
                .userLevel(userDTO.getUserLevel())
                .score(userDTO.getScore())
                .userImg(userDTO.getUserImg())
                .reportCnt(userDTO.getReportCnt())
                .likeCnt(userDTO.getLikeCnt())
                .scrapCnt(userDTO.getScrapCnt())
                .followCnt(userDTO.getFollowCnt())
                .followingCnt(userDTO.getFollowingCnt())
                .build();
        userRepository.save(user);

    }
}


















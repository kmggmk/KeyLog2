package com.test.logkey.dto;

import com.test.logkey.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String id;
    private String password;
    private String name;
    private String nickName;
    private String tel;
    private String address;
    private String state;
    private Integer userLevel;
    private Integer score;
    private String userImg;
    private Integer reportCnt;
    private Integer likeCnt;
    private Integer scrapCnt;
    private Integer followCnt;
    private Integer followingCnt;

    public static User toEntity(UserDTO dto){
        // DTO  >  Entity
        return User.builder()
                .id(dto.getId())
                .name(dto.getName())
                .nickName(dto.getNickName())
                .tel(dto.getTel())
                .address(dto.getAddress())
                .state(dto.getState())
                .userLevel(dto.getUserLevel())
                .score(dto.getScore())
                .userImg(dto.getUserImg())
                .reportCnt(dto.getReportCnt())
                .likeCnt(dto.getLikeCnt())
                .scrapCnt(dto.getScrapCnt())
                .followCnt(dto.getFollowCnt())
                .followingCnt(dto.getFollowingCnt())
                .build();

    }

}



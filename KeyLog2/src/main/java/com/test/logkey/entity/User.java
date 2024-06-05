package com.test.logkey.entity;

import com.test.logkey.dto.UserDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Table(name = "tblUser")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_generator")
    @SequenceGenerator(name = "user_seq_generator", sequenceName = "seqUser", allocationSize = 1)
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "nickName")
    private String nickName;

    @Column(name = "tel")
    private String tel;

    @Column(name = "address")
    private String address;

    @Column(name = "state")
    private String state;

    @Column(name = "user_level")
    private Integer userLevel;

    @Column(name = "score")
    private Integer score;

    @Column(name = "userImg")
    private String userImg;

    @Column(name = "reportCnt")
    private Integer reportCnt;

    @Column(name = "likeCnt")
    private Integer likeCnt;

    @Column(name = "scrapCnt")
    private Integer scrapCnt;

    @Column(name = "followCnt")
    private Integer followCnt;

    @Column(name = "followingCnt")
    private Integer followingCnt;

    public static UserDTO toDTO(User user) {

        return UserDTO.builder()
                .id(user.getId())
                .name(user.getName())
                .nickName(user.getNickName())
                .tel(user.getTel())
                .address(user.getAddress())
                .state(user.getState())
                .userLevel(user.getUserLevel())
                .score(user.getScore())
                .userImg(user.getUserImg())
                .reportCnt(user.getReportCnt())
                .likeCnt(user.getLikeCnt())
                .scrapCnt(user.getScrapCnt())
                .followCnt(user.getFollowCnt())
                .followingCnt(user.getFollowingCnt())
                .build();

    }


}

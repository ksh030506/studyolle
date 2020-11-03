package com.studyolle.domain;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Account {

    @Id @GeneratedValue
    private Long id;

    //로그인 할 때 이메일 필요
    @Column(unique = true)
    private String email;

    //로그인 할 때 이메일 또는 닉네임 필요
    @Column(unique = true)
    private String nickname;

    private String password;

    private boolean emailVerified;

    private String emailCheckToken;

    private LocalDateTime joinAt;

    //짧은 자기 소개
    private String bio;

    private String url;

    //직업
    private String occupation;

    private String location;

    @Lob @Basic(fetch = FetchType.EAGER)
    private String profileImage;

    //스터디가 만들어 졌다는 것을 이메일로 알림
    private boolean studyCreatedByEmail;

    //스터디가 만들어 졌다는 것을 웹으로 알림
    private boolean studyCreatedByWeb;

    //스터디 가입 신청 결과를 이메일로 알림
    private boolean studyEnrollmentResultByEmail;

    //스터디 가입 신청 결과를 웹으로 알림
    private boolean studyEnrollmentResultByWeb;

    //스터디의 바뀐 정보를 이메일로 알림
    private boolean studyUpdateByEmail;

    //스터디의 바뀐 정보를 웹으로 알림
    private boolean studyUpdateByWeb;

}

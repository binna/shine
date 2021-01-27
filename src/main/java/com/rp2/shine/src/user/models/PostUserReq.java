package com.rp2.shine.src.user.models;

import lombok.*;
import javax.validation.constraints.Pattern;

@NoArgsConstructor(access = AccessLevel.PUBLIC) // Unit Test 를 위해 PUBLIC
@Getter
public class PostUserReq {
    private String nickname;

    @Pattern(regexp = "^010-\\d{4}-\\d{4}$", message = "휴대폰 번호 양식이 틀렸습니다. 다시 확인해주세요.")
    private String phoneNumber;

    private String profilePath;
    private String profileName;
}
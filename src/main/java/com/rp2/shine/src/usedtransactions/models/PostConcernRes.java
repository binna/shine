package com.rp2.shine.src.usedtransactions.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostConcernRes {
    private final Integer postingNo;
    private final Integer concernUserNo;
    private final Integer concernNo;
}

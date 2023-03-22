package com.jojoldu.book.springboot.web.dto;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
//@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

//    public HelloResponseDto() {
//        this.name = "";
//        this.amount = 0;
//    }

//    public HelloResponseDto(String name,int amount) {
//        this.name = name;
//        this.amount = amount;
//    }
}

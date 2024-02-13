package com.solix.com.Service_2.consumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDTO2 {

    private String email;
    private long id;
    private String phone;
    private String name;
    private String password;
}

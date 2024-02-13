package com.solix.com.Service_1.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDTO {

    private String email;
    private long id;
    private String phone;
    private String name;
    private String password;

}

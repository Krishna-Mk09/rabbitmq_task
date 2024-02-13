// SecondUser.java
package com.solix.com.Service_2.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SecondUser {
    private String email;
    @Id
    private long id;
    private String phone;
    private String name;
    private String password;
}

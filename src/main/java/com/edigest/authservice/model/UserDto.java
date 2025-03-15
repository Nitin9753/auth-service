package com.edigest.authservice.model;

import com.edigest.authservice.entity.User;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserDto extends User {
    private String name;
    private String phoneNumber;
    private String email;
}


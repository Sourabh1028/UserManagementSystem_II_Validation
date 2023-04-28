package com.geekster.UserManagementSystem_II.Model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotEmpty
    private String UserId;

    @NotNull
    private String UserName;

    @Pattern(regexp = "^(?:0[1-9]|[12]\\d|3[01])([\\/.-])(?:0[1-9]|1[012])\\1(?:19|20)\\d\\d$")
    private String DateOfBirth;

    @Pattern (regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
    private String Email;

    @Pattern(regexp = "^^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$")
    private String phoneNumber;

    private LocalDate Date = LocalDate.now();
    private LocalTime Time = LocalTime.now();
}

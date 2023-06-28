package com.Geekster.UserManagementSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.sql.Timestamp;


@Entity
@Data
@Table(name = "user_tbl")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @NotEmpty(message = "Username is required")
    private String username;

    @Pattern(regexp = "\\d{2}-\\d{2}-\\d{4}", message = "Date of Birth should be in the format dd-mm-yyyy")
    private String dateOfBirth;

    @Email(message = "Invalid email address")
    @NotEmpty(message = "Email is required")
    private String email;

    @Pattern(regexp = "\\d{2}\\d{10}", message = "Phone number should be 12 digits with country code (e.g., 911234567890)")
    private String phoneNumber;
    @CreationTimestamp
    private Timestamp Date;
    @CreationTimestamp
    private Timestamp time;

}


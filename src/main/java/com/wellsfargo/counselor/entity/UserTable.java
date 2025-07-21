package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class UserTable {

    @Id
    @GeneratedValue()
    private long userId;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false, unique = true)
    private String email;

    private LocalDateTime lastLogin;
    private String status;

    protected UserTable() {}

    public UserTable(String username, String password, String role, String email, String status) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
        this.status = status;
    }

    public long getUserId() { return userId; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public LocalDateTime getLastLogin() { return lastLogin; }
    public void setLastLogin(LocalDateTime lastLogin) { this.lastLogin = lastLogin; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

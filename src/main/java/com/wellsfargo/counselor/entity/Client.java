package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne
    @JoinColumn(name = "advisorId", nullable = false)
    private FinAdvisor advisor;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String contactInfo;

    protected Client() {}

    public Client(FinAdvisor advisor, String name, String contactInfo) {
        this.advisor = advisor;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public long getClientId() { return clientId; }
    public FinAdvisor getAdvisor() { return advisor; }
    public void setAdvisor(FinAdvisor advisor) { this.advisor = advisor; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }
}

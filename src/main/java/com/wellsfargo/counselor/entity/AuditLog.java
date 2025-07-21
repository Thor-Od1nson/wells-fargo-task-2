package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AuditLog {

    @Id
    @GeneratedValue()
    private long auditId;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private UserTable user;

    @Column(nullable = false)
    private String actionType;

    @Column(length = 1000)
    private String actionDetails;

    @Column(nullable = false)
    private LocalDateTime timeStamp;

    private String affectedEntity;
    private Long entityId;

    protected AuditLog() {}

    public AuditLog(UserTable user, String actionType, String actionDetails, LocalDateTime timeStamp, String affectedEntity, Long entityId) {
        this.user = user;
        this.actionType = actionType;
        this.actionDetails = actionDetails;
        this.timeStamp = timeStamp;
        this.affectedEntity = affectedEntity;
        this.entityId = entityId;
    }

    public long getAuditId() { return auditId; }
    public UserTable getUser() { return user; }
    public void setUser(UserTable user) { this.user = user; }
    public String getActionType() { return actionType; }
    public void setActionType(String actionType) { this.actionType = actionType; }
    public String getActionDetails() { return actionDetails; }
    public void setActionDetails(String actionDetails) { this.actionDetails = actionDetails; }
    public LocalDateTime getTimeStamp() { return timeStamp; }
    public void setTimeStamp(LocalDateTime timeStamp) { this.timeStamp = timeStamp; }
    public String getAffectedEntity() { return affectedEntity; }
    public void setAffectedEntity(String affectedEntity) { this.affectedEntity = affectedEntity; }
    public Long getEntityId() { return entityId; }
    public void setEntityId(Long entityId) { this.entityId = entityId; }
}

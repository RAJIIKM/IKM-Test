package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.UUID;

import com.example.demo.model.ApprovalStatus.ApprovalStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Approval {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "workflow_id")
    private DocumentWorkflow documentWorkflow;

    @ManyToOne(optional = false)
    @JoinColumn(name = "approver_department_id")
    private Department approverDepartment;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ApprovalStatus approvalStatus;

    private LocalDateTime approvalDate;

    private String approverId;
}



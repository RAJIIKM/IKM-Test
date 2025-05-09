
package com.example.demo.contract;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ApprovalDto {

    private Long documentWorkflowId;
    private Long approverDepartmentId;
    private String approvalStatus;
    private LocalDateTime approvalDate;
    private String approverId;
}

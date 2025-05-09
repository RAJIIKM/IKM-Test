package com.example.demo.contract;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class DocumentWorkflowDto {
    private Long documentId;
    private String currentState;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedBy;
    private String comments;

}

package com.example.demo.contract;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Document {
    
    private String documentNumber;
    private String title;
    private String description;
    private LocalDate creationDate;
    private Long ownerDepartmentId;
    private String documentType;
    private String securityClassification;
    private String digitalFileLocation;
    private String version;

}

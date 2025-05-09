package com.example.demo.model;

import java.time.LocalDate;
import java.util.UUID;

import org.w3c.dom.DocumentType;

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
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data




public class Document {    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true, nullable = false)
    private String documentNumber; // e.g., HR-2025-0001

    @Column(nullable = false)
    private String title;
    private String description;
    private LocalDate creationDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "department_id")
    private Department ownerDepartment;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DocumentType documentType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SecurityClassification securityClassification;

    private String digitalFileLocation;

    @Column(nullable = false)
    private String version; // e.g., "1.0"
}



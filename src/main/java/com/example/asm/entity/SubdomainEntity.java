package com.example.asm.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
@Entity
@Table(name = "tbl_subdomains_amass")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubdomainEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "subdomain_name")
    private String subdomainName;
    @CreationTimestamp
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @ManyToOne(targetEntity = DomainEntity.class,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "domain_id")
    private DomainEntity domain;
}

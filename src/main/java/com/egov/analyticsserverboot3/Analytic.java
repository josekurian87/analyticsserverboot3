package com.egov.analyticsserverboot3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "analytics")
public class Analytic {
    @Id
    @Size(max = 50)
    @Column(name = "objectid", nullable = false, length = 50)
    private String objectid;

    @Size(max = 50)
    @Column(name = "type", length = 50)
    private String type;

    @Size(max = 50)
    @Column(name = "principal", length = 50)
    private String principal;

    @Column(name = "timestamp")
    private LocalTime timestamp;

    @Size(max = 50)
    @Column(name = "description", length = 50)
    private String description;

}
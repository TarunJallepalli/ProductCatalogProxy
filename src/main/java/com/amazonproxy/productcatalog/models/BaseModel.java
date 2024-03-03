package com.amazonproxy.productcatalog.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private Date createdOn;

    private Date updatedOn;

    @Enumerated(value = EnumType.ORDINAL)
    private Status status;
}

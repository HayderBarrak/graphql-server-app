package com.graphql.graphqlapp.Entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@EqualsAndHashCode
@Entity
public class Vehicle implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "model_code", nullable = false)
    private String modelCode;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "launch_date")
    private LocalDate launchDate;

    private transient  String formattedDate;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getModelCode() {
        return modelCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public String getFormattedDate() {
        return getLaunchDate().toString();
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setLaunchDate(LocalDate launchDate) {
        this.launchDate = launchDate;
    }

    public void setFormattedDate(String formattedDate) {
        this.formattedDate = formattedDate;
    }
}

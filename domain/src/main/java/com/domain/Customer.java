package com.domain;

import javax.persistence.*;


@Entity
@Table(name = "customer",  uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")})
public class Customer {
    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private int customerId;
    @Column(name = "name", columnDefinition = "NVARCHAR(255)")
    private String customerName;
    @Column(name = "image", columnDefinition = "NVARCHAR(255)")
    private String image;

    public Customer(){

    }
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

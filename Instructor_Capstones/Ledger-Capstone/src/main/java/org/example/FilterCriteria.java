package org.example;

import java.time.LocalDate;

//Wait a second Jonathan, are you saying you're using a class
//to represent what the user filters by?
//Yes. This is for the advanced Ledger Challenge

public class FilterCriteria {
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
    private String vendor;
    private Double amount;

    // Getters and setters
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}

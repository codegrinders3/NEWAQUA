package com.accolite.assignment.entity;

import java.util.Date;

public class Customer {
    String name;
    String phoneNumber;
    String address;
    String modelName;
   // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date dateOfWork;
    String monthOfWork;
    String technicianName;
    int partCCV;
    int partSedimentalfilter;
    int partCarbonfilter;
    int partROMembrane;
    int partMultilayer;
    int partPPSpun;
    int partPump;
    int partSV;
    int partSMPS;
    int partVVLamp;
    int partService;
    Boolean isAmc;
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date amcDate;
    Boolean amcRenewed;

    public Customer(){

    }

    public Customer(String name, String phoneNumber, String address, String modelName, Date dateOfWork, String monthOfWork, String technicianName, int partCCV, int partSedimentalfilter, int partCarbonfilter, int partROMembrane, int partMultilayer, int partPPSpun, int partPump, int partSV, int partSMPS, int partVVLamp, int partService, Boolean isAmc, Date amcDate, Boolean amcRenewed) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.modelName = modelName;
        this.dateOfWork = dateOfWork;
        this.monthOfWork = monthOfWork;
        this.technicianName = technicianName;
        this.partCCV = partCCV;
        this.partSedimentalfilter = partSedimentalfilter;
        this.partCarbonfilter = partCarbonfilter;
        this.partROMembrane = partROMembrane;
        this.partMultilayer = partMultilayer;
        this.partPPSpun = partPPSpun;
        this.partPump = partPump;
        this.partSV = partSV;
        this.partSMPS = partSMPS;
        this.partVVLamp = partVVLamp;
        this.partService = partService;
        this.isAmc = isAmc;
        this.amcDate = amcDate;
        this.amcRenewed = amcRenewed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Date getDateOfWork() {
        return dateOfWork;
    }

    public void setDateOfWork(Date dateOfWork) {
        this.dateOfWork = dateOfWork;
    }

    public String getMonthOfWork() {
        return monthOfWork;
    }

    public void setMonthOfWork(String monthOfWork) {
        this.monthOfWork = monthOfWork;
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName;
    }

    public int getPartCCV() {
        return partCCV;
    }

    public void setPartCCV(int partCCV) {
        this.partCCV = partCCV;
    }

    public int getPartSedimentalfilter() {
        return partSedimentalfilter;
    }

    public void setPartSedimentalfilter(int partSedimentalfilter) {
        this.partSedimentalfilter = partSedimentalfilter;
    }

    public int getPartCarbonfilter() {
        return partCarbonfilter;
    }

    public void setPartCarbonfilter(int partCarbonfilter) {
        this.partCarbonfilter = partCarbonfilter;
    }

    public int getPartROMembrane() {
        return partROMembrane;
    }

    public void setPartROMembrane(int partROMembrane) {
        this.partROMembrane = partROMembrane;
    }

    public int getPartMultilayer() {
        return partMultilayer;
    }

    public void setPartMultilayer(int partMultilayer) {
        this.partMultilayer = partMultilayer;
    }

    public int getPartPPSpun() {
        return partPPSpun;
    }

    public void setPartPPSpun(int partPPSpun) {
        this.partPPSpun = partPPSpun;
    }

    public int getPartPump() {
        return partPump;
    }

    public void setPartPump(int partPump) {
        this.partPump = partPump;
    }

    public int getPartSV() {
        return partSV;
    }

    public void setPartSV(int partSV) {
        this.partSV = partSV;
    }

    public int getPartSMPS() {
        return partSMPS;
    }

    public void setPartSMPS(int partSMPS) {
        this.partSMPS = partSMPS;
    }

    public int getPartVVLamp() {
        return partVVLamp;
    }

    public void setPartVVLamp(int partVVLamp) {
        this.partVVLamp = partVVLamp;
    }

    public int getPartService() {
        return partService;
    }

    public void setPartService(int partService) {
        this.partService = partService;
    }

    public Boolean getIsAmc() {
        return isAmc;
    }

    public void setIsAmc(Boolean isAmc) {
        this.isAmc = isAmc;
    }

    public Date getAmcDate() {
        return amcDate;
    }

    public void setAmcDate(Date amcDate) {
        this.amcDate = amcDate;
    }

    public Boolean getAmcRenewed() {
        return amcRenewed;
    }

    public void setAmcRenewed(Boolean amcRenewed) {
        this.amcRenewed = amcRenewed;
    }
}



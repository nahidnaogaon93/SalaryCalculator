package com.nahid_islam.salarycalculator;

public class SalaryCalculator {
         private double basicSalary;
         private float medicalPercentage;
         private float houseRent;


    public SalaryCalculator(double basicSalary, float medicalPercentage, float houseRent){
              setBasicSalary(basicSalary);
              setHouseRent(houseRent);
              setMedicalPercentage(medicalPercentage);
    }

    public SalaryCalculator(){

    }

    public float getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(float houseRent) {
        this.houseRent = houseRent;
    }

    public float getMedicalPercentage() {
        return medicalPercentage;
    }

    public void setMedicalPercentage(float medicalPercentage) {
        this.medicalPercentage = medicalPercentage;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double calculateTotalSalary(){
        double totalSalary =getBasicSalary()+(getBasicSalary()*getMedicalPercentage())/100+(getBasicSalary()*getHouseRent())/100;
     return totalSalary;
    }
}

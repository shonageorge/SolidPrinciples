package com.stackroute.hackathon;

import java.io.PrintStream;

public class HealthInsurance {
    public static void main(String[] args) {
      ClaimManagerApprove cl=new ClaimManagerApprove();
      cl.setBillNumber(2000);
      cl.setHospitalName("Apollo");
      cl.setName("Ann");
      cl.managerApprove();

    }
}

class Customer{

    private int insuranceId;
    private String name;

    private int phoneNo;
    String hospitalName;
    private int billNumber;
    private float billAmount;

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }


    public int getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
    }

    public float getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(float billAmount) {
        this.billAmount = billAmount;
    }


    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

}


class SurveyorValidate extends Customer {

    int flag = 1;

    public boolean validateHospital() {

        System.out.println("Hospital name:" +getHospitalName());
        return true;
    }



    public boolean validateBill(){
         //billNumber=billNumber;
        System.out.println("Bill Number : "+getBillNumber());
        return false;
    }
}

class ClaimManagerApprove extends SurveyorValidate{

     public void managerApprove(){
         if((validateHospital()==true)&&(validateBill()==true)){
             System.out.println("Approved");
         }


         else
             System.out.println("Not Approved");
         }



}

package ParkingLot.Model;

import ParkingLot.Model.ennum.PaymentMode;
import ParkingLot.Model.ennum.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseClass{
    private double amount;
    private String refNumber;//referenceNumber
    private Bill bill;

    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private LocalDateTime paymentTime;

    public Payment(int id, LocalDateTime CreatedAt, LocalDateTime UpdatedAt, LocalDateTime CreatedBy, LocalDateTime UpdatedBy, double amount, String refNumber, Bill bill, PaymentMode paymentMode, PaymentStatus paymentStatus, LocalDateTime paymentTime) {
        super(id, CreatedAt, UpdatedAt, CreatedBy, UpdatedBy);
        this.amount = amount;
        this.refNumber = refNumber;
        this.bill = bill;
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
        this.paymentTime = paymentTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }
}

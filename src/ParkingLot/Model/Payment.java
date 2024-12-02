package ParkingLot.Model;

import ParkingLot.Model.ennum.PaymentMode;
import ParkingLot.Model.ennum.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseClass{
    private int refNumber;//referenceNumber
    private Bill bill;
  //  private LocalDateTime.now() Exittime;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
}

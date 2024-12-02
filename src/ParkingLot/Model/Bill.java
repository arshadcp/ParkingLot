package ParkingLot.Model;

import ParkingLot.Model.ennum.BillStatus;

import java.time.LocalDateTime;

public class Bill extends BaseClass{
    private LocalDateTime Exittime;
    private Ticket ticket;
    private Gate exitgate;
    private double amount;
    private BillStatus billStatus;

    public Bill(int id, LocalDateTime CreatedAt, LocalDateTime UpdatedAt, LocalDateTime CreatedBy, LocalDateTime UpdatedBy, LocalDateTime exittime, Ticket ticket, Gate exitgate, double amount, BillStatus billStatus) {
        super(id, CreatedAt, UpdatedAt, CreatedBy, UpdatedBy);
        Exittime = exittime;
        this.ticket = ticket;
        this.exitgate = exitgate;
        this.amount = amount;
        this.billStatus = billStatus;
    }

    public LocalDateTime getExittime() {
        return Exittime;
    }

    public void setExittime(LocalDateTime exittime) {
        Exittime = exittime;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getExitgate() {
        return exitgate;
    }

    public void setExitgate(Gate exitgate) {
        this.exitgate = exitgate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}

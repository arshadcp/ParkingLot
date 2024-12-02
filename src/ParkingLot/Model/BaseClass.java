package ParkingLot.Model;
import java.time.*;
public abstract class BaseClass {
    int id;
  private  LocalDateTime createdAt;
  private  LocalDateTime updatedAt;
  private  LocalDateTime createdBy;
  private  LocalDateTime updatedBy;

    public BaseClass(int id, LocalDateTime CreatedAt, LocalDateTime UpdatedAt, LocalDateTime CreatedBy,LocalDateTime UpdatedBy) {
        this.id = id;
        createdAt = CreatedAt;
        updatedAt = UpdatedAt;
        createdBy = CreatedBy;
       updatedBy = UpdatedBy;
    }

    protected BaseClass(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime CreatedAt) {
        createdAt = CreatedAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime UpdatedAt) {
       updatedAt = UpdatedAt;
    }

    public LocalDateTime getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(LocalDateTime CreatedBy) {
       createdBy = CreatedBy;
    }

    public LocalDateTime getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(LocalDateTime UpdatedBy) {
        updatedBy = UpdatedBy;
    }
}

package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rent_info")
public class RentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Rent_ID",nullable = false)
    private Integer rentid;

    @Column(name = "From_Date",columnDefinition = "date",nullable = false)
    private Date from_date;

    @Column(name = "To_Date",columnDefinition = "date",nullable = false)
    private Date to_date;

    @Column(name = "Total",nullable = false)
    private Double total;

    @Column(name = "IsReturn",nullable = false)
    private boolean isreturn;

    @Column(name = "Balance",nullable = false)
    private Double balance;

    @Column(name = "Deposit",nullable = false)
    private Double refundeposit;

    @Column(name = "Advanced",nullable = false)
    private Double advancespay;

    @Column(name = "PerDayRent",nullable = false)
    private Double perdayrent;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CustID", nullable = false)
    private CustomerEntity customerEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CarID", nullable = false)
    private CarEntity carEntity;

    public RentEntity() {
    }

    public RentEntity(Date from_date, Date to_date, Double total, boolean isreturn, Double balance, Double refundeposit, Double advancespay, Double perdayrent) {
        this.from_date = from_date;
        this.to_date = to_date;
        this.total = total;
        this.isreturn = isreturn;
        this.balance = balance;
        this.refundeposit = refundeposit;
        this.advancespay = advancespay;
        this.perdayrent = perdayrent;
    }

    public Integer getRentid() {
        return rentid;
    }

    public void setRentid(Integer rentid) {
        this.rentid = rentid;
    }

    public Date getFrom_date() {
        return from_date;
    }

    public void setFrom_date(Date from_date) {
        this.from_date = from_date;
    }

    public Date getTo_date() {
        return to_date;
    }

    public void setTo_date(Date to_date) {
        this.to_date = to_date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public boolean isIsreturn() {
        return isreturn;
    }

    public void setIsreturn(boolean isreturn) {
        this.isreturn = isreturn;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getRefundeposit() {
        return refundeposit;
    }

    public void setRefundeposit(Double refundeposit) {
        this.refundeposit = refundeposit;
    }

    public Double getAdvancespay() {
        return advancespay;
    }

    public void setAdvancespay(Double advancespay) {
        this.advancespay = advancespay;
    }

    public Double getPerdayrent() {
        return perdayrent;
    }

    public void setPerdayrent(Double perdayrent) {
        this.perdayrent = perdayrent;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }

    public CarEntity getCarEntity() {
        return carEntity;
    }

    public void setCarEntity(CarEntity carEntity) {
        this.carEntity = carEntity;
    }

    @Override
    public String toString() {
        return "RentEntity{" +
                ", from_date=" + from_date +
                ", to_date=" + to_date +
                ", total=" + total +
                ", isreturn=" + isreturn +
                ", balance=" + balance +
                ", refundeposit=" + refundeposit +
                ", advancespay=" + advancespay +
                ", perdayrent=" + perdayrent +
                ", customerEntity=" + customerEntity +
                ", carEntity=" + carEntity +
                '}';
    }
}

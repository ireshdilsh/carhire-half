package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer_info")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CustID",nullable = false)
    private Integer custid;

    @Column(name = "NIC",nullable = false,length = 12)
    private Integer nic;

    @Column(name = "Name",nullable = false)
    private String name;

    @Column(name = "Address",nullable = false)
    private String address;

    @Column(name = "MobileNO",nullable = false,length = 9)
    private Integer mobileno;

    @OneToMany(mappedBy = "customerEntity", targetEntity = RentEntity.class)
    private List<RentEntity> rentEntityList;


    public CustomerEntity() {
    }

    public CustomerEntity(Integer nic, String name, String address, Integer mobileno) {
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.mobileno = mobileno;
      //  this.rentEntityList = rentEntityList;
    }



    public Integer getCustid() {
        return custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    public Integer getNic() {

        return nic;
    }

    public void setNic(Integer nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobileno() {
        return mobileno;
    }

    public void setMobileno(int mobileno) {
        this.mobileno = mobileno;
    }

    public List<RentEntity> getRentEntityList() {
        return rentEntityList;
    }

    public void setRentEntityList(List<RentEntity> rentEntityList) {
        this.rentEntityList = rentEntityList;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                ", nic=" + nic +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobileno=" + mobileno +
                //", rentEntityList=" + rentEntityList +
                '}';
    }
}

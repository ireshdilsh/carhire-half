package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "car_info")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CarID",nullable = false)
    private Integer carid;

    @Column(name = "Brand",nullable = false)
    private String brand;

    @Column(name = "Model",nullable = false)
    private String model;

    @Column(name = "Vehicle_NO",nullable = false,length = 4)
    private Integer vehino;

    @Column(name = "Year",nullable = false)
    private String year;

    @Column(name = "PricePerDay",nullable = false)
    private Double priceperday;

    @OneToMany(mappedBy = "carEntity", targetEntity = RentEntity.class)
    private List<RentEntity> rentEntityList;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Category_ID",nullable = false)
    private CarCategoriEntity carCategoryEntity;

    public CarEntity() {
    }

    public CarEntity(String brand, String model, Integer vehino, String year, Double priceperday) {
        this.brand = brand;
        this.model = model;
        this.vehino = vehino;
        this.year = year;
        this.priceperday = priceperday;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getVehino() {
        return vehino;
    }

    public void setVehino(Integer vehino) {
        this.vehino = vehino;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getPriceperday() {
        return priceperday;
    }

    public void setPriceperday(Double priceperday) {
        this.priceperday = priceperday;
    }

    public List<RentEntity> getRentEntityList() {
        return rentEntityList;
    }

    public void setRentEntityList(List<RentEntity> rentEntityList) {
        this.rentEntityList = rentEntityList;
    }

    public CarCategoriEntity getCarCategoryEntity() {
        return carCategoryEntity;
    }

    public void setCarCategoryEntity(CarCategoriEntity carCategoryEntity) {
        this.carCategoryEntity = carCategoryEntity;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", vehino=" + vehino +
                ", year='" + year + '\'' +
                ", priceperday=" + priceperday +
                ", rentEntityList=" + rentEntityList +
                ", carCategoryEntity=" + carCategoryEntity +
                '}';
    }
}

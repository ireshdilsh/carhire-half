package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ar_category_info")
public class CarCategoriEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Category_ID",nullable = false)
    private Integer categoryid;

    @Column(name = "Catogery_Name",nullable = false)
    private String name;

    @OneToMany(mappedBy = "carCategoryEntity",targetEntity = CarEntity.class)
    private List<CarEntity> carEntities;
}

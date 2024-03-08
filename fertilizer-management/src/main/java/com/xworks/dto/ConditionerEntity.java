package com.xworks.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@Table(name="conditioner")
@RequiredArgsConstructor
@NoArgsConstructor
@NamedQuery(name="updateNetQuantityByBrand",query = "update ConditionerEntity entity set quantity=:quantity where brand=:brand")
@NamedQuery(name="findAllByBrand",query = "Select entity from ConditionerEntity entity where brand=:brand")
@NamedQuery(name="findAllByHairType",query = "Select entity from ConditionerEntity entity where hairType=:hairType")
@NamedQuery(name="findScentById",query = "Select scent from ConditionerEntity entity where id=:id")
@NamedQuery(name="getAllBrand",query = "Select brand from ConditionerEntity entity")

public class ConditionerEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="brand")
    @NonNull
    private String brand;
    @Column(name="item_form")
    @NonNull
    private String itemForm;
    @Column(name="material_feature")
    @NonNull
    private String materialFeature;
    @Column(name="hair_type")
    @NonNull
    private String hairType;
    @Column(name="benifits")
    @NonNull
    private  String benifits;
    @Column(name="age_range")
    @NonNull
    private String ageRange;
    @Column(name="net_quantity")
    @NonNull
    private String quantity;
    @Column(name="scent")
    @NonNull
    private String scent;

}

package com.xworks.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="temple")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@NamedQuery(name="findAllByLocation",query="select temple from TempleEntity temple where location =:l")
@NamedQuery(name="findAllById",query="select temple from TempleEntity temple where id =:id")
@NamedQuery(name="findAllByEntryFeeGreaterThan",query="select temple from TempleEntity temple where entryFee>:fee")
@NamedQuery(name="findAllByEntryFeeBetween",query="select temple from TempleEntity temple where entryFee between :fee1 and :fee2")
@NamedQuery(name="findAllByInaguratedDateGreaterThan",query="select temple from TempleEntity temple where inaguratedDate > :date")
@NamedQuery(name="findAllByMainGodAndLocation",query="select temple from TempleEntity temple where mainGod=:god and location=:location")
@NamedQuery(name="findAllByIdAndMainGod",query="select temple from TempleEntity temple where id=:id and mainGod=:god")
@NamedQuery(name = "findTempleWithMaxEntryFee", query = "select temple from TempleEntity temple ORDER BY entryFee DESC")
@NamedQuery(name="findTotal",query="select count(t) from TempleEntity t")
@NamedQuery(name="updateLocationByName",query="update TempleEntity t set location=:l where name=:name ")
@NamedQuery(name="updateEntryFeeByName",query="update TempleEntity t set entryFee=:fee where name=:name ")
@NamedQuery(name="updateLocationAndDimensionById",query="update TempleEntity t set location=:location,dimension=:dimension where id=:id ")
@NamedQuery(name="updateAllVipEntry",query="update TempleEntity t set t.vipEntry=:entry where t.id IN :id ")
@NamedQuery(name="deleteByName",query="delete from TempleEntity t where name= :name ")

public class TempleEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    @NonNull
    private String name;
    @Column(name="location")
    @NonNull
    private String location;
    @Column(name="vip_entry")
    @NonNull
    private String vipEntry;
    @Column(name="inagurated_date")
    @NonNull
    private LocalDate inaguratedDate;
    @Column(name="main_god")
    @NonNull
    private  String mainGod;
    @Column(name="dimension")
    @NonNull
    private String dimension;
    @Column(name="entree_fee")
    @NonNull
    private Double entryFee;

}

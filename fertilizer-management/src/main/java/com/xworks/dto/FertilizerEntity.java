package com.xworks.dto;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="fertilizer")
@NoArgsConstructor
@Data
@RequiredArgsConstructor
@NamedQuery(name="findAllByQuantity",query="select fertilizer from FertilizerEntity fertilizer where fertilizer.quantity=:qt")
public class FertilizerEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//it says db will add id once it saves into db
    private int id;
    @Column(name="name")
    @NonNull
    private String name;
    @Column(name="quantity")
    @NonNull
    private int quantity;
    @Column(name="cost")
    @NonNull
    private int cost;
    @Column(name="mfg_date")
    @NonNull
    private LocalDate mfgDate;
    @Column(name="exp_date")
    @NonNull
    private LocalDate expDate;


}

package com.xworks.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="travel")
@Data
public class TravelEntity {
    public TravelEntity(String source, String destination, String budget, String distance, String duration, String mode, LocalDate date, LocalDate returnDate) {
        this.source = source;
        this.destination = destination;
        this.budget = budget;
        this.distance = distance;
        this.duration = duration;
        this.mode = mode;
        this.date = date;
        this.returnDate = returnDate;
    }

    @Id
    @Column(name="id")
    private int id;
    @Column(name="source")
    private String source;
    @Column(name="destination")
    private String destination;
    @Column(name="budget")
    private String budget;
    @Column(name="distance")
    private String distance;
    @Column(name="duration")
    private String duration;
    @Column(name="mode_of_transport")
    private String mode;
    @Column(name="date")
    private LocalDate date;
    @Column(name="return_date")
    private LocalDate returnDate;
}

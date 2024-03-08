package Entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "admin")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "getAdmin",query = "select entity from AdminEntity entity where userName=:userName and password=:password")
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "userName")
    @NonNull
    private String userName;
    @Column(name = "password")
    @NonNull
    private String password;
}
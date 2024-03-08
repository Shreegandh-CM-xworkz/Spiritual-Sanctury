package Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "contact")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@NamedQuery(name="getAllContacts",query="select contact from ContactFormEntity contact")

public class ContactFormEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    @NonNull
    private String name;
    @Column(name = "email")
    @NonNull
    private String email;
    @Column(name = "subject")
    @NonNull
    private String subject;
    @Column(name = "message")
    @NonNull
    private String message;
}
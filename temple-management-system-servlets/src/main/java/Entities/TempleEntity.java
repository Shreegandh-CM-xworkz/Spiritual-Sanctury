package Entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="temple")
@Data
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@NamedQuery(name="getAll",query="select temple from TempleEntity temple ")
@NamedQuery(name="getTemple",query="select temple from TempleEntity temple  where id=:id")
@NamedQuery(name="update",query="update TempleEntity temple set  name=:name ,location=:location,vipEntry=:vipEntry,inaguratedDate=:inaguratedDate,mainGod=:mainGod,dimension=:dimension,entryFee=:entryFee where id=:id")
@NamedQuery(name="delete",query="delete from TempleEntity temple where id=:id")
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
    private String inaguratedDate;
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

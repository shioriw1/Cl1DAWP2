package pe.edu.i202113761.cl1_jpa_data_LozanoAlexis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    private String Name;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "CountryCode")
    private Country country;

    private String District;

    private int Population;
}

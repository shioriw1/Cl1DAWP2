package pe.edu.i202113761.cl1_jpa_data_LozanoAlexis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryLanguage {
    @Id
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "CountryCode")
    private Country country;

    @Id
    private String language;

    private String lsOfficial;

    private double percentage;
}

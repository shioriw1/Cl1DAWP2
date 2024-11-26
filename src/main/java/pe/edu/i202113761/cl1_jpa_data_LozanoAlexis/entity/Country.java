package pe.edu.i202113761.cl1_jpa_data_LozanoAlexis.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Code;

    private String Name;
    private String Continent;
    private String Region;
    //private Double surfaceArea;
    //private int indepYear;
    private int Population;
    //private double lifeExpectancy;
    private double GNP;
    private double GNPOld;
    //private String localName;
    //private String governmentForm;
    //private String headOfState;
    private int Capital;
    private String code2;

    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<City> cities;

    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<CountryLanguage> countryLanguages;
}

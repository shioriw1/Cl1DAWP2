package pe.edu.i202113761.cl1_jpa_data_LozanoAlexis;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202113761.cl1_jpa_data_LozanoAlexis.entity.Country;
import pe.edu.i202113761.cl1_jpa_data_LozanoAlexis.repository.CountryRepository;

import java.util.Optional;

@SpringBootApplication
@RequiredArgsConstructor
public class Cl1JpaDataLozanoAlexisApplication implements CommandLineRunner {

    private final CountryRepository countryRepository;
	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataLozanoAlexisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Optional<Country> country = countryRepository.findById("ARG");
		country.ifPresentOrElse(
				country1 -> country1.getCountryLanguages().stream().forEach(countryLanguage -> System.out.println(countryLanguage.getLanguage()))
				,
				() -> {
					countryRepository.findById("ARG").get().getCountryLanguages().stream().forEach(countryLanguage -> System.out.println(countryLanguage.getLanguage()));
				}
		);



	}
}

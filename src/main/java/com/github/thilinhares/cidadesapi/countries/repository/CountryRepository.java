package com.github.thilinhares.cidadesapi.countries.repository;

import com.github.thilinhares.cidadesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

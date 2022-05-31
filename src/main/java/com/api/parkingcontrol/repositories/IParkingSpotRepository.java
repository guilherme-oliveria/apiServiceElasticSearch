package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//quando extend JpaRepository ele ja tras o @Repository
@Repository
public interface IParkingSpotRepository extends ElasticsearchRepository<ParkingSpotModel, UUID> {

    boolean existsByLicensePlateCar(String LicensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);
}

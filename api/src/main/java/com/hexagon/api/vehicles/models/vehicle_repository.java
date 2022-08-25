//importação dos pacotes e metodos
package com.hexagon.api.vehicles.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//interface/repositório para gerar acesso na aplicação
@RepositoryRestResource(collectionResourceRel = "vehicles", path = "vehicles")
public interface vehicle_repository extends JpaRepository<vehicle, Long> {

    void save(vehicle_repository repository);
}

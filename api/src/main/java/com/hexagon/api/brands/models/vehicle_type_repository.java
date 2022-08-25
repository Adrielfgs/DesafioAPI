//importação dos pacotes e metodos
package com.hexagon.api.brands.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//interface/repositório para gerar acesso na aplicação
@RepositoryRestResource(collectionResourceRel = "brands", path = "brands")
public interface vehicle_type_repository extends JpaRepository<vehicle_type, Long> {

    void save(vehicle_type_repository repository);
}

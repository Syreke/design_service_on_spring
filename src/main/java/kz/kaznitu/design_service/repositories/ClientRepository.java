package kz.kaznitu.design_service.repositories;

import kz.kaznitu.design_service.models.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClientRepository extends CrudRepository<Client, Long> {
    @Override
    Optional<Client> findById(Long aLong);
}

package codedbymurilo.marketplace.registration.infrastructure.persistence.repository;

import codedbymurilo.marketplace.registration.infrastructure.persistence.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CustomerEntityRepository extends CrudRepository<Customer, UUID> {
}

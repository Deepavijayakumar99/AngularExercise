package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Customer;

/**
 * @author Lhouceine OUHAMZA
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

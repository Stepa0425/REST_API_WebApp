package edu.bsuir.MobileOperator.repositories;

import edu.bsuir.MobileOperator.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

package ma.fsm.benlahcenayoub__tp2__dernierpartiejpa__miaad__2024.repositories;

import ma.fsm.benlahcenayoub__tp2__dernierpartiejpa__miaad__2024.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUsername(String userName);
}
package ma.fsm.benlahcenayoub__tp2__dernierpartiejpa__miaad__2024.repositories;

import ma.fsm.benlahcenayoub__tp2__dernierpartiejpa__miaad__2024.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByRoleName(String roleName);
}

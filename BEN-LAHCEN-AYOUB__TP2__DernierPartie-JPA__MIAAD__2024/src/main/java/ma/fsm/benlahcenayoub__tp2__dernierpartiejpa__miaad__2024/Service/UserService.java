package ma.fsm.benlahcenayoub__tp2__dernierpartiejpa__miaad__2024.Service;

import ma.fsm.benlahcenayoub__tp2__dernierpartiejpa__miaad__2024.entities.Role;
import ma.fsm.benlahcenayoub__tp2__dernierpartiejpa__miaad__2024.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName) ;
    void  addRoleToUser(String username , String rolname);


    User authenticate(String userName, String password);
}

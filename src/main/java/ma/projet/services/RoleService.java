package ma.projet.services;


import ma.projet.entities.Role;
import ma.projet.repository.RoleRepository;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {


    @Autowired
    private RoleRepository roleRepsitory;


    public Role createRole(Role role){


        return roleRepsitory.save(role);

    }

    public List<Role> getAllRoles(){
        return roleRepsitory.findAll();
    }
}

package ma.projet.controllers;


import ma.projet.entities.Role;
import ma.projet.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/role")
public class RoleController {


    @Autowired
    private RoleService roleService;


    @GetMapping("/roles")
    public ResponseEntity<List<Role>> getAll(){
        List<Role> roles=roleService.getAllRoles();
        return new ResponseEntity<>(roles,HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Role> saveRole(@RequestBody Role role){
        role.setId(0L);
        Role savedRole=roleService.createRole(role);
        return new ResponseEntity<>(savedRole,HttpStatus.OK);
    }
}

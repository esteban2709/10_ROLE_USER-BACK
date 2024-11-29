package co.project.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.project.proyecto.models.Role;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Long>{

}

package co.project.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.project.proyecto.models.Permission;

@Repository("permissionRepository")
public interface PermissionRepository extends JpaRepository<Permission, Long>{
	

}

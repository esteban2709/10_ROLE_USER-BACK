package co.project.proyecto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.project.proyecto.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    List <User> findByName(@Param("name") String name);

    @Query("SELECT u FROM User u WHERE u.id = :id")
    Optional<User> findUserById(Long id);
}


package com.portfolioleo.mgb.Security.Repository;

import com.portfolioleo.mgb.Security.Entity.Rol;
import com.portfolioleo.mgb.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}

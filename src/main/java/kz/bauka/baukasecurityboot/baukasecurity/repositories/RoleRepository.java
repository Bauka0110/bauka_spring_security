package kz.bauka.baukasecurityboot.baukasecurity.repositories;

import kz.bauka.baukasecurityboot.baukasecurity.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RoleRepository extends JpaRepository<Roles, Long> {
}

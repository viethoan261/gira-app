package cybersoft.javabackend.java16girahoan.role.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cybersoft.javabackend.java16girahoan.role.model.GiraGroup;
@Repository
public interface GiraGroupRepository extends JpaRepository<GiraGroup, UUID> {

}

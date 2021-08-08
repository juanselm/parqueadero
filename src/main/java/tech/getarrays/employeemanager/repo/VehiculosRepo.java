package tech.getarrays.employeemanager.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Vehiculo;

import java.util.Optional;

public interface VehiculosRepo extends JpaRepository<Vehiculo, Long> {
    void deleteVehiculoById(Long id);

    Optional<Vehiculo> findVehiculoById(Long id);
}

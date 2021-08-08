package tech.getarrays.employeemanager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.exception.UserNotFountException;
import tech.getarrays.employeemanager.model.Vehiculo;
import tech.getarrays.employeemanager.repo.VehiculosRepo;

import java.util.List;
import java.util.UUID;

@Service
public class VehiculoService {
    private final VehiculosRepo vehiculosRepo;

    @Autowired
    public VehiculoService(VehiculosRepo vehiculosRepo) {
        this.vehiculosRepo = vehiculosRepo;
    }

    public Vehiculo addVehiculo(Vehiculo vehiculo){
        vehiculo.setPlaca(UUID.randomUUID().toString());
        return vehiculosRepo.save(vehiculo);
    }

    public List<Vehiculo> findAllVehiculos(){
        return vehiculosRepo.findAll();
    }

    public Vehiculo uptateVehiculo(Vehiculo vehiculo){
        return vehiculosRepo.save(vehiculo);
    }

    public Vehiculo findVehiculoById(Long id){
        return vehiculosRepo.findVehiculoById(id).orElseThrow(() -> new UserNotFountException("User by id" + id + "was not found"));
    }

    public void deleteVehiculo(Long id){
        vehiculosRepo.deleteVehiculoById(id);
    }
}

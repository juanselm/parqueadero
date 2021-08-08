package tech.getarrays.employeemanager;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.employeemanager.Service.VehiculoService;
import tech.getarrays.employeemanager.model.Vehiculo;

import java.util.List;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoResourse {
    private final VehiculoService vehiculoService;

    public VehiculoResourse(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Vehiculo>> getAllVehiculos(){
        List<Vehiculo> vehiculos = vehiculoService.findAllVehiculos();
        return  new ResponseEntity<>(vehiculos, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Vehiculo> getVehiculosById (@PathVariable("id") Long id){
        Vehiculo vehiculos = vehiculoService.findVehiculoById(id);
        return  new ResponseEntity<>(vehiculos, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Vehiculo> addVehiculo(@RequestBody Vehiculo vehiculo){
        Vehiculo newvehiculo = vehiculoService.addVehiculo(vehiculo);
        return  new ResponseEntity<>(newvehiculo, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Vehiculo> updateVehiculo(@RequestBody Vehiculo vehiculo){
        Vehiculo updatevehiculo = vehiculoService.uptateVehiculo(vehiculo);
        return  new ResponseEntity<>(updatevehiculo, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteVehiculo(@PathVariable("id") Long id){
        vehiculoService.deleteVehiculo(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
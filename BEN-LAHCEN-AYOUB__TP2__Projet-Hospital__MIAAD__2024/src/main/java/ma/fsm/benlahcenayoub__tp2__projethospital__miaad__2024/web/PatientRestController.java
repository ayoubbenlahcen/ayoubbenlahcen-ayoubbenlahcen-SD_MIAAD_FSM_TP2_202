package ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.web;

import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.entities.Patient;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.repositories.IPationtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestController {
    private final IPationtRepository pationtRepository;

    public PatientRestController(IPationtRepository pationtRepository) {
        this.pationtRepository = pationtRepository;
    }
    @GetMapping("/patients")
    List<Patient>  patientList(){
        return pationtRepository.findAll() ;
    }
}

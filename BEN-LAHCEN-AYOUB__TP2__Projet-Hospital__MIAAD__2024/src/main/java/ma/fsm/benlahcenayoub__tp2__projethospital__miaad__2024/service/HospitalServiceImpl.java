package ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.service;

import jakarta.transaction.Transactional;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.entities.Consultation;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.entities.Medecin;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.entities.Patient;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.entities.RendezVous;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.repositories.IConsultationRepository;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.repositories.IMedecinRepository;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.repositories.IPationtRepository;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.repositories.IRendezVousRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    private IPationtRepository pationtRepository ;

    private  IMedecinRepository medecinRepository ;
    private IConsultationRepository consultationRepository ;
    private IRendezVousRepository rendezxVousRepository ;

    public HospitalServiceImpl(IPationtRepository pationtRepository,
                               IMedecinRepository medecinRepository,
                               IConsultationRepository consultationRepository,
                               IRendezVousRepository rendezxVousRepository) {

        this.pationtRepository = pationtRepository;
        this.medecinRepository = medecinRepository;
        this.consultationRepository = consultationRepository;
        this.rendezxVousRepository = rendezxVousRepository;
    }
    /*
        Il faut faire dans la tete que cette
        va etre considerer notre couche metier ou on va faire notre code metier
     */

    /*
        avant de faire n'importe qui'il sauvgarde il faut faire des verification
        alors c'est al ou vous pouvez les faires  seulement
        et puisque on essaye de compredre on a oa fait ca

     */
    @Override
    public Patient savePatient(Patient patient) {
        return pationtRepository.save(patient) ;
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        return rendezxVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}

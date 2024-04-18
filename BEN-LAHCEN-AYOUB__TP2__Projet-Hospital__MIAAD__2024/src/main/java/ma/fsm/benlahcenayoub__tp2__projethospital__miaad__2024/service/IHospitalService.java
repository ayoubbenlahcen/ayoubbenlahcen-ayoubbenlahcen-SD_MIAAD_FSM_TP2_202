package ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.service;

import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.entities.Consultation;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.entities.Medecin;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.entities.Patient;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRendezVous(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}

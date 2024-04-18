package ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.repositories;

import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.entities.Consultation;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConsultationRepository extends JpaRepository<Consultation, Long> {
}

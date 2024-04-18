package ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024;

import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.entities.*;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.repositories.IConsultationRepository;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.repositories.IMedecinRepository;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.repositories.IPationtRepository;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.repositories.IRendezVousRepository;
import ma.fsm.benlahcenayoub__tp2__projethospital__miaad__2024.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.buffer.DataBuffer;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class BenLahcenAyoubTp2ProjetHospitalMiaad2024Application {

	public static void main(String[] args) {
		SpringApplication.run(BenLahcenAyoubTp2ProjetHospitalMiaad2024Application.class, args);
	}

	@Bean
	CommandLineRunner start(IHospitalService hospitalService,
							IPationtRepository pationtRepository,
							IMedecinRepository medecinRepository,
							IRendezVousRepository rendezVousRepository){
		return args -> {
			Patient patient = new Patient() ;
			Stream.of("Mohamed", "Hassan ", "Najat" ).forEach(name ->{
			patient.setNom(name);
            patient.setDateNaissance(new Date());
			patient.setMalade(false);
			hospitalService.savePatient(patient);
			});
			Stream.of("Aymane", "Hanane ", "Yasmine" ).forEach(name ->{
				Medecin medecin = new Medecin() ;
				medecin.setNom(name);
				medecin.setSpecialite(Math.random()>0.5?"Cardio" :"Dentiste");
				medecin.setEmail(name+"@gmail.com");
				hospitalService.saveMedecin(medecin) ;
			});

			Patient pation1 = pationtRepository.findById(1L).orElse(null) ;
			Patient pation2 = pationtRepository.findByNom("Mohamed") ;

			Medecin medecin = medecinRepository.findByNom("Yasmine") ;
			RendezVous rendezVous= new RendezVous() ;
			rendezVous.setDate(new Date());
			rendezVous.setStatus(StatusRDV.ANNULE);
			rendezVous.setMedecin(medecin);
			rendezVous.setPatient(patient);
			hospitalService.saveRendezVous(rendezVous) ;

			RendezVous  rendezVous1 = rendezVousRepository.findById(1L).orElse(null) ;
			Consultation consultation = new Consultation() ;
			consultation.setDateConsulation(new Date());
			consultation.setRendezVous(rendezVous1);
			consultation.setRapport("Rapport de Consultation ........ ");
			hospitalService.saveConsultation(consultation) ;

		};
	};

}

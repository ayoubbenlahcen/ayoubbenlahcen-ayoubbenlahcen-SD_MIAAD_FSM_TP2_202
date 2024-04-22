# SD_MIAAD_FSM_TP2_2024 petit raport

Pour ce qui concerne ce TP2, nous avons essayé de le diviser en 3 parties :

La première partie consiste à voir comment installer IntelliJ, puis à connaître comment créer un projet Spring :
Après la création du projet, que ce soit à partir de IntelliJ IDEA ou à partir de Spring Starter, nous avons essayé de réaliser les tâches suivantes :

  ## TP2 partie 1 : installation creation de la premiere Application Spring : 
Mais tout d'abord, voici l'architecture de notre première application Spring:  
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/0c7c38e4-bc25-4ca5-9835-693eb6d32269)

    1. Créer l'entité JPA Patient ayant les attributs :
         - id de type Long
         - nom de type String
         - dateNaissanec de type Date
         - malade de type boolean
         - score de type int
         Voici une image de l'implimentation : 
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/dcb8fc41-c2c9-422b-947d-c3a7eac7dac4)

   2. Configurer l'unité de persistance dans le ficher application.properties
     Voici la configuration que nous avons faite :
     
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/b3c979f0-410d-4c8c-9436-1de3c7a7349b)

   4. Créer l'interface JPA Repository basée sur Spring data
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/e98e9052-0a3e-4ff6-b6b3-e8b89afb139a)

   5. Tester quelques opérations de gestion de patients :
     
      - Ajouter des patients
      - Consulter tous les patients
      - Consulter un patient
      - Chercher des patients
      - Mettre à jour un patient 
      - supprimer un patient
    
      Voici le code de teste :
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/38748f2a-7996-4b10-b2fd-7b85fdaddd83)
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/e6adae9c-6109-44fb-b642-24c2e2003829)
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/edaa0657-a017-45be-abd9-3508556cc4bc)

  7. Migrer de H2 Database vers MySQL
     - Pour faire cela, nous avons effectué une petite configuration au niveau du fichier application.properties, comme l'image suivante le montre :
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/0ead5a5f-f3f0-4344-a4e7-a905d1e937f2)

  8. Comme dans l'architecture de l'application, nous avons un package appelé 'web' qui jouera un rôle essentiel lorsque nous attaquerons la partie Web dans la deuxième partie de ce TP2.


  ## TP2 partie 2 : la creation d'une Application Spring pour la gestion des Patients :
  Dans cette deuxième partie du TP2, nous avons essayé de nous familiariser avec le Mapping. Avant d'en parler, je vous invite à voir l'architecture de notre application qui est montrée dans l'image suivante  :
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/2b5426f6-e5cb-4042-984a-14ce182be43f)

1. Créer les entités JPA Patient  :
   
   1.1. L'entité Patient ayant les attributs :
   
       - id de type Long
   
       - nom de type String
   
       - dateNaissanec de type Date
   
       - malade de type boolean
   
       - score de type int
   
       - une collection de type RendezVous
   
       - malade de type boolean
   ![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/e9a94961-6b1c-4b01-a4d0-23f0cf0c85f4)

   
   1.2. L'entité RendezVous ayant les attributs :
   
       - id de type Long
   
       - Date de  ype Date

       - Status de type StatusRDV telque  StatusRDV est une classe Enumerer qui peut predre soit EN_Courr , Annule , traiter .

       - un patient de type Patient

       - un medecin de type Medecin
   ![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/fc07d77c-561c-47d7-bf6f-59080727e5c3)


  1.3. L'entité Medecin ayant les attributs :
   
       - id de type Long
       
       - nom de  type String
       
       - email de type String
       
       - specialite de type String
       
       - une collection des rendez-vous
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/456a785d-0353-4fbe-adbb-ef97c01b4e5e)

  1.4. La classe Enumerer StatusRDV :
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/feb67b44-98db-4d2b-b2f1-16c3987693a1)


  1.5. L'entité Consultation ayant les attributs :
       
       - id de type Long
       
       - DateConsultation de type Date
       
       - rapport de type string
       
       - un rendez-vous de type RendezVous
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/40a8d361-9a07-432b-825e-08729cdfa229)


3. Configurer l'unité de persistance dans le ficher application.properties

   c'est comme la partie 1 de ce TP2.
   
5. Créer les interfaces JPA Repositories basée sur Spring data

       telque on  a creer un package Repository  ou on a creer pour chaque entité une inteface Repository ou on va faire l'ensempble des prototype  ous bien les syntace que Spring utilse pour faire la manipulation
       des donnes correspond a l'entite :

       Voici les defferents Repositories qu'on a  creé :

         - IConsultationRepository

         - IMedecinRepository

         - IPationtRepository

         - IRendezVousRepository

   Comme j'ai dit deja un repository pour chaque netité , et voici la forme de chaque repository :

   on va prendre l'exemple de  IPationtRepository et pour les autre ils ont la meme forme seulement au niveau du nom de l'inteface ou il ya le changement et l'entite qui va lieé a le repository aussi il faut faire attention au
   "extends JpaRepository<Patient, Long>" c'est a dire pour qu'un repository marcher bien il faut qu'il va heriter a partir de JpaRepository , et pour  <Patient, Long> comme j'ai dit deja  : Patient c'est l'etité dont la quel ce repository     est construit  , Long ; c'est pour le type de l'id de l'entité.
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/dd9adb20-9702-49f7-ac5b-21cf02408eae)

7. Tester quelques opérations de gestion de patients :
    - Ajouter des patients
    - Consulter tous les patients
    - Consulter un patient
    - Chercher des patients
    - Mettre à jour un patient 
    - supprimer un patient

      maitenant pour tester est ce que notre base de donne est creé avce succée  on a besoin de specifier où notre base de donées se trouve c'est pour cela on va partir vers
      le fichier  'application.properties'
      
      puis faire soit dans le cas d'utilisation de la base de donne H2:
      
            spring.application.name=Hospital__TP2__Projet-Hospital__MIAAD__2024

            server.port=8085

            spring.datasource.url=jdbc:h2:mem:hospital-db

            spring.h2.console.enabled=true

      ou le code suivant pour  migrer de H2 Database vers MySQ :
      
        spring.application.name=Hospital__TP2__Projet-Hospital__MIAAD__2024
      
        server.port=8085

        spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:${MYSQL_PORT:3306}/products-db?createDatabaseIfNotExist=true

        spring.datasource.username=${MYSQL_USER:root}

        spring.datasource.password=${MYSQL_PWD:}

        spring.jpa.hibernate.ddl-auto=update

        spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.MariaDBDialect

      Voivci le code que j'ai fais comme teste:
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/58fcd53f-2c45-4ce5-9596-e0ddb966266c)
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/7098945b-acb2-4461-85d8-9e4e75b954a0)

8. Le plus imoortant maintenant c'est comment Spring arriver de connaitre les entites quannt on a  dans notre application alors la reponce c'est grace au notation suivant suivant :

  - @Entity : qui indique que la classe suivant va etre une table dans la base de donnée
  - @Data   : pour les getter et les setter
  - @AllArgsConstructor : pour un constructeur avec tout les parametre
  - @NoArgsConstructor : pour un contructeur sans parametre
  - @Id @GeneratedValue(strategy = GenerationType.IDENTITY) : pour specifier Id de l'entite puis il va etre incrementer automatiquement grace a @GeneratedValue
  - @OneToMany(mappedBy = "patient") : c'est pour faire le mapping autrement dite faire les multiplicite et
                                   aussi la liaison entre les deux tableaux Patient et aussi RendezVous
                                   A savoir s'il vous plait que : map pedBy = "patient"
                                                                     patient est est attribue dans la classe RendezVous

    meme quand on a fait ça precdament dans le code , voici une exemple d'utilisation dans le cas de l'entité Patient :
    
        @Entity @Data @AllArgsConstructor @NoArgsConstructor
    
        public class Patient {
    

            @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

            private Long id ;

            private String nom ;

            @Temporal(TemporalType.DATE)

            private Date DateNaissance  ;

            private boolean malade ;

            @OneToMany(mappedBy = "patient")

            private Collection<RendezVous> rendezVous ;

        }

"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
maintenant on va faire un teste:
toute en implimentant l'inteface CommandLineRunner
pour utiliser la  methode run qui va etre executer apres que Spring soit en marche
ou bien on peut faire une methode qui va nous retournons un objet de type CommandeLineRunner  comme suite :

	CommandLineRunner start(IHospitalService hospitalService,
							IPationtRepository pationtRepository,
							IMedecinRepository medecinRepository,
							IRendezVousRepository rendezVousRepository){
	    /// ici on va faire notre petit code
			}}
   
a l'aide des objet passé en parametre de la fonctiion de start() on na la possiblite  de manipuler les donnes qui de la table
pacient  medecine et aussi les autre entity


la seule probleme quand on a avec cette facon d'implimentation c'est que chaque fois quand on a un nouveau entite
il faut ajouter son trepository  a l'ensempble des repositories qui sont dans les parametre de la methode run

ce qui n'est pas bien


la solution c'st de faire ajouter un nouveau package 'Service' u qui va contenir l'inteface HospitalService
telque dans cette dernier on va essayer d'implimenter les deferent fonctions qui correspond anotre code metier  comme suivant  :
@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    private IPationtRepository pationtRepository ;

    private  IMedecinRepository medecinRepository ;
    private IConsultationRepository consultationRepository ;
    private IRendezVousRepository rendezxVousRepository ;

    // cette c'est pour faire l'injection des dependance en utlisant la methde du constructeur
    // il est possible de changer cette en utilsant les anotations @Autowired
    // en le mettre avand la declaration de chaque variable de type Repository

    public HospitalServiceImpl(IPationtRepository pationtRepository,
                               IMedecinRepository medecinRepository,
                               IConsultationRepository consultationRepository,
                               IRendezVousRepository rendezxVousRepository) {

        this.pationtRepository = pationtRepository;
        this.medecinRepository = medecinRepository;
        this.consultationRepository = consultationRepository;
        this.rendezxVousRepository = rendezxVousRepository;
    }
    //ici on va faire notre code metier toute en utilisant repositoriee deja creer
    //par exemple :  la fonction savePatient sui va nous permettons d'enregister un patient
    //               ou la fonction findPatient() pour chercher un patient
    //               et d'autre pour les autres entités
}

quand  on va utiliser la methode save par exemple  dans le cas suivant :
Pacient pacientSave = reporitoryPatient.save(pacient) (toujours l'objet sauvEgarder eSt routourné donc je peut le recoupere si j'ai besoin de ça )


l'un des remarques les plus importantes c'est de faire utiilser des ID des entités de type String:

alors  pour cela  on va utiliser les UUID.randomUUID().toString() comme suite :

supposant que l'entite est 'RendezVous'
    a L'interieure de l'opository  correspodant a l'entite qui a un Id de type String on  va faire le modefication suivant:

    -public interface IRendezVousRepository extends JpaRepository<RendezVous, String> {
     }

     -Aussi dans HospitalServiceImpl en va faire une modefication au niveau de la fonction sui va nous permettons de faire
      le save de l'objet de RendezVous comme suite :

@Service

@Transactional

public class HospitalServiceImpl implements IHospitalService {

    private IPationtRepository pationtRepository ;
    private  IMedecinRepository medecinRepository ;
    private IConsultationRepository consultationRepository ;
    private IRendezVousRepository rendezxVousRepository ;

    // cette c'est pour faire l'injection des dependance en utlisant la methde du constructeur
    // il est possible de changer cette en utilsant les anotations @Autowired
    // en le mettre avand la declaration de chaque variable de type Repository

    public HospitalServiceImpl(IPationtRepository pationtRepository,
                               IMedecinRepository medecinRepository,
                               IConsultationRepository consultationRepository,
                               IRendezVousRepository rendezxVousRepository) {

        this.pationtRepository = pationtRepository;
        this.medecinRepository = medecinRepository;
        this.consultationRepository = consultationRepository;
        this.rendezxVousRepository = rendezxVousRepository;
    }

    public RendezVous saveRDV ( RendezVous rendez_vous){
        // utiliser Le UUID pour generer une chaine aleatoire unique (qui depend de la date de systeme)
        rendez_vous.setId(UUID.randomUUID().toString())
        return rendezxVousRepository.save(rendez_vous)
    }
}

si en veux faire la partie web en va ajouter un package 'web' ou en va creer
une classe PatientController qui va nous permettons de faire  controller
les intefaces de patient a partir de web.

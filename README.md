# SD_MIAAD_FSM_TP2_2024 petit raport

pour ce qui concirne ce TP2 on essayer de le faire en 3 partie : 
  la premier c'est pour voir comment installer intellij 
  puis connaitre comment creer un projet Spring : 
  apres la creation du projet soit a partir de IDE intellij ou a partir spring starter
  on essayer de faire les choses suivantes :
  ## TP2 partie 1 : installation creation de la premiere Application Spring : 
    Mais tous d'abord voici l'arrchitecture de notre Premmier application Spring: 
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
     Voici la configuration qu'on a fait :
     
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
     - pour faire ça on fait une petit configuration au niveau du fichier application.properties commme l'image suivant montre :
![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/0ead5a5f-f3f0-4344-a4e7-a905d1e937f2)

  8. Comme dans l'architecture de l'application on a un package qui s'appel 'web'  celui la va jouer un role essentiel lorsque on va attaquer la partie Web dans la deusiemme partie de ce TP2.


  ## TP2 partie 2 : la creation d'une Application Spring pour la gestion des Patients :
  dans cette deusiemme partie du TP2 on a essayé de familiariser aver le Mapping mais avant de faire parler sur ça je vous ivte de faire voir L'architecture de notre application qui est montré dans l'image suivante :
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
   
   1.2. L'entité RendezVous ayant les attributs :
       - id de type Long
       - Date de  ype Date
       - Status de type StatusRDV telque  StatusRDV est une classe Enumerer qui peut predre soit EN_Courr , Annule , traiter .
       - un patient de type Patient
       - un medecin de type Medecin

  1.3. L'entité Medecin ayant les attributs :
       - id de type Long
       - nom de  type String
       - email de type String
       - specialite de type String
       - une collection des rendez-vous

  1.4. L'entité Consultation ayant les attributs :
       - id de type Long
       - DateConsultation de type Date
       - rapport de type string
       - un rendez-vous de type RendezVous

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
   "extends JpaRepository<Patient, Long>" c'est a dire pour qu'un repository marcher bien il faut qu'il va heriter a partir de JpaRepository , et pour  <Patient, Long> comme j'ai dit deja  : Patient c'est l'etité dont la quel ce repository est construit  , Long ; c'est pour le type de l'id de l'entité.
   ![image](https://github.com/ayoubbenlahcen/ayoubbenlahcen-ayoubbenlahcen-SD_MIAAD_FSM_TP2_2024/assets/152870306/dd9adb20-9702-49f7-ac5b-21cf02408eae)

7. Tester quelques opérations de gestion de patients :
    - Ajouter des patients
    - Consulter tous les patients
    - Consulter un patient
    - Chercher des patients
    - Mettre à jour un patient 
    - supprimer un patient
8. Migrer de H2 Database vers MySQL

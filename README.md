# SD_MIAAD_FSM_TP2_2024 petit raport

pour ce qui concirne ce TP2 on essayer de le faire en 3 partie : 
  la premier c'est pour voir comment installer intellij 
  puis connaitre comment creer un projet Spring : 
  apres la creation du projet soit a partir de IDE intellij ou a partir spring starter
  on essayer de faire les choses suivantes :
  ## TP2 partie 1 : installation creation de pramier Application Spring : 
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

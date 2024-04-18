package ma.fsm.benlahcenayoub__tp2__miaad__2024.produit_projet.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/*  Ajouter  les getters et les setters a l'aide de
    lombok.Data dans le byte code sans l'ecraire dans le code
    lombok.NoArgsConstructor pour le constructeur sans parametre
    lombok.AllArgsConstructor pour le constructeuu qui va inialiser
                              tout les attributes

 */
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name ;
    private double price ;
    private int quantity ;


}

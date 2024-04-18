package ma.fsm.benlahcenayoub__tp2__miaad__2024.produit_projet.repository;

import ma.fsm.benlahcenayoub__tp2__miaad__2024.produit_projet.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List ;

// Voici le repository dans laquel je dois creer inteface qui va nous permete de gerer l'entity Produit
public interface IProductRepository extends JpaRepository<Product,Long> {
    /*
    conciderant maintenant quand on veux chercehr le produits  ou il y a la designation un mot cle
    on a deux facon :
        la premier facon est la suivant:
     */
    List<Product> findProductByNameContains(String mc);
    /*
        la deusiemme facon pour faire la recherche sur um poroduit qui contient une designation
        est la suivant:
     */
    @Query("select p from Product p where p.name like :x ")
    List<Product> search(@Param("x") String mc);

    /*
    De meme si je veux avoir les produits qui ont un prix  superieur a une valeur
    on a deux facon a faire ça la premier est la suivant:
     */
    List<Product> findProductByPriceGreaterThan(double price);
     /*
        la deusiemme et la suivant ;
     */
     @Query("select p from Product p where p.price > :x ")
     List<Product> searchByPrice(@Param("x") double price );
}

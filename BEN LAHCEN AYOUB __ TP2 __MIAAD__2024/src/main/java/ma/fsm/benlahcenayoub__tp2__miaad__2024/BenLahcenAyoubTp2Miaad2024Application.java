package ma.fsm.benlahcenayoub__tp2__miaad__2024;

import ma.fsm.benlahcenayoub__tp2__miaad__2024.produit_projet.entities.Product;
import ma.fsm.benlahcenayoub__tp2__miaad__2024.produit_projet.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

/*
	Dans Spring je suis besoin d'execute le code un fois Spring  est demarré
	alors la façon la plus simpleet d'implimenter l'interface CommandLineRunner
	c'est pour cela on va implimenter l'interface  CommandLineRunner
	qui va contenir la fonction run() qui va etre lance une fois Spring est lancé
 */

/*
	pour pouvoir gerer les produits je suis besoin d''utiliser SpringData
	alors voici les etaps a suivre pour faire ça :
		1) 	creer un package que je dois l'appele repository dont laquel
			je dois creer l'inteface que je dois l'appele ProductRepository qui herite  de JPARepository dant laquel
			on va essayer de gerer l'entité Produit qui a un Id de type Long



 */
@SpringBootApplication
public class BenLahcenAyoubTp2Miaad2024Application implements CommandLineRunner {

	@Autowired
	private IProductRepository productRepository ;

	public static void main(String[] args) {
		/*
			A savoir quand on va  lancer notre projet le premier qui va lancer est Spring
			Tel que il va scanner les classes,les annotations
			alors lui qui va faire l'inversion de controle et l'injection dependance
		 */
		SpringApplication.run(BenLahcenAyoubTp2Miaad2024Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

/*		productRepository.save(new Product(null, "computer", 4300, 3)) ;
		productRepository.save(new Product(null, "Printer", 1200, 4)) ;
		productRepository.save(new Product(null, "Smart Phone", 3200, 32)) ;

 */
		List<Product> products = productRepository.findAll();

		products.forEach(p->{
			System.out.println(p.toString());
		});
		Product product = productRepository.findById(Long.valueOf(1)).get();
		System.out.println("********************************");
		System.out.println("Id de produit       : "+ product.getId());
		System.out.println("Nom de produit      : "+product.getId());
		System.out.println("Prix de produit     : "+product.getId());
		System.out.println("Quantité de produit : "+product.getId());
		/*
			Le probleme jusqu'a maintennt c'est que nous utilisant la bese de donnee H2 data base
			qui es  une base de donnee  qui dans la memoire  autrement dit les donne vont etre suppimer
			lorsque l'application est arreié

		 */
		System.out.println("********************************");
		/*
			Alors supposant maintenant que je veux basculer vers a une base de donne  de type MySql
 			Premierement il faut faire de configurations des dependances sous le fichier pom.XML
 			alors dans le fichir de confugyration pom.XML il faut  ajouter l'independance de Mysql
 		*/

		/*
		Voici  un exemple de la recherche sur les produits en utilisant un mot cle
		en utliosant les deux methode la premier qui consiste  faire reformuler la foction
		les terme que Spring comprend, et la deusimme  en utilisant l'anotation @Query
		 */
		List<Product> produitList = productRepository.findProductByNameContains("c");
		produitList.forEach(produit->{
			System.out.println(produit.toString());
		});

		 /*
			Au lieu de faire findBy il possible commme on a dit deja d'utliser la methode d'annotation
		 */
		List<Product> produitList2 = productRepository.search("%c%");
		produitList2.forEach(produit->{
			System.out.println(produit.toString());
		});

		System.out.println("********************************");
		List<Product> productsListe3 = productRepository.findProductByPriceGreaterThan(3000);
		productsListe3.forEach(produit->{
			System.out.println(produit.toString());
		});

		 /*
			Au lieu de faire findBy il possible commme on a dit deja d'utliser la methode d'annotation
		 */
		List<Product> productsListe4 = productRepository.searchByPrice(3000);
		productsListe4.forEach(produit->{
			System.out.println(produit.toString());
		});
		System.out.println("********************************");

	}
}

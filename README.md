# Mercadona

## Présention de l'entreprise
Mercadona, célèbre entreprise dans le milieu du retail dispose de 1675 magasins en Espagne réalisant ainsi un chiffre d’affaires de 20 milliards d’euros. Son succès se dessine à travers des promotions très fréquentes, il y a toujours un minimum d’une centaine de produits en promotion et à tout moment de l’année.

Pour le moment, Mercadona ne fonctionne que par des tracts publicitaires. Le problème qui se pose est la dimension écologique : Mercadona prend de plus en plus conscience que les énergies doivent être économisées et souhaite ne plus proposer des tracts, mais une
application web.

Mercadona n’est pas expert du web, de ce fait, ils ont pris contact avec PromoWeb dont vous faites partie, une ESN spécialisée dans ce domaine. Mercadona a nommé dans leurs effectifs une personne qui va se charger de présenter de projet à PromoWeb, il se nomme José.

## Description du projet
Les missions que vous devrez effectuer sont les suivantes :
  - Analyse du projet
  - Production des documents nécessaires au développement d’une application
  -  Développement de l’application
  
Afin de mener cela à bien, José, connaissant tous les tenants et aboutissant, vous fait un résumé de tout ce que le client attend.

Le client, Mercadona, souhaite une application en trois parties :
  - Front-end : permettant à un utilisateur de consulter les promotions
  - Back-end : enregistrant les données vers la base de données
  - Base de données : stockage de l’information

José vous explique que le but de l’application est d’afficher des promotions. Pour ce faire, votre application web devra pouvoir authentifier un visiteur (uniquement
possible pour les administrateurs) afin de pouvoir ajouter des promotions sur des produits.

Le processus de mise en ligne d’une promotion est le suivant :
  - L’administrateur crée un produit sur son espace avec un premier prix
    - Un produit est défini par
      - Un libelle, une description, un prix, une image ainsi qu’une catégorie
      - Une catégorie est définie par un libelle uniquement

 - Une fois les produits créent, il est possible de le mettre en promotion, pour ce faire, il doit accéder au produit depuis l’espace Admin et clic sur un bouton « promotion » et saisis un pourcentage de promotion à appliquer au prix. Le nouveau prix est calculé automatiquement.
   - Une promotion est caractérisée par
    - une date de début ainsi qu’une date de fin
    - Un pourcentage de remise

Tous les produits, même ceux sans promotion, sont visibles sur l’onglet « catalogue », accessible depuis le menu de l’application web sans aucune authentification. Un filtre est disponible sur cette page afin d’afficher les produits par catégorie.

La vue détaillée d’un produit n’est pas possible, la page « catalogue » affiche toutes les informations d’un produit : lorsqu’un produit est en promotion, son prix doit être affiché en gras et en rouge.

José vous demande d’effectuer les missions qui vous sont exposées dans les dossiers suivants.

## Stack technique

Aucune contrainte technique n’est imposée, mise à part PostGreSQL ainsi que Java pour la
partie back-end.

Si vous n’avez pas d’idée technique, voici un exemple possible :

- Front : _template HTML Spring (thymeleaf) ou un front classique (ReactJS, Angular, etc)_
- Back-end : _Java (Spring Boot)_ => obligatoire
- Base de données : _PostgreSQL_ => obligatoire
- Déploiement : _fly.io , Heroku_




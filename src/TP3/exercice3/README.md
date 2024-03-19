# TP3
## Exercice 3
### Diagramme de Classes

```mermaid
---
title: TP3 - Exercice 3 - Diagramme de Classes
---
classDiagram
    
    class Magasin {
        - nom: String
    }
    
    class Adresse {
        - rue: String
        - codePostal: String
        - ville: String
        + Adresse(rue: String, codePostal: String, ville: String)
        + getRue() String
        + setRue(rue: String) void
        + getCodePostal() String
        + setCodePostal(codePostal: String) void
        + getVille() String
        + setVille(ville: String) void
        + toString() String
    }

    class Livre {
        - nbPages: int
        - isbn: String
        + Livre(nbPages: int, isbn: String, auteur: Auteur)
        + getNbPages() int
        + setNbPages(int nbPages) void
        + getIsbn() String
        + setIsbn(isbn: String) void
        + getAuteur() Auteur
        + setAuteur(auteur: Auteur) void
        + toString() String
    }

    class Auteur {
        - nom String
        - prenom String
        - dateNaissance LocalDate
        + Auteur(nom: String, prenom: String, dateNaissance: LocalDate)
        + getNom() String
        + setNom(nom: String) void
        + getPrenom() String
        + setPrenom(prenom: String) void
        + getDateNaissance() LocalDate
        + setDateNaissance(dateNaissance: LocalDate) void
        + toString() String
    }
    
    Magasin *-->  Adresse
    Magasin "1" o--> "0..*" Livre : Vend v
    Livre "1..*" --> "1" Auteur
```

En faisant une **composition** de l'adresse dans le magasin, si deux magasins ont la même adresse, l'adresse sera dupliquée, mais nous pouvons considérer que notre client n'a aucune raison d'avoir deux magasins à la même adresse. 

De plus, si notre client décide de se séparer d'un magasin, il n'a aucune raison de garder son adresse. Grâce à la composition, si un magasin est supprimé, son adresse l'est aussi. Si on souhaite conserver l'adresse lorsqu'un magasin est fermé, une agrégation est préférable.
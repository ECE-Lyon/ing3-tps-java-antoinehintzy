# Cahier des charges (CDC)

Un organisme culturel souhaite que nous réalisions pour elle une application en Java,
afin de gérer les œuvres de ses musées. 
Chaque musée dispose d'un nom et de plusieurs salles d'exposition. 
Chaque salle d'exposition, d'un numéro et d'une superficie donnée, 
contient des œuvres ayant chacune un nom, une description et un artiste.
Un artiste est représenté par un nom et un prénom.
L'organisme ne gère que deux types d'œuvres :
des tableaux, ayant une hauteur, une largeur et un statut portrait/paysage,
et des statues ayant une hauteur, une largeur, une profondeur et une matière.

## Diagramme de classes 

```mermaid
---
title: Diagramme de classes
---
classDiagram
    class Musée {
        - nom: String
        + Musee(nom: String)
        + getNom() String
        + setNom(nom: String) void
        + addSalle(numero: int, superficie: float): void
        + toString(): String
    }

    class SalleExpo {
        - numero: int
        - superficie: float
        + SalleExpo(numero: int, superficie: float)
        + getNumero() int
        + setNumero(numero: int) void
        + getSuperficie() float
        + setSuperficie(superficie: float) void
        + addOeuvre(oeuvre: Oeuvre) void
        + toString(): String
    }

    class Oeuvre {
        # nom: String
        # description: String
        + Oeuvre(nom: String, description: String, artiste: Artiste)
        + getNom() String
        + setNom(nom: String) void
        + getDescription() String
        + setDescription(description: String) void
        + getArtiste() Artiste
        + setArtiste(artiste: Artiste) void
        + toString(): String
    }
    class Artiste {
        - nom: String
        - prénom: String
        + Artiste(nom: String, prenom: String)
        + getNom() String
        + setNom(nom: String) void
        + getPrenom() String
        + setPrenom(prenom: String) void
        + toString(): String
    }
    class Tableau {
        hauteur: float
        largeur: float
        paysage: boolean
        + Tableau(nom: String, description: String, hauteur: float, largeur: float, paysage: boolean)
        + getHauteur() float
        + setHauteur(hauteur: float) void
        + getLargeur() float
        + setLargeur(largeur: float) void
        + getPaysage() boolean
        + setPaysage(paysage: boolean) void
        + toString(): String
    }
    class Statue {
        hauteur: float
        largeur: float
        profondeur: float
        matiere: String
        + Statue(nom: String, description: String, hauteur: float, largeur: float, profondeur: float, matiere: String)
        + getHauteur() float
        + setHauteur(hauteur: float) void
        + getLargeur() float
        + setLargeur(largeur: float) void
        + getProfondeur() float
        + setProfondeur(profondeur: float) void
        + getMatiere() String
        + setMatiere(matiere: String) void
        + toString(): String
    }
    
    Musée *--> "0..n" SalleExpo
    SalleExpo o--> "0..n" Oeuvre
    Oeuvre "1..n" --> "1" Artiste
    Oeuvre <|-- Tableau
    Oeuvre <|-- Statue
```
**NB :** On aurait pu mettre `largeur` et `hauteur` directement dans la classe `Oeuvre` car ce sont des attributs communs aux deux types d'oeuvres.
Cependant, en faisant comme ça, on pourra créer d'autres types d'oeuvres qui n'ont pas de `largeur` ou pas de `hauteur`.
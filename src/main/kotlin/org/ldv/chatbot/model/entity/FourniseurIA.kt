package org.ldv.chatbot.model.entity

import jakarta.persistence.*

@Entity
class FourniseurIA(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    @Column(nullable = false)
    var nom: String,

    var cheminLogo: String? = null,

    @Column(columnDefinition = "TEXT")
    var description: String? = null,

    // Relation avec les modèles (optionnelle à l'initialisation)
    @OneToMany(mappedBy = "fourniseurIA", cascade = [CascadeType.ALL])
    var modeles: List<ModeleIA> = mutableListOf()
)
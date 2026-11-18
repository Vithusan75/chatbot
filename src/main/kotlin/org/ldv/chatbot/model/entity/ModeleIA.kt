package org.ldv.chatbot.model.entity

import jakarta.persistence.*

@Entity
class ModeleIA(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    @Column(nullable = false)
    var nom: String,

    @Column(columnDefinition = "TEXT", nullable = false)
    var urlAPI: String,

    @Column(columnDefinition = "TEXT")
    var description: String? = null,

    var cheminLogo: String? = null,

    // Relation ManyToOne vers FourniseurIA
    @ManyToOne
    @JoinColumn(name = "fourniseur_ia_id", nullable = false)
    var fourniseurIA: FourniseurIA
)
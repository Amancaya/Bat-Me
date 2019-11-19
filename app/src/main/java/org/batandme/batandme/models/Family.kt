package org.batandme.batandme.models

data class Family(
    var commonName: String,
    var author: String,
    var information: String,
    var speciesQuantity: Int,

    var species: List<Specie>,
    var habitat: Habitat,
    var anatomy: Anatomy,
    var curiosity: Curiosity
)
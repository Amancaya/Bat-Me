package org.batandme.batandme.models

data class Specie(
    var commonName: String,
    var scientificName: String,
    var description: String,
    var discoveredInformation: String,

    var trophicGroup: TrophicGroup,
    var images: List<Image>,
    var bioGeographicProvinces: List<BioGeographicProvince>
)
package org.batandme.batandme.models

data class BioGeographicProvince(
    var name: String,
    var geographicZone: String,
    var departments: List<Department>
)
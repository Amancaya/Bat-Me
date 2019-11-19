package org.batandme.batandme.models

import java.util.*

data class Report(
    var created: Date,
    var description: String,
    var placeDetails: String,
    var latitude: Long,
    var longitud: Long,
    var batQuantity: Int,
    var synchronizedReport: Date,

    var images: List<Image>
)
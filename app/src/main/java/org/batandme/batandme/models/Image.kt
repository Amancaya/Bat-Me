package org.batandme.batandme.models

import org.batandme.batandme.models.enums.ImageType

data class Image(
    var imageUrl: String,
    var type: ImageType
)
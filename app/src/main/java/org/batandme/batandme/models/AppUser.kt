package org.batandme.batandme.models

data class AppUser(
    var email: String,
    var photoUrl: String,
    var fullname: String,
    var age: Int,
    var cellphone: String,
    var genre: String,
    var address: String,
    var quantityReports: Int,
    var occupation: String,
    var city: String,
    var country: String,

    var reports: List<Report>
)

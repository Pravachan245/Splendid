package uk.ac.tees.mad.splendid.data

data class User(
    val firstName: String,
    val lastName: String,
    val email: String,
    val imagePath: String = ""
){
    constructor(): this("","","","")
}

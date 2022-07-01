var likes = 11
fun main() {

    var solution = if (likes % 10 != 1) {
        "Людям"
    } else if (likes % 100 != 11) {
        "Человеку"
    } else {
        "Людям"
    }
    println("Понравилось $likes $solution")
}

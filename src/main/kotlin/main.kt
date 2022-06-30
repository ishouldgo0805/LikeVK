fun main() {
    var likes = 60
    if (likes == 0) {
        println("Тут пока ещё нет лайков")
    } else if (likes == 1) {
        println("Понравилось $likes человеку")
    } else if (likes == 21) {
        println("Понравилось $likes человеку")
    } else if (likes == 31) {
        println("Понравилось $likes человеку")
    } else if (likes == 41) {
        println("Понравилось $likes человеку")
    } else if (likes == 51) {
        println("Понравилось $likes человеку")
    } else if (likes >= 2 && likes <= 20) {
        println("Понравилось $likes людям")
    } else if (likes >= 22 && likes <= 60) {
        println("Понравилось $likes людям")
    }
}
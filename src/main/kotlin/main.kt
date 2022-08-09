fun main() {

    val previousTransactions = 75000

    val cardType = "Vk Pay"

    val amount = 400

    println("Сумма перевода: " + amount + " р.")
    println("Сумма комиссии: " + comissionType(previousTransactions, cardType, amount) + " р.")

}
// Данная функция определяет и возвращает комиссию в зависимости от типа карты
fun comissionType(previousTransactions: Int, cardType: String, amount: Int): Double {
    var comission = 0.0
    when (cardType) {
        "Vk Pay" -> comission = 0.0
        "MasterCard and Maestro" -> if (amount + previousTransactions !in 300..75000) comission = amount * 0.06 + 20
        "Visa and Mir" -> comission = amount * 0.075 + 20
    }
    when (cardType) {
        "Visa and Mir" -> if (comission < 35) comission = 35.0
    }
    return comission
}
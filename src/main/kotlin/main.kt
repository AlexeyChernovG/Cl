fun main() {

    val previousTransactions = 0

    val cardType = "Vk Pay"

    val amount = 100

// Данный условный оператор проверяет корректность выбранного банка, если банк неверный, программа сообщает об этом
    if (comissionType(previousTransactions, cardType, amount) >= 0.0) {
        println("Сумма перевода: " + amount + " р. ")
        println("Сумма комиссии: " + comissionType(previousTransactions, cardType, amount) + " р.") } else
            println("Такого банка нет")
}

// Данная функция определяет и возвращает комиссию в зависимости от типа карты
fun comissionType(previousTransactions: Int, cardType: String, amount: Int) = when (cardType) {
        "Vk Pay" -> 0.0
        "MasterCard" -> if (amount + previousTransactions !in 300..75000)
            amount * 0.06 + 20 else 0.0
        "Maestro" -> if (amount + previousTransactions !in 300..75000)
            amount * 0.06 + 20 else 0.0
        "Visa" -> if (amount > 200) amount * 0.075 + 20 else 35.0
        "Mir" -> if (amount > 200) amount * 0.075 + 20 else 35.0
        else -> -0.1
    }
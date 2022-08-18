import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun comissionTypeVkPay() {
        val previousTransactions = 0

        val cardType = "Vk Pay"

        val amount = 100

        val result = comissionType(previousTransactions, cardType, amount)

        assertEquals(0.0, result, 0.0001)

    }

    @Test
    fun comissionTypeMasterCardNotInRange() {
        val previousTransactions = 0

        val cardType = "MasterCard"

        val amount = 100

        val result = comissionType(previousTransactions, cardType, amount)

        assertEquals(26.0, result, 0.0001)

    }

    @Test
    fun comissionTypeMasterCardInRange() {
        val previousTransactions = 0

        val cardType = "MasterCard"

        val amount = 400

        val result = comissionType(previousTransactions, cardType, amount)

        assertEquals(0.0, result, 0.0001)

    }

    @Test
    fun comissionTypeMaestroNotInRange() {
        val previousTransactions = 0

        val cardType = "Maestro"

        val amount = 100

        val result = comissionType(previousTransactions, cardType, amount)

        assertEquals(26.0, result, 0.0001)

    }

    @Test
    fun comissionTypeMaestroInRange() {
        val previousTransactions = 0

        val cardType = "Maestro"

        val amount = 400

        val result = comissionType(previousTransactions, cardType, amount)

        assertEquals(0.0, result, 0.0001)

    }

    @Test
    fun comissionTypeVisaMoreThan200() {
        val previousTransactions = 0

        val cardType = "Visa"

        val amount = 400

        val result = comissionType(previousTransactions, cardType, amount)

        assertEquals(50.0, result, 0.0001)

    }

    @Test
    fun comissionTypeVisaLessThan200() {
        val previousTransactions = 0

        val cardType = "Visa"

        val amount = 100

        val result = comissionType(previousTransactions, cardType, amount)

        assertEquals(35.0, result, 0.0001)

    }

    @Test
    fun comissionTypeMirLessThan200() {
        val previousTransactions = 0

        val cardType = "Mir"

        val amount = 100

        val result = comissionType(previousTransactions, cardType, amount)

        assertEquals(35.0, result, 0.0001)

    }

    @Test
    fun comissionTypeMirMoreThan200() {
        val previousTransactions = 0

        val cardType = "Mir"

        val amount = 400

        val result = comissionType(previousTransactions, cardType, amount)

        assertEquals(50.0, result, 0.0001)

    }

    @Test
    fun comissionTypeWrongCard() {
        val previousTransactions = 0

        val cardType = "DoobieDoobieDoo"

        val amount = 400

        val result = comissionType(previousTransactions, cardType, amount)

        assertEquals(-0.1, result, 0.0001)

    }
}
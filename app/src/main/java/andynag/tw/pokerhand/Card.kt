package andynag.tw.pokerhand

data class Card(private val inputString: String) {
    fun getSuit(): SuitType {
        val suitString = inputString.substring(0, 1)
        return when (suitString) {
            "C" -> SuitType.Clubs
            "D" -> SuitType.Diamonds
            "H" -> SuitType.Hearts
            "S" -> SuitType.Spades
            else -> TODO("unknown suit type")
        }
    }

    fun getPoints(): Int {
        val pointsString = originalPoint()
        return pointsString.toIntOrNull() ?: when (pointsString) {
            "J" -> 11
            "Q" -> 12
            "K" -> 13
            "A" -> 1
            else -> TODO("unknown points")
        }
    }

    fun originalPoint() = inputString.substring(1)

    operator fun compareTo(card: Card): Int {
        return when {
            getPoints() == 1 && card.getPoints() != 1 -> -1
            getPoints() == 1 && card.getPoints() != 1 -> 1
            else -> getPoints().compareTo(card.getPoints())
        }
    }
}

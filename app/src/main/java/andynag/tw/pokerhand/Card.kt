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
        val pointsString = inputString.substring(1)
        return pointsString.toIntOrNull() ?: when (pointsString) {
            "J" -> 11
            "Q" -> 12
            "K" -> 13
            "A" -> 1
            else -> TODO("unknown points")
        }
    }
}

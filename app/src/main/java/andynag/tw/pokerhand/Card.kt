package andynag.tw.pokerhand

class Card(private val inputString: String) {
    fun getSuit(): SuitType {
        val suitString = inputString.substring(0, 1)
        return when (suitString) {
            "C" -> SuitType.Clubs
            "D" -> SuitType.Diamonds
            "H" -> SuitType.Hearts
            else -> TODO("unknown suit type")
        }
    }

    fun getPoints(): Int {
        val pointsString = inputString.substring(1)
        return when (pointsString) {
            "J" -> 11
            "Q" -> 12
            "K" -> 13
            else -> TODO("unknown points")
        }

    }
}

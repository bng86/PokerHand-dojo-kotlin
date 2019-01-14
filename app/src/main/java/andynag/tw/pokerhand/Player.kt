package andynag.tw.pokerhand

data class Player(val name: String, private val cardsString: String) {
    val hands: Hands
        get() {
            val cards = cardsString.split(",").map { Card(it) }
            return Hands(cards)
        }
}

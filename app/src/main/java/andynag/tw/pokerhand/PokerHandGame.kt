package andynag.tw.pokerhand

class PokerHandGame(private val player1: Player, private val player2: Player) {

    fun getWinner(): Winner {
        return Winner(player1.name, player1.hands.getHandCategory())
    }
}

data class Winner(val name: String, val handCategory: HandCategory) {

    override fun toString(): String {
        return "$name win, because of $handCategory"
    }
}

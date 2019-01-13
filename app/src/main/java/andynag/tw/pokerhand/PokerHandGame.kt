package andynag.tw.pokerhand

class PokerHandGame(private val player1: Player, private val player2: Player) {

    fun getWinner(): Winner {
        return when {
            player1.hands > player2.hands -> Winner(player1.name, player1.hands.getHandCategory())
            player1.hands < player2.hands -> Winner(player2.name, player2.hands.getHandCategory())
            else -> TODO("not implement")
        }
    }
}

data class Winner(val name: String, val handCategory: HandCategory) {

    override fun toString(): String {
        return "$name win, because of $handCategory"
    }
}

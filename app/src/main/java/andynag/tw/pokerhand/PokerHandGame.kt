package andynag.tw.pokerhand

class PokerHandGame(private val player1: Player, private val player2: Player) {

    fun getWinner(): Winner {
        return when {
            player1.hands > player2.hands -> Winner.Win(player1.name, player1.hands.getHandCategory())
            player1.hands < player2.hands -> Winner.Win(player2.name, player2.hands.getHandCategory())
            else -> Winner.Draw(player1.hands.getHandCategory())
        }
    }
}

sealed class Winner {
    data class Win(val name: String, val handCategory: HandCategory) : Winner() {
        override fun toString(): String {
            return "$name win, because of $handCategory"
        }
    }

    data class Draw(val handCategory: HandCategory) : Winner() {
        override fun toString(): String {
            return "Draw, because of $handCategory"
        }
    }
}

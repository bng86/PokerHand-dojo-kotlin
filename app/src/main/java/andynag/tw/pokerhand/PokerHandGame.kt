package andynag.tw.pokerhand

class PokerHandGame(private val player1: Player, private val player2: Player) {

    fun getWinner(): Winner {
        return when {
            player1.hands > player2.hands -> Winner.HandsCategory(player1.name, player1.hands.getHandCategory())
            player1.hands < player2.hands -> Winner.HandsCategory(player2.name, player2.hands.getHandCategory())
            else -> {
                when(player1.hands.getHandCategory()){
                    HandCategory.StraightFlush -> StraightFlushComparer(player1, player2).getWinner()
                    else -> Winner.Draw(player1.hands.getHandCategory())
                }
            }
        }
    }
}

sealed class Winner {
    data class HandsCategory(val name: String, val handCategory: HandCategory) : Winner() {
        override fun toString(): String {
            return "$name win, because of $handCategory"
        }
    }

    data class Draw(val handCategory: HandCategory) : Winner() {
        override fun toString(): String {
            return "Draw, because of $handCategory"
        }
    }

    data class KeyCard(
        val name: String,
        val handCategory: HandCategory,
        val originalPoint: String) : Winner(){
        override fun toString(): String {
            return "$name win, because of $handCategory, key card: $originalPoint"
        }
    }
}

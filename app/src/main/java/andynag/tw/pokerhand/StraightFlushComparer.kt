package andynag.tw.pokerhand

class StraightFlushComparer(private val player1: Player, private val player2: Player) : HandsCategoryComparer {
    override fun getWinner(): Winner {
        val player1KeyCard = player1.hands.cards.sortedByDescending { it.getPoints() }[0]
        val player2KeyCard = player2.hands.cards.sortedByDescending { it.getPoints() }[0]
        return when {
            player1KeyCard > player2KeyCard -> {
                Winner.KeyCard(player1.name, player1.hands.getHandCategory(), player1KeyCard.originalPoint())
            }
            player1KeyCard < player2KeyCard -> {
                Winner.KeyCard(player2.name, player2.hands.getHandCategory(), player2KeyCard.originalPoint())
            }
            else -> Winner.Draw(player1.hands.getHandCategory())
        }
    }
}

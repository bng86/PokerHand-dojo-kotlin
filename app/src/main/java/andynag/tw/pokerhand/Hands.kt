package andynag.tw.pokerhand

class Hands(val cards: List<Card>) {

    fun getHandCategory(): HandCategory {
        if (isStraightFlush(cards)) {
            return HandCategory.StraightFlush
        } else {
            TODO("not implement")
        }
    }

    private fun isStraightFlush(cards: List<Card>) = isStraight(cards) && isFlush(cards)

    private fun isFlush(cards: List<Card>) = cards.distinctBy { it.getSuit() }.count() == 1

    private fun isStraight(cards: List<Card>): Boolean {
        val allDifference = cards.distinctBy { it.getPoints() }.count() == 5
        return if (allDifference) {
            val max = cards.map { it.getPoints() }.max()!!
            val min = cards.map { it.getPoints() }.min()!!
            max - min == 4
        } else {
            false
        }
    }
}

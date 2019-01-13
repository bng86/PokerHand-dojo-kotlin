package andynag.tw.pokerhand

class Hands(val cards: List<Card>) {
    fun getHandCategory(): HandCategory {
        val allDifference = cards.distinctBy { it.getPoints() }.count() == 5
        val isStraight = if (allDifference) {
            val max = cards.map { it.getPoints() }.max()!!
            val min = cards.map { it.getPoints() }.min()!!
            max - min == 4
        } else {
            false
        }
        val isFlush = cards.distinctBy { it.getSuit() }.count() == 1
        if (isStraight && isFlush) {
            return HandCategory.StraightFlush
        } else {
            TODO("not implement")
        }
    }
}

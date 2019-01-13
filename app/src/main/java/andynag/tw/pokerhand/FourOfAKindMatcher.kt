package andynag.tw.pokerhand

class FourOfAKindMatcher {
    fun isMatch(cards: List<Card>): Boolean {
        return cards.distinctBy { it.getSuit() }.count() == 4
    }
}

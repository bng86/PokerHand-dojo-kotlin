package andynag.tw.pokerhand

class Hands {

    private val straightFlushMatcher = StraightFlushMatcher()
    private val fourOfAKindMatcher = FourOfAKindMatcher()

    fun getHandCategory(cards: List<Card>): HandCategory {
        if (straightFlushMatcher.isMatch(cards)) {
            return HandCategory.StraightFlush
        } else if (fourOfAKindMatcher.isMatch(cards)) {
            return HandCategory.FourOfAKind
        } else {
            TODO("not implement")
        }
    }
}

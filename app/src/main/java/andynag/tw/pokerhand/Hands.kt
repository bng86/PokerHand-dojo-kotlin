package andynag.tw.pokerhand

class Hands {

    private val categoryMatcher = StraightFlushMatcher()

    fun getHandCategory(cards: List<Card>): HandCategory {
        if (categoryMatcher.isMatch(cards)) {
            return HandCategory.StraightFlush
        } else {
            TODO("not implement")
        }
    }
}

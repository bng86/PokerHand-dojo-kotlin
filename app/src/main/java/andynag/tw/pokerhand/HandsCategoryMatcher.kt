package andynag.tw.pokerhand

interface HandsCategoryMatcher {
    fun isMatch(cards: List<Card>): Boolean
    fun getHandsCategory(): HandCategory
}
package andynag.tw.pokerhand.matcher

import andynag.tw.pokerhand.Card
import andynag.tw.pokerhand.HandCategory

interface HandsCategoryMatcher {
    fun isMatch(cards: List<Card>): Boolean
    fun getHandsCategory(): HandCategory
}
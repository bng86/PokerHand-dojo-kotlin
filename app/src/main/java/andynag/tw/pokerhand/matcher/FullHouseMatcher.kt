package andynag.tw.pokerhand.matcher

import andynag.tw.pokerhand.Card
import andynag.tw.pokerhand.HandCategory

class FullHouseMatcher : HandsCategoryMatcher {

    override fun isMatch(cards: List<Card>): Boolean {
        val groupPoint = cards.groupBy { it.getPoints() }
        return groupPoint.size == 2 && groupPoint.any { it.value.size == 3 }
    }

    override fun getHandsCategory(): HandCategory {
        return HandCategory.FullHouse
    }

}

package andynag.tw.pokerhand.matcher

import andynag.tw.pokerhand.Card
import andynag.tw.pokerhand.HandCategory

class ThreeOfAKindMatcher : HandsCategoryMatcher {

    override fun isMatch(cards: List<Card>): Boolean {
        return cards.groupBy { it.getPoints() }.any { it.value.size == 3 }
    }

    override fun getHandsCategory(): HandCategory {
        return HandCategory.ThreeOfAKind
    }

}

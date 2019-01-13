package andynag.tw.pokerhand.matcher

import andynag.tw.pokerhand.Card
import andynag.tw.pokerhand.HandCategory

class OnePairMatcher : HandsCategoryMatcher {

    override fun isMatch(cards: List<Card>): Boolean {
        return cards.groupBy { it.getPoints() }.size == 4
    }

    override fun getHandsCategory(): HandCategory {
        return HandCategory.OnePair
    }

}

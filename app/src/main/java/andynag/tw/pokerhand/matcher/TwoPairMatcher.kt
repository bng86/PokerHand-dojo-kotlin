package andynag.tw.pokerhand.matcher

import andynag.tw.pokerhand.Card
import andynag.tw.pokerhand.HandCategory

class TwoPairMatcher : HandsCategoryMatcher {

    override fun isMatch(cards: List<Card>): Boolean {
        return cards.groupBy { it.getPoints() }.size == 3
    }

    override fun getHandsCategory(): HandCategory {
        return HandCategory.TwoPair
    }

}

package andynag.tw.pokerhand.matcher

import andynag.tw.pokerhand.Card
import andynag.tw.pokerhand.HandCategory

class FlushMatcher : HandsCategoryMatcher {

    override fun isMatch(cards: List<Card>): Boolean {
        return cards.distinctBy { it.getSuit() }.count() == 1
    }

    override fun getHandsCategory(): HandCategory {
        return HandCategory.Flush
    }

}

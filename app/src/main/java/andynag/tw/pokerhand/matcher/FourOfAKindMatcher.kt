package andynag.tw.pokerhand.matcher

import andynag.tw.pokerhand.Card
import andynag.tw.pokerhand.HandCategory

class FourOfAKindMatcher : HandsCategoryMatcher {

    override fun getHandsCategory(): HandCategory {
        return HandCategory.FourOfAKind
    }

    override fun isMatch(cards: List<Card>): Boolean {
        return cards.distinctBy { it.getSuit() }.count() == 4
    }
}

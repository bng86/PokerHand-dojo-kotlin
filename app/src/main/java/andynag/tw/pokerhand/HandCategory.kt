package andynag.tw.pokerhand

enum class HandCategory(val value: Int) {
    StraightFlush(9),
    FourOfAKind(8),
    FullHouse(7),
    Flush(6),
    Straight(5),
    ThreeOfAKind(4),
    TwoPair(3),
    OnePair(2),
    HighCard(1)
}

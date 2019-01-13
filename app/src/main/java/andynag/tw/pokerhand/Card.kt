package andynag.tw.pokerhand

class Card(inputString: String) {
    fun getSuit(): SuitType {
        return SuitType.Clubs
    }

    fun getPoints(): Int {
        return 11
    }
}

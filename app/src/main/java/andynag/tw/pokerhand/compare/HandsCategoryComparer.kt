package andynag.tw.pokerhand.compare

import andynag.tw.pokerhand.Winner

interface HandsCategoryComparer {
    fun getWinner(): Winner
}
package andynag.tw.pokerhand

import org.junit.Assert
import org.junit.Test

class PlayerTest {

    @Test
    fun test_build_player() {
        val player = Player("Andy", "CA,C2,C3,C4,C5")
        Assert.assertEquals("Andy", player.name)
        Assert.assertEquals(
            Hands(
                listOf(
                    Card("CA"),
                    Card("C2"),
                    Card("C3"),
                    Card("C4"),
                    Card("C5")
                )
            ), player.hands
        )
    }

}
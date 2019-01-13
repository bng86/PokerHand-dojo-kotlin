package andynag.tw.pokerhand

import org.junit.Assert
import org.junit.Test

class PlayerTest {

    @Test
    fun test_build_player() {
        val hands = Hands(emptyList())
        val player = Player("Andy", hands)
        Assert.assertEquals("Andy", player.name)
        Assert.assertEquals(Hands(emptyList()), player.hands)
    }

}
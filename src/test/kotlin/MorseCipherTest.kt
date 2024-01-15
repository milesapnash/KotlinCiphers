import ciphers.morseDecrypt
import ciphers.morseEncrypt
import kotlin.test.Test
import kotlin.test.assertEquals

internal class MorseCipherTest {

    @Test
    fun testMorseEncrypt() {
        val inputText = "HELLO"
        val expectedOutput = ".... . .-.. .-.. --- "

        assertEquals(expectedOutput, morseEncrypt(inputText))
    }

    @Test
    fun testMorseDecrypt() {
        val morseCode = ".-- --- .-. .-.. -.."
        val expectedOutput = "WORLD"

        assertEquals(expectedOutput, morseDecrypt(morseCode))
    }

    @Test
    fun testMorseCipherCoherency() {
        val inputText = "MORSE CODE"

        assertEquals(inputText, morseDecrypt(morseEncrypt(inputText)))
    }
}
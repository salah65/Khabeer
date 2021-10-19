import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun `isAwesome() with Awesome odd Number then return true`() {
        assertTrue(7.isAwesome())
    }
    @Test
    fun `isAwesome() with Awesome even Number then return true`() {
        assertTrue(2192.isAwesome())
    }
    @Test
    fun `isAwesome() with Non-Awesome even Number then return false`() {
        assertFalse(4096.isAwesome())
    }

    @Test
    fun `isPalindrome() with Non-Palindrome  Number then return false`() {
        assertFalse(256.isPalindrome())
    }
    @Test
    fun `isPalindrome() with Palindrome  Number then return false`() {
        assertFalse(121212.isPalindrome())
    }
    @Test
    fun `areRotation() with Rotation Strings then return true`() {
        assertTrue(areRotation("abcd","cdab"))
    }
    @Test
    fun `areRotation() with Non-Rotation Strings then return false`() {
        assertFalse(areRotation("ABCD","BACD"))
    }



}
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class WallServiceTest {
    private lateinit var thirdPost: Post
    private lateinit var secondPost: Post
    private lateinit var firstPost: Post

    @Before
    fun clearBeforeTest() {
        WallService.clear()
        firstPost = Post(id = 124, ownerId = 23421, date = 1716448325, text = "Первый пост")
        secondPost = Post(id = 125, ownerId = 23421, date = 1716448325, text = "Второй пост")
        thirdPost = Post(id = 126, ownerId = 23421, date = 1716448325, text = "Третий пост")
    }

    @Test
    fun shouldNextIdChanges_whenPostAdded() {
        WallService.add(firstPost)
        val actual = WallService.add(secondPost).id
        assertEquals(1, actual)
    }

    @Test
    fun shouldReturnTrue_whenExistingPostAdded() {
        WallService.add(firstPost)
        WallService.add(secondPost)

        val actual = WallService.update(secondPost.copy(id = 1, text="Измененный текст"))
        assertTrue(actual)
    }

    @Test
    fun shouldReturnFalse_whenNonExistingPostAdded() {
        WallService.add(firstPost)
        WallService.add(secondPost)

        val actual = WallService.update(thirdPost)
        assertFalse(actual)
    }

}
data class Post (
    val id: Int,
    val ownerId: Int,
    val date: Int,
    val text: String,
    val friendsOnly: Boolean = false,
    val comments: Comments = Comments(),
    val likes: Likes = Likes(),
    val postType: String = "post",
    val geo: Geo = Geo(),
    val isFavorite: Boolean = false,
)
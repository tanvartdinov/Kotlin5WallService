data class Post (
    val id: Int,
    val ownerId: Int,
    val date: Int,
    val text: String,
    val friendsOnly: Boolean,
    val comments: Comments,
    val likes: Likes,
    val postType: String,
    val geo: Geo,
    val isFavorite: Boolean,
)
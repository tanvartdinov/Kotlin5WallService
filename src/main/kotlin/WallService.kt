object WallService {
    private var posts = emptyArray<Post>()
    private var nextPostId = 0

    fun add(post: Post): Post {
        posts += post.copy(id = nextPostId)
        nextPostId++
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, currentPost) in posts.withIndex()) {
            if (post.id == currentPost.id) {
                posts[index] = post
                return true
            }
        }
        return false
    }
}
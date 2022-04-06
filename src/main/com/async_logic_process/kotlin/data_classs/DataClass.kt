package data_classs

fun main(){
    val blogList = arrayListOf<Blog>()
    blogList.add(Blog("Hello","Nice Content", 10))
    blogList.add(blogList[0].copy(title = "New Title", numberOfReaders = 20))
    blogList.add(blogList[1].copy(title = "WOOW", numberOfReaders = 5000))

    println(blogList)
}

data class Blog(
    var title: String,
    var content: String,
    var numberOfReaders: Int
)
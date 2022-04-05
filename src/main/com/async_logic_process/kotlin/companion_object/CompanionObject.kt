package companion_object

fun main(){
    val myBook = Book(Book.getEditorName())
    println(myBook.editor.editorName)
}

class Book(val editor:Editor) {

    companion object{

        fun getEditorName() = Editor("James")
    }
}

class Editor(val editorName:String){

}
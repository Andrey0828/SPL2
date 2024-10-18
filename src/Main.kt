fun main() {
    var student: Student? = null

    val unit = student?.let { st ->
        st.hi()
        st.bye()
        st.name = "Masha"
    }
    println(student?.name)
    val student2 = student?.apply {
        hi()
        bye()
        name = "LolKek"
    }
    println(student)
    println(student2)
    val count = Student().run {
        hi()
        bye()
        countOfDebts = 15
        countOfDebts
    }
    println(count)


    val str = with(Student()) {
        hi()
        bye()
        name = "Pasha"
        name
    }

    val student3 = Student().also { st ->
        st.hi()
        st.bye()
        st.countOfDebts = 5
    }
}
package treecode


// adopted and refactored from https://www.geeksforgeeks.org/print-n-ary-tree-graphically/
fun TreeNode.print(prefix: String = "", indent: String = "", trailingIndent: String = "") {
    kotlin.io.print(indent)
    kotlin.io.print(prefix)
    kotlin.io.println(name)

    val iterator = children.iterator()
    val newIndent = indent + trailingIndent
    while (iterator.hasNext()) {
        val child = iterator.next()
        child.print("+-- ", newIndent, if (iterator.hasNext()) "|    " else "    ")
    }

}
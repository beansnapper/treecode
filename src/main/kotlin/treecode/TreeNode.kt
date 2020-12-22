package treecode

class TreeNode(val parentId: Int?, val nodeId: Int?, val name: String) {
    val children = mutableListOf<TreeNode>()

    override fun toString(): String = name
}

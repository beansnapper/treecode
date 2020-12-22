package treecode

class TreeBuilder() {
    private         fun String.toId() : Int? = when(this) {
            "null" -> null
            else -> toInt()
        }

    var root : TreeNode? = null

    constructor(csvRow : String) : this() {
        // build node map
        val nodeMap = csvRow.split("|").map { nodeString ->
            // null,0,grandpa
            val args = nodeString.split(",")
            assert(args.size == 3) { "each node is expected to have 3 parameters" }
            TreeNode(args[0].toId(), args[1].toId(), args[2])
        }.map { it.nodeId to it }.toMap()

        nodeMap.values.forEach { node ->
            when (node.parentId) {
                null -> {
                    if (root != null) throw Exception("more than one root node: ${root!!.name} and ${node.name}")
                    root = node
                }
                else -> {
                    val parent = nodeMap[node.parentId]
                        ?: throw Exception("No parent found for Node ${node.name} with parent id ${node.parentId}")
                    parent.children.add(node)
                }
            }
        }
    }

    fun build(): TreeNode {
        return root ?: throw Exception("No Tree was built")
    }

}
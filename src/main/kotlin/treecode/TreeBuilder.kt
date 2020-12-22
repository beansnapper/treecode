package treecode

class TreeBuilder(csvRow : String) {

    var root : TreeNode? = null

    fun build(): TreeNode {
        return root ?: throw Exception("No Tree was built")
    }


}
package treecode

import java.io.File

object CvsFileReader {

    fun main(args: Array<String>) {
        for (arg in args) {
            var first = true
            File(arg).forEachLine {
                if (first && it.startsWith("parent_id")) {
                    // discard header
                } else {
                    TreeBuilder(it).build().print()
                }
                first = false
            }
        }
    }

}
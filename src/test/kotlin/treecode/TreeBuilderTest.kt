package treecode

import com.sun.tools.jdeprscan.CSV
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldNotBe
import jdk.internal.org.jline.utils.Display

class TreeBuilderTest : StringSpec({

//    The given string has pipe delimited nodes that represent family members in a family tree. Each node is a CSV with the values being "parent_id, node_id, node_name". Write a method that takes an input string and return a single result that represents the data as a hierarchy (root, children, siblings, etc).
//    Sample input: "null,0,grandpa|0,1,son|0,2,daugther|1,3,grandkid|1,4,grandkid|2,5,grandkid|5,6,greatgrandkid"
//    • Solve it in any language that you prefer
//    • Display the hierarchical result any way you prefer (as long as the parent/child connections are clear)

    "build the sample" {
        val builder = TreeBuilder("null,0,grandpa|0,1,son|0,2,daugther|1,3,grandkid|1,4,grandkid|2,5,grandkid|5,6,greatgrandkid")
        val root = builder.build()
        root shouldNotBe null
    }

})
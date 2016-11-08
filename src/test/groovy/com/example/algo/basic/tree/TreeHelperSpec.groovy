package com.example.algo.basic.tree

import spock.lang.Specification
import spock.lang.Unroll

class TreeHelperSpec extends Specification {

    @Unroll
    def "returns #input => preorder: #preorder"() {
        setup:
        def cut = new TreeHelper()
        def tree = cut.init(input)
        cut.preorder(tree)

        expect:
        cut.result == preorder

        where:
        input          | preorder
        [10,5,15,2,7]  | [10,5,2,7,15]
    }

    @Unroll
    def "returns #input => postorder: #postorder"() {
        setup:
        def cut = new TreeHelper()
        def tree = cut.init(input)
        cut.postorder(tree)

        expect:
        cut.result == postorder

        where:
        input          | postorder
        [10,5,15,2,7]  | [2,7,5,15,10]
    }

    @Unroll
    def "returns #input => inorder: #inorder"() {
        setup:
        def cut = new TreeHelper()
        def tree = cut.init(input)
        cut.inorder(tree)

        expect:
        cut.result == inorder

        where:
        input          | inorder
        [10,5,15,2,7]  | [2,5,7,10,15]
    }
}

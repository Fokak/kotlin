// ERROR: No value passed for parameter 'p'

fun foo(s: String, b: Boolean, p: Int){}

fun bar() {
    <caret>foo("", true)
}
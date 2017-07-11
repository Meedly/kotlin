class Foo {
    class Bar {
        private val baz = { }
    }

    fun f() = Bar().baz()
}
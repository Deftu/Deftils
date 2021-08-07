package xyz.matthewtgm.mango.dsl

import xyz.matthewtgm.mango.IO
import java.io.InputStream
import java.nio.charset.Charset

fun InputStream.stringify(charset: Charset): String {
    return IO.toString(this, charset)
}
fun InputStream.stringify(): String {
    return stringify(Charset.defaultCharset())
}
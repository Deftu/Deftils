package xyz.matthewtgm.mango.dsl

import xyz.matthewtgm.mango.IOHelper
import java.io.InputStream
import java.nio.charset.Charset

fun InputStream.stringify(charset: Charset): String {
    return IOHelper.toString(this, charset)
}
fun InputStream.stringify(): String {
    return stringify(Charset.defaultCharset())
}
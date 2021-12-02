package xyz.deftu.deftils.dsl

import xyz.deftu.deftils.IO
import java.io.InputStream
import java.nio.charset.Charset

fun InputStream.stringify(charset: Charset): String =
    IO.toString(this, charset)
fun InputStream.stringify(): String =
    stringify(Charset.defaultCharset())
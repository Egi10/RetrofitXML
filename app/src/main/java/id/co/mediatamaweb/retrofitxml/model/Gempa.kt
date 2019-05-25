package id.co.mediatamaweb.retrofitxml.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "Gempa", strict = false)
data class Gempa @JvmOverloads constructor (
    @field:Element(name = "Tanggal")
    @param:Element(name = "Tanggal")
    val Tanggal: String? = null
)
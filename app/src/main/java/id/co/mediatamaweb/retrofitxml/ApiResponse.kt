package id.co.mediatamaweb.retrofitxml

import id.co.mediatamaweb.retrofitxml.model.Gempa
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "Infotsunami", strict = false)
data class ApiResponse @JvmOverloads constructor (
    @field:Element(name = "Gempa")
    @param:Element(name = "Gempa")
    val Gempa: Gempa? = null
)
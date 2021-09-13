import react.dom.render
import kotlinx.browser.document
import kotlinx.browser.window

fun main() {
    window.onload = {
        document.bgColor = "#3399ff"
        render(document.getElementById("root")) {

            child(Welcome::class) {
                attrs {
                    name = "World"
                }
            }
        }
    }
}

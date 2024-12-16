import services.KeygenService

fun main() {
    val keypair = KeygenService().generateKeypair()
    println("Generated keypair: $keypair")
}

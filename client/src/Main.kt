import services.CryptographyService

fun main() {
    val keypair = CryptographyService().generateKeypair()
    println("Generated keypair: $keypair")
}

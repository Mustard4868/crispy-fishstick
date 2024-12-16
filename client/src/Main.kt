import services.KeygenService
import java.util.Base64

fun main() {
    val keygenService = KeygenService()
    val keyPair = keygenService.generateKeyPair()
    val publicKeyString = Base64.getEncoder().encodeToString(keyPair.public.encoded)
    val privateKeyString = Base64.getEncoder().encodeToString(keyPair.private.encoded)
    println("Public key: $publicKeyString")
    println("Private key: $privateKeyString")
}
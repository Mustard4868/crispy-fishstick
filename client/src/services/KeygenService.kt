package services

import java.security.SecureRandom
import java.util.Base64

class KeygenService {
    fun generateKeypair(): Map<String, String> {
        val length = 2048
        val random = SecureRandom()
        val keypair = mapOf(
            "public" to Base64.getEncoder().encodeToString(random.generateSeed(length)),
            "private" to Base64.getEncoder().encodeToString(random.generateSeed(length))
        )
        return keypair
    }
}
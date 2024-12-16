package services

import java.security.SecureRandom
import java.util.Base64

class CryptographyService {
    fun generateKeypair(): Map<String, String> {
        val keylength = 2048
        val random = SecureRandom()
        val keypair = mapOf(
            "public" to Base64.getEncoder().encodeToString(random.generateSeed(keylength)),
            "private" to Base64.getEncoder().encodeToString(random.generateSeed(keylength))
        )
        return keypair
    }
}
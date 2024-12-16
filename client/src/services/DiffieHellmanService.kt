package services

class DiffieHellmanService {
    fun calculateSharedSecret(publicKey: String, privateKey: String, receivedKey: String): String {
        val keygenService = KeygenService()
        val keyPair1 = keygenService.generateKeypair()
        val keyPair2 = keygenService.generateKeypair() //TODO: fetch keyPair from the other party
        return "sharedSecret"
    }
}
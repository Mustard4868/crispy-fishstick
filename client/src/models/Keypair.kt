package models

import java.security.PrivateKey
import java.security.PublicKey

class Keypair(
    val publicKey: PublicKey,
    val privateKey: PrivateKey
)
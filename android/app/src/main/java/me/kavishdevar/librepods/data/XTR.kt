package me.kavishdevar.librepods.data
object XTRTranslator {
    var realBattery: Int = 80
    fun toApplePacket(): ByteArray {
        return byteArrayOf(0x4C, 0x00, 0x07, 0x19, 0x01, realBattery.toByte(), realBattery.toByte(), 0x55, 0x00)
    }
}

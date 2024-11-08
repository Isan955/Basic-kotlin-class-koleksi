package trpl.nim234311045.tracking_app

// Data class Event setelah refactoring untuk menggunakan Daypart sebagai tipe pemisahan hari
data class Event(
    val title: String,
    val description: String? = null,  // Memberikan nilai default null
    val daypart: Daypart,
    val durationInMinutes: Int
)

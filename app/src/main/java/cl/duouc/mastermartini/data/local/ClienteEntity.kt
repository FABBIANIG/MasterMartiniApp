package cl.duouc.mastermartini.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "clientes")
data class ClienteEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val rut: String,
    val nombreCompleto: String,
    val telefono: String,
    val correo: String
)
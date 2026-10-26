package cl.duouc.mastermartini.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface MasterMartiniDao {

    // --- OPERACIONES PARA RECETAS ---
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarReceta(receta: RecetaEntity)

    @Query("SELECT * FROM recetas")
    fun obtenerTodasLasRecetas(): Flow<List<RecetaEntity>>

    // --- OPERACIONES PARA CLIENTES ---
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarCliente(cliente: ClienteEntity)

    @Query("SELECT * FROM clientes")
    fun obtenerTodosLosClientes(): Flow<List<ClienteEntity>>
}
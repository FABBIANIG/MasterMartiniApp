package cl.duouc.mastermartini.repository

import cl.duouc.mastermartini.data.local.ClienteEntity
import cl.duouc.mastermartini.data.local.MasterMartiniDao
import cl.duouc.mastermartini.data.local.RecetaEntity
import kotlinx.coroutines.flow.Flow

class MasterMartiniRepository(private val dao: MasterMartiniDao) {

    // --- RECETAS ---
    val todasLasRecetas: Flow<List<RecetaEntity>> = dao.obtenerTodasLasRecetas()

    suspend fun insertarReceta(receta: RecetaEntity) {
        dao.insertarReceta(receta)
    }

    // --- CLIENTES ---
    val todosLosClientes: Flow<List<ClienteEntity>> = dao.obtenerTodosLosClientes()

    suspend fun insertarCliente(cliente: ClienteEntity) {
        dao.insertarCliente(cliente)
    }
}
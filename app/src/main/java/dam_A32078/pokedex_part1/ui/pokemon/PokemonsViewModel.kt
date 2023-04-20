package dam_A32078.pokedex_part1.ui.pokemon

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import dam_A32078.pokedex_part1.data.PokemonDomain
import dam_A32078.pokedex_part1.data.model.Pokemon
import dam_A32078.pokedex_part1.data.model.PokemonRegion

class PokemonsViewModel : ViewModel() {

    private val pokemonDomain = PokemonDomain()

    private lateinit var listPokemons: LiveData<List<Pokemon>>

    fun getListPokemonsByRegion(region: PokemonRegion): LiveData<List<Pokemon>>{
        listPokemons = pokemonDomain.getPokemonsByRegion(region)
        return listPokemons
    }
}
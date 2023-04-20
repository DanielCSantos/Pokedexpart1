package dam_A32078.pokedex_part1.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import dam_A32078.pokedex_part1.data.mocks.PokemonMockData
import dam_A32078.pokedex_part1.data.model.Pokemon
import dam_A32078.pokedex_part1.data.model.PokemonRegion

class PokemonDomain {
    fun getAllRegions() : LiveData<List<PokemonRegion>>
    {
        return MutableLiveData<List<PokemonRegion>>(PokemonMockData.regions)
    }
    fun getAllPokemons(): LiveData<List<Pokemon>>
    {
        return MutableLiveData<List<Pokemon>>(PokemonMockData.pokemons)
    }
    fun getPokemonsByRegion(region: PokemonRegion): LiveData<List<Pokemon>>
    {
        return MutableLiveData<List<Pokemon>>(PokemonMockData.pokemons.filter { it.
        region == region })
    }
    fun getPokemonTypes(): List<PokemonType>
    {
        return ArrayList<PokemonType>(PokemonMockData.pokemonTypeMock)
    }
    fun getPokemonDetail(pokemon: Pokemon): LiveData<PokemonDetail>
    {
        return MutableLiveData(PokemonMockData.pokemonDetail.find { it.pokemon == pokemon })
    }

}
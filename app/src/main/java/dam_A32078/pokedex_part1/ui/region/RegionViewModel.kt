package dam_A32078.pokedex_part1.ui.region

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import dam_A32078.pokedex_part1.data.PokemonDomain
import dam_A32078.pokedex_part1.data.model.PokemonRegion

class RegionViewModel : ViewModel() {

    private val _pokemonDomain = PokemonDomain()

    fun getRegions(): LiveData<List<PokemonRegion>>{
        return _pokemonDomain.getAllRegions()
    }
}
package dam_A32078.pokedex_part1.data

import dam_A32078.pokedex_part1.data.model.Pokemon

data class PokemonDetail(var pokemon: Pokemon,
                         var description: String,
                         var types:List<PokemonType>?,
                         var weight:Double?,
                         var height: Double?,
                         var stats: PokemonStats?,
                         var evolution: List<PokemonEvolution>?)

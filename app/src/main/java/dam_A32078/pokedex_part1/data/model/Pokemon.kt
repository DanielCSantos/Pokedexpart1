package dam_A32078.pokedex_part1.data.model

import dam_A32078.pokedex_part1.data.PokemonType

data class Pokemon(var id: Int,
                   var name:String,
                   var imageUrl: String,
                   var region: PokemonRegion?,
                   var types: List<PokemonType>)

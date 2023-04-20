package dam_A32078.pokedex_part1.data

import dam_A32078.pokedex_part1.data.model.Pokemon

data class PokemonEvolution(var id: Int,
                            var pokemon: Pokemon,
                            var isBaby: Boolean,
                            var minLevel: Int?,
                            var item: String?,
                            var minHappiness: Int?,
                            var time: String?)

package dam_A32078.pokedex_part1.data.model

import androidx.annotation.DrawableRes

data class PokemonRegion(
    var id:Int,
    var name: String,
    @DrawableRes val bg: Int,
    @DrawableRes val starters: Int
)

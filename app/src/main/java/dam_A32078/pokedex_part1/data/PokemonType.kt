package dam_A32078.pokedex_part1.data

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes

data class PokemonType(var id: Int,
                       var name:String,
                       @DrawableRes val icon: Int,
                       @ColorRes val color: Int)

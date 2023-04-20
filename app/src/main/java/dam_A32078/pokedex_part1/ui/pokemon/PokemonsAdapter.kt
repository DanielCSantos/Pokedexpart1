package dam_A32078.pokedex_part1.ui.pokemon

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dam_A32078.pokedex_part1.R
import dam_A32078.pokedex_part1.data.model.Pokemon
import dam_A32078.pokedex_part1.databinding.ItemPokemonBinding
import dam_A32078.pokedex_part1.ui.events.OnItemClickedListener

class PokemonsAdapter(private val pokemonsList: List<Pokemon>,
                      private val itemClickedListener: OnItemClickedListener? = null,
                      private val context: Context):
    RecyclerView.Adapter<PokemonsAdapter.ViewHolder>() {


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        private val viewBinding = ItemPokemonBinding.bind(itemView)

        fun bindView(pokemonItem: Pokemon, itemClickedListener: OnItemClickedListener?){

            viewBinding.pokemon = pokemonItem

            itemView.setOnClickListener{
                itemClickedListener?.invoke(pokemonItem)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_pokemon, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = pokemonsList[position]
        holder.bindView(item, itemClickedListener)
    }

    override fun getItemCount(): Int {
        return pokemonsList.size
    }


}
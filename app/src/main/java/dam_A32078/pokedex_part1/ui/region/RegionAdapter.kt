package dam_A32078.pokedex_part1.ui.region

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import dam_A32078.pokedex_part1.R
import dam_A32078.pokedex_part1.data.model.PokemonRegion
import dam_A32078.pokedex_part1.databinding.ItemRegionBinding
import dam_A32078.pokedex_part1.ui.events.OnItemClickedListener

class RegionAdapter(private val pkRegionList: List<PokemonRegion>,
                    private val itemClickedListener: OnItemClickedListener? = null,
                    private val context: Context):
    RecyclerView.Adapter<RegionAdapter.ViewHolder>() {


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        private val viewBinding = ItemRegionBinding.bind(itemView)

        fun bindView(regionItem: PokemonRegion, itemClickedListener: OnItemClickedListener?)
        {
//            viewBinding.regionNameTextView.text = regionItem.name
//            viewBinding.regionIdTextView.text = "${regionItem.id} ${R.string.pk_generations}".uppercase()
//
//            viewBinding.regionBgImage.setImageDrawable(ContextCompat.getDrawable(
//                itemView.context,regionItem.bg))
//
//            viewBinding.regionStartersImageView.setImageDrawable(
//                ContextCompat.getDrawable(itemView.context, regionItem.starters))


            viewBinding.region = regionItem
            itemView.setOnClickListener{
//                Toast.makeText(itemView.context, String.format("Click in %s Region",
//                    regionItem.name), Toast.LENGTH_LONG).show()
                itemClickedListener?.invoke(regionItem)
            };

        }

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_region, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pkRegionList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = pkRegionList[position]
        holder.bindView(item, itemClickedListener)
    }

}



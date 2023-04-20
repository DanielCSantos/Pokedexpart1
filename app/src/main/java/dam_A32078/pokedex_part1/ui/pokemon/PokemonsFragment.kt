package dam_A32078.pokedex_part1.ui.pokemon

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import dam_A32078.pokedex_part1.R
import dam_A32078.pokedex_part1.data.model.Pokemon
import dam_A32078.pokedex_part1.data.model.PokemonRegion
import dam_A32078.pokedex_part1.databinding.FragmentPokemonsBinding

class PokemonsFragment : Fragment() {

    private var _binding: FragmentPokemonsBinding? = null
    private val viewModel: PokemonsViewModel by viewModels()

    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPokemonsBinding.inflate(inflater, container, false)
        val root: View = binding.root



        return inflater.inflate(R.layout.fragment_pokemons, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val region = checkNotNull(arguments?.getParcelable("region", PokemonRegion:: class.java))

        viewModel.getListPokemonsByRegion(region).observe(viewLifecycleOwner, Observer {
            val pokemons: List<Pokemon> = it
            binding.pokemonsRecyclerView.adapter = PokemonsAdapter(pokemons, itemClickedListener = { pokemon->

                val bundle = bundleOf(
                    "pokemon" to pokemon
                )
                findNavController().navigate(
                    R.id.action_nav_regions_to_pokemonsFragment,
                    bundle,
                    null
                )
            }, view.context)
        })


    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}
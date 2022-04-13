package store.dide.nfcmaker.ui.views.lists

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import store.dide.nfcmaker.databinding.FragmentCreateNewListBinding
import store.dide.nfcmaker.ui.viewmodels.lists.CreateListViewModel

class CreateListFragment : Fragment() {

    private var _binding: FragmentCreateNewListBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: CreateListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreateNewListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(CreateListViewModel::class.java)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
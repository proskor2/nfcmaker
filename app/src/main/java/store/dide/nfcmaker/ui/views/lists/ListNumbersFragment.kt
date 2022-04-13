package store.dide.nfcmaker.ui.views.lists

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import store.dide.nfcmaker.databinding.FragmentListNumbersBinding
import store.dide.nfcmaker.ui.viewmodels.lists.ListNumbersViewModel

class ListNumbersFragment : Fragment() {

    private var _binding: FragmentListNumbersBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: ListNumbersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListNumbersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View,savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(ListNumbersViewModel::class.java)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
package store.dide.nfcmaker.ui.views.lists

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import store.dide.nfcmaker.databinding.FragmentListViewerBinding
import store.dide.nfcmaker.ui.viewmodels.lists.ListViewerViewModel

class ListViewerFragment : Fragment() {

    private var _binding: FragmentListViewerBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: ListViewerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListViewerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(ListViewerViewModel::class.java)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
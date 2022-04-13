package store.dide.nfcmaker.ui.views.masters

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import store.dide.nfcmaker.R
import store.dide.nfcmaker.databinding.FragmentMasterNfcerrorBinding
import store.dide.nfcmaker.ui.viewmodels.masters.MasterNFCErrorViewModel

class MasterNFCError : Fragment() {

    private var _binding: FragmentMasterNfcerrorBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: MasterNFCErrorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMasterNfcerrorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MasterNFCErrorViewModel::class.java)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
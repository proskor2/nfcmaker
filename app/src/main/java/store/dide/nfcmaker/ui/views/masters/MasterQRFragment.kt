package store.dide.nfcmaker.ui.views.masters

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import store.dide.nfcmaker.R
import store.dide.nfcmaker.databinding.FragmentMasterQrBinding
import store.dide.nfcmaker.ui.viewmodels.masters.MasterQRViewModel

class MasterQRFragment : Fragment() {

    private var _binding: FragmentMasterQrBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: MasterQRViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMasterQrBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MasterQRViewModel::class.java)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }

}
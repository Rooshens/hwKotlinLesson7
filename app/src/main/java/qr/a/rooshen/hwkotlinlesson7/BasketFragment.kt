package qr.a.rooshen.hwkotlinlesson7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import qr.a.rooshen.hwkotlinlesson7.databinding.FragmentBasketBinding

class BasketFragment : Fragment() {

    companion object {
        const val PHONE_NUMBER_KEY = "PHONE_NUMBER"

        fun newInstance(phoneNumber: String): BasketFragment {
            return BasketFragment().apply {
                arguments = bundleOf(
                    PHONE_NUMBER_KEY to phoneNumber
                )
            }
        }
    }

    private lateinit var binding: FragmentBasketBinding

    var phoneNumber: String? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBasketBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        phoneNumber = arguments?.getString(PHONE_NUMBER_KEY)
        binding.tvPhoneClient.text = "т. $phoneNumber"

        binding.clTableTomYam.setOnClickListener {
            (activity as? MainNavigation)?.openDialogBasket()
        }
    }

}
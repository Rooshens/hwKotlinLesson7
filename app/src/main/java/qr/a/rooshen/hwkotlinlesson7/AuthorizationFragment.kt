package qr.a.rooshen.hwkotlinlesson7


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import qr.a.rooshen.hwkotlinlesson7.databinding.FragmentAuthorizationBinding


class AuthorizationFragment : Fragment() {

    private lateinit var binding: FragmentAuthorizationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAuthorizationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonBegin.setOnClickListener {
            //(activity as? MainNavigation)?.openBasketFragment(binding.etPersonName.text.toString())
            (activity as? MainNavigation)?.openMenuList()
        }
    }
}
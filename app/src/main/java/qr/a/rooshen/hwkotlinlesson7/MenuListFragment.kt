package qr.a.rooshen.hwkotlinlesson7

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import qr.a.rooshen.hwkotlinlesson7.databinding.FragmentMenuListBinding

class MenuListFragment : Fragment() {

    private lateinit var binding: FragmentMenuListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vpMain = binding.vpMainMenuList
        vpMain.adapter = ViewPagerAdapter(this).apply {
            addFragment(AllMenuFragment())
            addFragment(FastFoodFragment())
            addFragment(DessertsFragment())
        }

        val tabNames = listOf("Все", "Фаст-фуд", "Десерты")
        vpMain.isUserInputEnabled = false
        val tbMain = binding.tbMainMenuList
        TabLayoutMediator(tbMain, vpMain) { tab, position ->
            tab.text = tabNames[position]
        }.attach()
    }
}
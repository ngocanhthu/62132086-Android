package ntu.thu_62132086.baitaptonghop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Default Fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, WelcomeFragment())
            .commit()
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNav.setOnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.navigation_welcome -> selectedFragment = WelcomeFragment()
                R.id.navigation_cau2 -> selectedFragment = Cau2Fragment()
                R.id.navigation_cau3 -> selectedFragment = Cau3Fragment()
                R.id.navigation_cau4 -> selectedFragment = Cau4Fragment()
            }
            // It will help to replace the
            // one fragment to other.
            if (selectedFragment != null) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, selectedFragment).commit()
            }
            return@setOnNavigationItemSelectedListener true
        }
    }
}
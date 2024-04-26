package ntu.thu_62132086.bottomnavigation_recylerview
import android.R
import android.R.id
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityMain)
        val bottomNav = findViewById<BottomNavigationView>(id.bottom_navigation)
        bottomNav.setOnNavigationItemSelectedListener(navListener)

        // as soon as the application opens the first
        // fragment should be shown to the user
        // in this case it is algorithm fragment
        val commit = supportFragmentManager.beginTransaction()
            .replace(id.fragment_container, AlgorithmFragment()).commit()
    }

    private val navListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item: MenuItem ->
            // By using switch we can easily get
            // the selected fragment
            // by using there id.
            var selectedFragment: Fragment? = null
            val itemId = item.itemId
            if (itemId == id.gorithm) {
                selectedFragment = AlgorithmFragment()
            } else if (itemId == id.course) {
                selectedFragment = CourseFragment()
            } else if (itemId == id.profile) {
                selectedFragment = ProfileFragment()
            }
            // It will help to replace the
            // one fragment to other.
            if (selectedFragment != null) {
                supportFragmentManager.beginTransaction()
                    .replace(id.fragment_container, selectedFragment).commit()
            }
            true
        }
}
package vsl.bhavesh.navigationdrawerdemo

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.core.view.GravityCompat
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        // Load default fragment [ START ]
        var fManager = supportFragmentManager
        var tx = fManager.beginTransaction()
        tx.add(R.id.frag1,HomeFragment())
        tx.commit()
        // Load default fragment [ END ]


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_home -> {
                // Handle the camera action
              //  Toast.makeText(this@MainActivity,"Home Page come here",Toast.LENGTH_LONG).show()

                var fManager = supportFragmentManager
                var tx = fManager.beginTransaction()
                tx.replace(R.id.frag1,HomeFragment())
                tx.commit()

            }
            R.id.nav_introduction -> {
              //  Toast.makeText(this@MainActivity,"Introcution FramLayout come here",Toast.LENGTH_LONG).show()
                var fManager = supportFragmentManager
                var tx = fManager.beginTransaction()
                tx.replace(R.id.frag1,IntroductionFragment())
                tx.commit()


            }
            R.id.nav_services -> {
              //  Toast.makeText(this@MainActivity,"Services FramLayout come here",Toast.LENGTH_LONG).show()
                var fManager = supportFragmentManager
                var tx = fManager.beginTransaction()
                tx.replace(R.id.frag1,ServicesFragment())
                tx.commit()

            }
            R.id.nav_contactus -> {
              //  Toast.makeText(this@MainActivity,"Contact US come here", Toast.LENGTH_LONG).show()
                var fManager = supportFragmentManager
                var tx = fManager.beginTransaction()
                tx.replace(R.id.frag1,ContactusFragment())
                tx.commit()

            }
            R.id.nav_staff -> {
                var fManager = supportFragmentManager
                var tx = fManager.beginTransaction()
                tx.replace(R.id.frag1,StaffFragment())
                tx.commit()

            }

        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}

package uk.ac.tees.mad.splendid.util

import android.view.View
import androidx.fragment.app.Fragment
import uk.ac.tees.mad.splendid.R
import uk.ac.tees.mad.splendid.ShoppingActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Fragment.hideBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            uk.ac.tees.mad.splendid.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.GONE
}

fun Fragment.showBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            uk.ac.tees.mad.splendid.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.VISIBLE
}
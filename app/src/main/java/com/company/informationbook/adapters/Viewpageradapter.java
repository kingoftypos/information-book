package com.company.informationbook.adapters;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.company.informationbook.fragments.unitedkingdom;

public class Viewpageradapter extends FragmentStateAdapter {
    public Viewpageradapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;

        switch (position){
            case 0:
                fragment= unitedkingdom.newInstance();
                break;
            default:
                return null;

        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}

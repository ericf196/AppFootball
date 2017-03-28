package com.example.omega.appfooball.viewpager;


import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.omega.appfooball.R;
import com.example.omega.appfooball.SectionPagerAdapter;
import com.example.omega.appfooball.fragments.GoalsConcededFragment;
import com.example.omega.appfooball.fragments.GoalsPassingFragment;
import com.example.omega.appfooball.fragments.GoalsScoredFragment;

public class ContenedorPagerViewFragment extends Fragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private Toolbar toolbar;
    private AppBarLayout appBarLayout;


    public static ContenedorPagerViewFragment newInstance() {
        ContenedorPagerViewFragment fragment = new ContenedorPagerViewFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v= inflater.inflate(R.layout.fragment_contenedor_pager_view, container, false);
        View parent= (View) container.getParent();

        appBarLayout= (AppBarLayout) parent.findViewById(R.id.appBar);

        tabLayout=new TabLayout(getActivity());
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.colorAccent));

        tabLayout.setTabTextColors(ColorStateList.valueOf(getResources().getColor(R.color.colorAccent)));


        viewPager=(ViewPager) v.findViewById(R.id.viewpager);

        SectionPagerAdapter sectionPagerAdapter = new SectionPagerAdapter(getFragmentManager());

        sectionPagerAdapter.addFragment(new GoalsPassingFragment(), "Goals Passing");
        sectionPagerAdapter.addFragment(new GoalsConcededFragment(), " Goals Conceded");
        sectionPagerAdapter.addFragment(new GoalsScoredFragment(), "Goals Scored");

        viewPager.setAdapter(sectionPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

        toolbar= (Toolbar) getActivity().findViewById(R.id.toolbar);

        appBarLayout.addView(tabLayout);


        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        appBarLayout.removeView(tabLayout);
    }
}

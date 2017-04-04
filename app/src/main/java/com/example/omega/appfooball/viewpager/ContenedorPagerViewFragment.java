package com.example.omega.appfooball.viewpager;


import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.omega.appfooball.R;
import com.example.omega.appfooball.SectionPagerAdapter;
import com.example.omega.appfooball.fragments.GoalsConcededFragment;
import com.example.omega.appfooball.fragments.GoalsPassingFragment;
import com.example.omega.appfooball.fragments.GoalsScoredFragment;
import com.viewpagerindicator.TitlePageIndicator;

import java.util.List;

public class ContenedorPagerViewFragment extends Fragment implements View.OnFocusChangeListener, ViewPager.OnPageChangeListener {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private Toolbar toolbar;
    private AppBarLayout appBarLayout;

    private  SectionPagerAdapter sectionPagerAdapter;
    private TitlePageIndicator titleIndicator;


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

        /*tabLayout=new TabLayout(getActivity());
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.colorAccent));

        tabLayout.setTabTextColors(ColorStateList.valueOf(getResources().getColor(R.color.colorAccent)));*/

        viewPager=(ViewPager) v.findViewById(R.id.viewpager);

        sectionPagerAdapter = new SectionPagerAdapter(getFragmentManager());

        sectionPagerAdapter.addFragment(new GoalsPassingFragment(), "Goals Passing");
        sectionPagerAdapter.addFragment(new GoalsConcededFragment(), "Goals Conceded");
        sectionPagerAdapter.addFragment(new GoalsScoredFragment(), "Goals Scored");

        viewPager.setAdapter(sectionPagerAdapter);


        titleIndicator = (TitlePageIndicator) v.findViewById(R.id.indicator);

        titleIndicator.setViewPager(viewPager);

        titleIndicator.setCurrentItem(1);

        viewPager.addOnPageChangeListener(this);

        //tabLayout.setupWithViewPager(viewPager);

        toolbar= (Toolbar) getActivity().findViewById(R.id.toolbar);

        //appBarLayout.addView(tabLayout);

        //ponemos estilo a los viewpager
        SpannableStringBuilder spannableStringBuilderPassing= new  SpannableStringBuilder(sectionPagerAdapter.getPageTitle(0).toString(),0,3);
        SpannableStringBuilder spannableStringBuilderScored= new  SpannableStringBuilder(sectionPagerAdapter.getPageTitle(2).toString(),0,7);

        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //appBarLayout.removeView(tabLayout);
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
       /* if(sectionPagerAdapter.getPageTitle(0).toString().equals("Goals Passing")){
            Log.i("msg", sectionPagerAdapter.getPageTitle(0).toString());
        }else if(sectionPagerAdapter.getPageTitle(1).toString().equals("Goals Conceded")){
            Log.i("msg", sectionPagerAdapter.getPageTitle(1).toString());
        }else{
            Log.i("msg", sectionPagerAdapter.getPageTitle(2).toString());
        }
        Log.i("msg", sectionPagerAdapter.getPageTitle(0).toString());*/
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        //Log.i("msg", sectionPagerAdapter.getPageTitle(position).toString());

        SpannableStringBuilder spannableStringBuilder= new  SpannableStringBuilder(sectionPagerAdapter.getPageTitle(position).toString(),1,7);
        Log.i("msg", spannableStringBuilder.toString());
        /*if(position==0){

            titleIndicator.setTextColor(R.drawable.prueba_text);
        }else if(position==1){
            titleIndicator.setTextColor(R.drawable.prueba_text);
        }else
            titleIndicator.setTextColor(R.drawable.prueba_text);
        */

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}

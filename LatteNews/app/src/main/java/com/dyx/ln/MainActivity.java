package com.dyx.ln;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tool_bar)
    Toolbar toolBar;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.app_bar_layout)
    AppBarLayout appBarLayout;
    @BindView(R.id.view_pager)
    ViewPager viewPager;
    private Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUnbinder = ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        setSupportActionBar(toolBar);
        initViewPager();
    }

    private void initViewPager() {
        int menuSize = getMenus().size();
        for (int i = 0; i < menuSize; i++) {
            tabLayout.addTab(tabLayout.newTab().setText(getMenus().get(i)));
        }
        List<Fragment> fragments = new ArrayList<>();
        for (int i = 0; i < menuSize; i++) {
            fragments.add(new NewsListFragment());
        }
        NewsListAdapter newsListAdapter = new NewsListAdapter(getSupportFragmentManager(), fragments, getMenus());
        viewPager.setAdapter(newsListAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabsFromPagerAdapter(newsListAdapter);
    }

    private List<String> getMenus() {
        List<String> results = new ArrayList<>();
        results.add("推荐");
        results.add("新闻");
        results.add("娱乐");
        results.add("体育");
        results.add("财经");
        results.add("汽车");
        results.add("军事");
        results.add("直播");
        results.add("视频");
        results.add("段子");
        results.add("时尚");
        results.add("本地");
        results.add("手机");
        results.add("科技");
        results.add("游戏");
        results.add("数码");
        results.add("教育");
        results.add("健康");
        results.add("独家");
        results.add("航空");
        results.add("旅游");
        results.add("亲子");
        results.add("艺术");
        return results;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
    }
}

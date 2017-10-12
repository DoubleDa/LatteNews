package com.dyx.ln;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Author：dayongxin
 * Function：
 */
public class NewsListFragment extends Fragment {
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    private Unbinder mUnbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news_list, container, false);
        mUnbinder = ButterKnife.bind(this, view);
        initView();
        return view;
    }

    private void initView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new RvAdapter(getActivity(), getDatas()));
    }

    private List<String> getDatas() {
        List<String> results = new ArrayList<>();
        results.add("最高法、司法部:不得限制辩护律师合理阅卷次数");
        results.add("北京城市中心区域疏解后 空地变身足球场");
        results.add("清华附小校长谈学生研究苏轼:农村孩子可研究放牛");
        results.add("波音757盘旋厦门上空数十圈 紧急代码7700有何含义");
        results.add("6名90后自制假违停罚单 骗到78笔转账只赚了1.69元");
        results.add("世界杯场地不合格?俄罗斯人就这么耿直的解决了");
        results.add("阳澄湖大妈一天捆蟹3000只 月入上万元");
        results.add("菲律宾女硕士远嫁中国离异民工:爱吃他炒的饭");
        results.add("巴萨开50万镑周薪续约梅西 签字费最高8500万镑");
        results.add("圆通涨价通知挂一天后被撤 副总裁:双11不涨价");
        results.add("这位女厅长提名为市长 原市长任职仅5个月");
        results.add("美宣布明年退出教科文组织:该组织对以色列有偏见");
        results.add("这3名不信马列拜鬼神的落马官员 曾干过哪些荒唐事");
        results.add("70后女局长和副手同时被拿下 曾在40岁成正县级");
        results.add("联合国教科文组织回应美国退出决定：表示遗憾");
        return results;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }
}

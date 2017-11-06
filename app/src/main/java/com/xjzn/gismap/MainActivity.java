package com.xjzn.gismap;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.MapView;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {
    private MapView mMapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //加载数据
        initData();
        //加载控件
        bindViews();
        //初始化事件
        initListener();
    }
    //加载数据
    private void initData(){
        LitePal.initialize(this);
        SQLiteDatabase db = LitePal.getDatabase();

    }
    //加载控件
    private void bindViews(){
        mMapView = findViewById(R.id.mapView);
    }

    //初始化事件
    private void initListener(){
        ArcGISMap map = new ArcGISMap(Basemap.Type.STREETS_VECTOR, 34.098, 113.860, 10);
        mMapView.setMap(map);
    }
}

package com.xjzn.gismap;

import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/11/6 0006.
 */

public class HttpRequest {
    OkHttpClient client = new OkHttpClient();

    public HttpRequest(String url,okhttp3.Callback callback){
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(callback);
    }
    public static boolean handleEquip(String response){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray Equips = new JSONArray(response);
                for (int i = 0;i < Equips.length();i++){
                    JSONObject EquipObject = Equips.getJSONObject(i);
                    EquipBean equipBean = new EquipBean();
                    equipBean.setEast(EquipObject.getString("East"));
                    equipBean.setId(EquipObject.getString("id"));
                    equipBean.setName(EquipObject.getString("name"));
                    equipBean.setNorth(EquipObject.getString("North"));
                    equipBean.setType(EquipObject.getString("type"));
                    equipBean.save();
                }
                return true;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
}

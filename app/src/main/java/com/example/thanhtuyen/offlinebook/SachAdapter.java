package com.example.thanhtuyen.offlinebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tuyen on 4/16/2018.
 */

public class SachAdapter extends BaseAdapter {
    //đặt tên biến
    Context myContext;
    int myLayout;
    //list đối tượng sinh viên
    List<Sach> arraySach;
    public SachAdapter(Context context, int layout, List<Sach> sachList) {
        myContext = context;
        myLayout = layout;
        arraySach = sachList;
    }


    @Override
    public int getCount() {
        //trả về bao nhiêu dòng
        return arraySach.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //dùng để hiển thị nhiều dòng trên giao diện xml lấy các giao diện khác đẩy vào
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout,null);

        //ánh xạ và gán các trị
        TextView txtTheLoai = (TextView) convertView.findViewById(R.id.textViewTheLoai);
        txtTheLoai.setText(arraySach.get(position).Theloai);
        TextView txtSoLuong = (TextView) convertView.findViewById((R.id.textViewSoLuong));
        txtSoLuong.setText(String.valueOf(arraySach.get(position).SoLuongSach));
        return convertView;
    }
}

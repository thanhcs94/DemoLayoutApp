package com.thanhcs.lifeofdev;

import com.google.android.gms.plus.model.people.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thanhcs94 on 9/13/2016.
 */
public class Data {
    public String name;
    public String age;
    public int photoId;
    public Data(){
        initializeData();
    }
    Data(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }

    public  List<Data> datas;

    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    private void initializeData() {
        datas = new ArrayList<>();
        datas.add(new Data("Sữa trái cây Minute Maid Nutriboost", "Công Ty CP Thực Phẩm Chức Năng Cao Cấp Ebisu Việt Nam", R.drawable.holder_image_sua));
        datas.add(new Data("Sước tăng lực nhãn hiệu Samurai hương dâu ", "Công Ty Đầu Tư Và Xuất Nhập Khẩu Hoàng Long", R.drawable.holder_image_sua));
        datas.add(new Data("Coca-Cola ", "Công Ty TNHH Thực Phẩm Royal Việt Nam", R.drawable.holder_image_sua));
        datas.add(new Data("Nước uống vận động Aquarius", "Công Ty TNHH Botania", R.drawable.holder_image_sua));
        datas.add(new Data("Nước uống vận động Aquarius", "Cơ Sở Khai Thác Yến Sào Ngọc Thảo Khánh Hòa", R.drawable.holder_image_sua));
        datas.add(new Data("Nước cam có tép", "Công Ty Cổ Phần Dược Liệu Miền Nam", R.drawable.holder_image_sua));
    }
}
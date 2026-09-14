package org.example.buoi8.ex1;

import java.util.Scanner;

public class MyNews {
    News[] news = new News[10];

    void insert(News news) {
        if (news == null) {
            System.out.println("du lieu khong hop le!");
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (this.news[i] == null) {
                this.news[i] = news;
                return;
            }
        }
        System.out.println("Da het cho trong");
    }

    void viewList() {
        for (int i = 0; i < news.length; i++) {
            if (news[i] != null) {
                System.out.println(news[i].getTitle());
            }
        }
    }

    float averageRate() {
        float tong = 0;
        for (int i = 0; i < news.length; i++) {
            // news[i]: lấy ra phần tử thứ i
            // tính trung bình rate của bài báo thứ i
            tong =  tong + news[i].Calculate();
        }
        return tong / news.length;
    }


}

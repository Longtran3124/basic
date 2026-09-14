package org.example.buoi7.ex1;

public class News implements INews {
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return Title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public String getContent() {
        return Content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public void Display() {
        System.out.println("Title: " + Title +
                " PublishDate: " + PublishDate +
                " Author: " + Author +
                " Content: " + Content +
                " AverageRate: " + AverageRate);
    }

    @Override
    public float Calculate() {
        int[] Rates = {7, 8, 3};
        int sum = 0;
        // duyệt mảng
        for (int rate : Rates) {
            // sum = sum + rate
            sum += rate;
        }
        // Tính trung bình cộng
        // ép kiểu float
        AverageRate = (float) sum / Rates.length;
        return AverageRate;
    }
}

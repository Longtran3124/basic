# Agenda
- Internationaliztion
- Annotations
- Inner class
- Garbage Collector
- Java Structure


- Internationalization
  - I18N
  - Support language & format number, money,... base on Locale
    - NumberFormat
    - DateFormat
      + DateFormat
      + SimpleDateFormat -> định dạng date theo kiểu đơn giản


- trong nhiều trường hợp getInstance có thể khởi tạo đối tượng, nó bản chất giống với từ khóa new nhưng nó sẽ giấu Object đi

# Annotations
- @Override -> ghi đè
- @Deprecated -> dùng để khai tử 1 hàm mình muốn
- @SuppressWarnings -> dùng để ẩn các cảnh báo mà compiler (trình biên dịch) đưa ra


- metadata là dữ liệu không ảnh hưởng trực tiếp đến chương trình, nó dùng để đánh dấu để java biết

- Inner class là 1 class nằm trong 1 class. (thông thường không được sử dụng mấy)
  - có 2 loại 
    + class nằm trong class
    + class nằm trong method

- Phân mảnh bộ nhớ là khi dùng xong nó sẽ trả nhưng nó sẽ gây ra hiện tượng bộn nhớ thì có nhưng xin các ô liên tiếp nhau thì k đủ 

- Garbage Collector -> Rác là đối tợng không ai trỏ đến không ai dùng đến
  - Collect "Garbage"
  - Garbage is
    - Object hass null pointer
    - Parent of object has null pointer
    - local variable (biến chỉ dùng trong 1 phạm vi nhỏ như hàm, khi thoát khỏi nó không dùng nữa thì nó là rác)
- Garbage Collector
  - Method
    + System.gc() -> Mục đích của nó là báo cho java bảo nó hỗ trợ mình xóa nhưng không phải lúc nào nó cũng dọn luôn
    + finalize()



- Java Stricture 
  - JDK (java Development kit) -> công cụ phát triển java: nhiệm vụ chính của nó là chuyển từ file .java sang file .class
  - JVM (java virtual machine) -> Máy ảo java -> nhiệm vụ của JVm là từ file .class phải tương thích với các hệ điều hành khác nhau
  - JRE (java runtime)


- Interpretion & Compilation
  - Interpretion (Thông dịch)
  - Compilation (Biên dịch)

- stack và Heap ( bộ nhớ của heap lớn hơn stack)
  - stack dùng để lưu trữ variable
  - Heap lưu các đối tượng khi new
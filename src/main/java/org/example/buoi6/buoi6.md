- Abstraction 
    - Abstract class -> là 1 class trìu tượng, không thể tạo ra đối tuợng phải tạo 1 đối tượng cụ thể
        + Is object but not completed yet
        + abstract class -> các class con có cùng thuộc tính chung thì các class chung được viết ở class cha
        + abstract method -> dùng khi 1 hàm có thể tái sử dụng giữa tất cả các class con - Nếu logic của các class con khác nhau thì nên dùng abstract
        + 1 class bình thường không được phép chứa class abstarct được
    -> Khi dùng astraction là sử dụng kế thừa, các class con phải kế thừa class cha và class cha được khai báo abstarction . Trong class cha có abstraction có các thuộc tính và phương thức thì sẽ c tồn tại phương thức abstract thì phải tự implement phương thức abstract trong class cha
    -> dùng class abstraction khi mà mình kh muốn người dùng khởi tạo 1 Objetc từ class đầy thì chỉ có thể khởi tạo Objetc ở class con
    
    - Interface




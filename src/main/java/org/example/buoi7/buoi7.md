# Interface
- Is not Object
- Method of Interface is public abstract method
- Abstract and interface
  - Interface khác abstract class ở chỗ Abstract class sẽ có các thuộc tính còn trong Interface cũng sẽ có các thuộc tính nhưng thuộc tính của nó là hằng số (có nghĩa là không thể thay đổi) và tất cả nhưng gìở trong Interface đều là public, và đều là abstract
  - Interface hỗ trợ đa kế thừa (1 lớp có thể implement nhiều interface) còn abstract thì không
  - Mục đích của Interface là gom nhóm các hành động lại 


# Polymorphism (Tính đa hình): Vẫn là một đối tượng nhưng trong ngữ cảnh khác nhau thì nó sẽ là các đối tượng khác nhau
- Object Management (Manage Parent, Not manage child) -> Sử dụng class cha tham triếu đến class con
- keyword instanceof -> Trả về true/false
- Override và Overload
  - Chữ ký của phương thức gồm tên và tham số bao gồm cả thứ tự
  - trong 1 class không thể có 2 phương thức có cùng chữ ký
  - Các phương thức có tên giống nhau khác chữ ký được gọi là overloading 
  - Override là ghi đè. Lớp con ghi đè lên lớp cha

- this dùng để tham chiếu đến class hiện tại
- super dùng để tham chiếu đến class cha

khi nào cần dùng abstract khi nào dùng interface ?
- Dùng abstarct khi các class con có các thuộc tính chung
- Dùng Interface khi chỉ có hành vi mà không có thuộc tính
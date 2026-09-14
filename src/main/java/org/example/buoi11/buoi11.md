# Agenda
- Collection (bản chất nó là 1 Interface)
  - Array can manage object or primitive
  - Collection can only manage object
  - Polymo
- Comparing
- Generic



- Có 2 loại List
  - ArrayList: nó sẽ tự nhảy phần tử cuối cùng vì mảng Array sẽ tự tính toán. Ví dụ như từ 1 -> 5, nó sẽ nhảy từ 1 đến 5 còn từ 1 dến 2 hay từ 3 đến 4 nó sẽ tự tính.
  - LinkedList: Nó sẽ chạy lần luật qua từng phần tử. ví dụ như từ 1 -> 5 thì 1 sẽ phải đi qua 2 và cứ như thế đến 4 đi đến 5
- Độ phức tạp của thuật toán
  - o(1) độ phức tạp của nó là 1
  - o(n) độ phức tạp của nó là n
- List method
  - size
  - get
  - remove
  - clear

- Stack (Ngăn xếp)
  - Method
    + pop
    + push
    + peek
    + isEmpty

- Queue (Hàng đợi): Thằng nào đến trước ra trước đến sau ra sau
  - Method
    + enqueue
    + dequeue
    + peek
    + isFull
    + isEmpty

- Accessing by Index & neighborhood
  - Accessing by index (ArrayList)
    + ArrayList chỉ cần biết vị trí nó sẽ tính toán vả nhảy đến đấy luôn
  - Accessing by neighbourhood (HashSet, LinkedList)
    + LinkedList muốn truy cập thì phải đi qua từng thằng trước đấy


- Set (là 1 tập hợp cũng lưu danh sách nhưng sẽ loại bỏ các phần tử trùng lặp)
  - Hash set
- Map (nó sẽ là key-value(key để định danh value))
  - HashMap
  - Key không được trùng mà đã trùng nó sẽ đè lên cái cũ
  - get của map sẽ khác get của list vì get của list sẽ truyền vào Index còn của map sẽ truyền vào key
  - keySet là lấy key(id)


- Comparing
  - Equasl
  - hashCode

- để sắp xếp các phần tử trong mảng ta sử dụng
  - Collections.sort()
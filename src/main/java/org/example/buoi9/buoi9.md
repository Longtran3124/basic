# Agenda

- Debug -> tìm kiếm lỗi
- Handling Exception -> xử lý lỗi

- Debug -> Dùng để kiểm tra 1 hàm moduel nhỏ nào đấy đầu ra của nó có đúng hay không
    - Breakpoint -> điểm dừng (đánh dấu đoạn mình muốn dứng  )
    - Debug mode
    - Expression
    - Variable

- Handling Exception
    - Catch
        + Compile error
        + Logical error

    - Common Exception
        + ArrayIndexOutOfBoundException -> lỗi này xảy ra khi truy cập vào 1 số index không tồn tại trong mảng
        + ArithmeticException -> lỗi xảy ra khi thực hiện 1 phép toán không hợp lệ ví dụ như chia cho 0
        + NullPointerException 

- syntax 
- Xử lý các Exception
    try { 
        statement
    } catch(SubException e) {
        // statement when error
    } catch(ParentException e) {\
        // parentexception when error
    } finally {
        // statemnet made last
    }

- Throw và Throws
  - Throw là hành động ném exception, dùng bên trong thân method
  - Throws l khai báo method có thể ném ra exception
- StackTrace -> In ra tất cả các lỗi. Dùng trên chữ ký của method, để báo cho method biết method này có khả năng ra exception loại gì

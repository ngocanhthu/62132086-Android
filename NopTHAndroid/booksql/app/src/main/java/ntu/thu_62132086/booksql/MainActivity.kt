package ntu.thu_62132086.booksql

import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var db: SQLiteDatabase? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tạo hoặc mở CSDL
        db = openOrCreateDatabase("MyBook.db", MODE_PRIVATE, null)

        // Câu lệnh tạo bảng
        val sqltaobangneudaco = "DROP TABLE IF EXISTS BOOKS;"
        val sqltaobang = ("CREATE TABLE BOOKS(BookID integer PRIMARY KEY,"
                + "BookName text,"
                + "Page integer,"
                + "Price Float,"
                + "Description text);")
        // Thực hiện lệnh SQL
        db.execSQL(sqltaobangneudaco)
        db.execSQL(sqltaobang)

        // Thêm một số dòng dữ liệu vào bảng
        val sqlThem1 = "INSERT INTO Books VALUES(1, 'Java', 100, 9.99, 'sách về java');"
        val sqlThem2 = "INSERT INTO Books VALUES(2, 'Android', 320, 19.00, 'Android cơ bản');"
        val sqlThem3 = "INSERT INTO Books VALUES(3, 'Học làm giàu', 120, 0.99, 'sách đọc cho vui');"
        val sqlThem4 =
            "INSERT INTO Books VALUES(4, 'Tử điển Anh-Việt', 1000, 29.50, 'Từ điển 100.000 từ');"
        val sqlThem5 = "INSERT INTO Books VALUES(5, 'CNXH', 1, 1, 'chuyện cổ tích');"
        db.execSQL(sqlThem1)
        db.execSQL(sqlThem2)
        db.execSQL(sqlThem3)
        db.execSQL(sqlThem4)
        db.execSQL(sqlThem5)

        // Đóng CSDL
        db.close()

        // Truy vấn SELECT
        // B1. Mở CSDL
        db = openOrCreateDatabase("MyBook.db", MODE_PRIVATE, null)

        // B2. Thực thi câu lệnh select
        val sqlSelect = "SELECT * FROM Books;"
        val cs = db.rawQuery(sqlSelect, null)

// B3: Đổ vào biến nào đó để xử lý
        val dsSach: ArrayList<java.awt.print.booksql> = ArrayList<java.awt.print.booksql>()
        while (cs.moveToNext()) {
            val idSach = cs.getInt(0)
            val tenSach = cs.getString(1)
            val soTrang = cs.getInt(2)
            val gia = cs.getFloat(3)
            val mota = cs.getString(4)
            val b: java.awt.print.booksql = java.awt.print.booksql(idSach, tenSach, soTrang, gia, mota)
            dsSach.add(b)
        }

// Đóng CSDL
        db.close()

        // B4, Hiển thị lên ListView
        val dsThongTinSach = ArrayList<String>()
        for (book in dsSach) {
            val thongTinSach = """
     ID sách: ${book.getBookID()}
     Tên sách: ${book.getBookName()}
     Số trang: ${book.getPage()}
     Giá sách: ${book.getPrice()}
     """.trimIndent() + "\nMô tả sách: " + book.getDescription()
            dsThongTinSach.add(thongTinSach)
        }
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dsThongTinSach)
        val listViewBooks = findViewById<ListView>(R.id.listViewBooks)
        listViewBooks.adapter = adapter
    }
}
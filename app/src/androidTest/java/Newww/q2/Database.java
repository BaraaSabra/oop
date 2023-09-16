package Newww.q2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.oop.Employee;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class Database extends SQLiteOpenHelper {


    public static  final  String DB_name="Department";
    public static final int DB_VERSION=1;
    public static String Employee_TB_Name="employee";
    public static String  Employee_CLM_Name="Name";
    public static String Employee_CLM_Salary="salary";
    public static final String Employee_CLM_ID="id";





    public Database(@Nullable Context context) {
        super(context, DB_name, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE "+ Employee_TB_Name+ " "+"("+Employee_CLM_ID+" INTEGER primary Key autoincrement," +
                Employee_CLM_Salary+"INTEGER,"+Employee_TB_Name+ "TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " +Employee_TB_Name);
        onCreate(sqLiteDatabase);

    }

    public  boolean insert(empleye employee){
        SQLiteDatabase db=getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(Employee_CLM_Name,employee.getMane());
        values.put(Employee_CLM_Salary,employee.getSalary());
        long resuit=db.insert(Employee_TB_Name,null,values);
        return resuit != -1;

    }

    public ArrayList<empleye>getEmployee(){
        ArrayList<empleye>empleye=new ArrayList<>();
        SQLiteDatabase database=getReadableDatabase();
        Cursor cursor=database.rawQuery("select * from "+Employee_TB_Name,null);
        if (cursor.moveToFirst()){
            do {
                String name=cursor.getString(cursor.getColumnIndexOrThrow(Employee_CLM_Name));
                double salary=cursor.getDouble(cursor.getColumnIndexOrThrow(Employee_CLM_Salary));
                empleye e=new empleye(name,salary);
                empleye.add(e);

            }while (cursor.moveToNext());
            cursor.close();
        }
        return empleye;
    }
}

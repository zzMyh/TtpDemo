package cn.myh.zz.myokhttputils_greendao;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.ArrayList;
import java.util.List;

import cn.myh.zz.myokhttputils_greendao.db.DBManager;
import cn.myh.zz.myokhttputils_greendao.db.DaoMaster;
import cn.myh.zz.myokhttputils_greendao.db.DaoSession;
import cn.myh.zz.myokhttputils_greendao.db.User;
import cn.myh.zz.myokhttputils_greendao.db.UserDao;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button button3;
    protected Button button4;
    protected Button button2;
    protected Button button;
    private DBManager dbHelp;
    private Button button5;

//    private InfoDao mUserdao;
//    private DataDao mDataDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
//        DaoMaster.DevOpenHelper openHelper = new DaoMaster.DevOpenHelper(this, "user.db", null);
        // 通过 DaoMaster 的内部类 DevOpenHelper创建数据库
        // 注意：默认的 DaoMaster.DevOpenHelper 会在数据库升级时，删除所有的表
        // 所以，在正式的项目中，你还应该做一层封装，来实现数据库的安全升级。
        /**
         * @param context :　Context
         * @param name : 数据库名字
         * @param factory : CursorFactroy
         */
//        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "student.db", null);
//        // 获取数据库
//        SQLiteDatabase database = helper.getWritableDatabase();
//        // 获取DaoMaster
//        DaoMaster daoMaster = new DaoMaster(database);
//        // 获取Session
//        DaoSession daoSession = daoMaster.newSession();
//        // 获取对应的表的DAO对象
//        mUserdao = daoSession.getInfoDao();
//        mDataDao = daoSession.getDataDao();
        initView();

        dbHelp = DBManager.getInstance(this);


    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button3) {//增
            add();
        } else if (view.getId() == R.id.button4) {//删
        del();
        } else if (view.getId() == R.id.button2) {//改
            update();
        } else if (view.getId() == R.id.button) {//查
            query();
        }else if (view.getId() == R.id.button5){//插入用户合集
            addList();

        }
    }

    private void addList() {
        //插入用户合集
        User user  = new User(null,"aa",11);
        User user1  = new User(null,"bb",22);
        User user2  = new User(null,"cc",33);
        User user3  = new User(null,"dd",44);
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        dbHelp.insertUserList(users);
        Toast.makeText(this,"插入多用户成功",Toast.LENGTH_SHORT).show();
    }

    private void query() {
        //查询
        List<User> users = dbHelp.queryUserList();
        Toast.makeText(this,"查询成功",Toast.LENGTH_SHORT).show();
        for (User user:users) {
            Log.d("MainAct",user.toString());
        }

    }

    private void update() {
        User user = new User(1L,"YY",88);
        dbHelp.updateUser(user);
        Toast.makeText(this,"更新成功",Toast.LENGTH_SHORT).show();
    }

    private void del() {
        //删除一条信息
        User user = new User(2l,"aa",11);
        dbHelp.deleteUser(user);
        Toast.makeText(this,"删除成功",Toast.LENGTH_SHORT).show();
    }

    private void add() {
        User user = new User(null,"zhangSan",18);
        dbHelp.insertUser(user);
        Toast.makeText(this,"插入单用户成功",Toast.LENGTH_SHORT).show();

//        InfoBean user = new InfoBean(null,"zhansan",18,"13211112221","河南郑州");
//        InfoBean user1 = new InfoBean(null,"ls",17,"13311112221","河南开封");
//        InfoBean user2 = new InfoBean(null,"ww",16,"13411112221","河南登封");
//        InfoBean user3 = new InfoBean(null,"zl",15,"13511112221","河南商丘");
//        mUserdao.insert(user);
//        mUserdao.insert(user1);
//        mUserdao.insert(user2);
////        mUserdao.insert(user3);
//        Data data = new Data(null,"牙刷","http://fdfdf.dfdf.dfdfd.fdf","12","2018-10-27");
//        Data data1 = new Data(null,"香皂","http://fdfdf.dfdf.dfdfd.fdf","12","2018-10-27");
//        Data data2 = new Data(null,"茶杯","http://fdfdf.dfdf.dfdfd.fdf","12","2018-10-27");
//        mDataDao.insert(data);
//        mDataDao.insert(data1);
//        mDataDao.insert(data2);
//        Toast.makeText(MainActivity.this,"添加数据成功",Toast.LENGTH_LONG).show();
    }

    private void initView() {
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(MainActivity.this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(MainActivity.this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(MainActivity.this);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(MainActivity.this);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(MainActivity.this);
    }


}

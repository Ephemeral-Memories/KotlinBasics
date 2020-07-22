public class JavaTest {
    public String getName(){
        return "MARK";
    }

    public static void main(String[] args) {
        KotlinClass kc=new KotlinClass("MARK");
        kc.show();

        //匿名对象
        loadData(new HttpReqImpl());

        //匿名内部类
        loadData(new HttpReq() {
            @Override
            public void onSuccess() {
                System.out.println("下载成功");
            }
        });

        //lamba
        loadData(() -> System.out.println("下载成功"));

    }

    public static void loadData(HttpReq req){
        req.onSuccess();
    }
    interface HttpReq{
        void onSuccess();
    }

    static class  HttpReqImpl implements HttpReq{

        @Override
        public void onSuccess() {
            System.out.println("下载成功");
        }
    }
}

class User{
    private String name;
    private String password;
    private int id;

    public User(String name, String password, int id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

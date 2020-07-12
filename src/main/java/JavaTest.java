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


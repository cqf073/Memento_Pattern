import java.util.HashMap;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/6/117:44
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Action {
    private HashMap<String ,String > statu;

    public Action() {
        statu=new HashMap<>();
    }
    public Memoradum crmemery(){
        return new Memto(statu);
    }
    public void restore(Memoradum memoradum){
        statu=((Memto)memoradum).getState();

    }
    public void showstate(){
        System.out.println("now state:"+statu.toString());
    }
    public void teststate(){
        statu=new HashMap<String, String>();
            statu.put("bleed","100" );
            statu.put("em","5" );
            statu.put("state","10" );
    }
    public void teststate1(){
        statu=new HashMap<String, String>();
        statu.put("bledd","99" );
        statu.put("em","5" );
        statu.put("state","8" );
    }
    private class Memto implements Memoradum{
        private HashMap<String,String> state;

        public Memto(HashMap state) {
            this.state =new HashMap(state);
        }

        public HashMap<String, String> getState() {
            return state;
        }

        public void setState(HashMap<String, String> state) {
            this.state = state;
        }
    }
}


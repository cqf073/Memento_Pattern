import java.util.ArrayList;
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
public class Action2 {
    private ArrayList<String> statu;

    public Action2() {
        statu=new ArrayList<String>();
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
        statu=new ArrayList<String>();
            statu.add("乘:美" );
            statu.add("青:男" );
            statu.add("风:子" );
    }
    public void teststate1(){
        statu=new ArrayList<String>();
        statu.add("乘1:美2" );
        statu.add("青1:男2" );
        statu.add("风1:子2" );
    }
    private class Memto implements Memoradum{
        private ArrayList<String> state;

        public Memto(ArrayList state) {
            this.state =new ArrayList(state);
        }

        public ArrayList<String> getState() {
            return state;
        }

        public void setState(ArrayList<String> state) {
            this.state = state;
        }
    }
}


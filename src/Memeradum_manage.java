import java.util.HashMap;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/6/117:38
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Memeradum_manage {
    private HashMap<String,Memoradum> mem;

    public Memeradum_manage() {
        mem=new HashMap<String, Memoradum>();
    }
    public Memoradum rememory(String name){
        return mem.get(name);
    }
    public void savememery(String name,Memoradum memto){
        this.mem.put(name, memto);
    }
}

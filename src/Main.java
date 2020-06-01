public class Main {

    public static void main(String[] args) {
       Memeradum_manage memeradum_manage=new Memeradum_manage();
       Action action =new Action();
      Action2 action2 =new Action2();

      System.out.println("**************action**************");
        action.teststate();
        memeradum_manage.savememery("action", action.crmemery());
        action.showstate();
        action.teststate1();
        action.showstate();
        action.restore(memeradum_manage.rememory("action"));
        action.showstate();


        System.out.println("*************action2************");
        action2.teststate();
        memeradum_manage.savememery("action", action2.crmemery());
        action2.showstate();
        action2.teststate1();
        action2.showstate();
        action2.restore(memeradum_manage.rememory("action"));
        action2.showstate();
    }
}

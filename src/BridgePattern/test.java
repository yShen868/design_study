package BridgePattern;

/**
 * 桥接模式
 */
public class test {

    public static void main(String[] args) {
        Engine2000cc engine2000cc=new Engine2000cc();
        Engine2200cc engine2200cc=new Engine2200cc();
        Car bus=new Bus(engine2000cc);
        bus.InstallEngine(); //Bus:2000cc
        Car bus1=new Bus(engine2200cc);
        bus1.InstallEngine(); //Bus:2200cc
    }
}

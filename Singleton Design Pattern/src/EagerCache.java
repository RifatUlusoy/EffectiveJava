import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EagerCache implements Cache{
    private static final EagerCache instance = new EagerCache();
    private HashMap<Object,Object> map;
    private EagerCache(){
        map = new HashMap<Object,Object>();
    }
    @Override
    public void put(Object key, Object value) {
        map = new HashMap<Object,Object>();
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }
    public static EagerCache getInstance(){
        return instance;
    }
}

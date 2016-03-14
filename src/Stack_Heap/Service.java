package Stack_Heap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by PC on 01.03.2016.
 */
public interface Service {
}
interface Provider{
    Service newService();
}
class Services{
    private Services(){};
    private static  final Map<String,Provider>  provides = new ConcurrentHashMap<>();
    public static final String DEFAULT_PROVIDER_NAME = "<def>";
    public static void registerDefaultProvider(Provider p){
        registerProvider(DEFAULT_PROVIDER_NAME,p);
    }
    public static void registerProvider(String name,Provider p ){
        provides.put(name,p);
    }
    public static Service newInstance(String defaultProviderName){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

}
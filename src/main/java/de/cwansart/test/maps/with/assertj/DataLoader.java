package de.cwansart.test.maps.with.assertj;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DataLoader {

    private static final Map<Type, Map<Type, Double>> DATA = new HashMap<Type, Map<Type, Double>>() {{
        put(Type.NORMAL, Collections.singletonMap(Type.FIGHTING, 1.0));
        put(Type.FIGHTING, Collections.singletonMap(Type.GHOST, 0.0));
        put(Type.GHOST, Collections.singletonMap(Type.FIGHTING, 0.0));
    }};

    public static Map<Type, Map<Type, Double>> loadData() {
        return DATA;
    }
}

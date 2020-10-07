package de.cwansart.test.maps.with.assertj;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import java.util.Map;

public class DataLoaderTest {

    @Test
    public void getData() {

        Map<Type, Map<Type, Double>> data = DataLoader.loadData();
        assertThat(data).hasSize(3);
        assertThat(data).containsKey(Type.NORMAL);
        assertThat(data).containsKey(Type.FIGHTING);
        assertThat(data).containsKey(Type.GHOST);
    }
}

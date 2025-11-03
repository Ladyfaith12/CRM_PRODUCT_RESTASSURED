package Assert_Promotion;

import org.testng.annotations.DataProvider;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AssertsDataProvider {

        @DataProvider(name = "assertsPayloads")
        public static Object[][] pointPayloads() {
            Map<String, Object> filter1 = new HashMap<>();
            filter1.put("type", "basic");

            Map<String, Object> filter2 = new HashMap<>();
            filter2.put("category", "advanced");

            return new Object[][]{
                    { new AssertsPayload(Collections.emptyMap(), 2, 0) },
                    { new AssertsPayload(filter1, 5, 0) },
                    { new AssertsPayload(filter2, 10, 5) }
            };
        }
    }


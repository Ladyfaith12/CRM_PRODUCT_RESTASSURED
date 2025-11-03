package Assert_Promotion;

import java.util.Map;

public class AssertsPayload {


    public <K, V> AssertsPayload(Map<K,V> kvMap, int i, int i1) {
    }

    public class PointPayload {

        private Map<String, Object> filter;
        private int size;
        private int from;

        // Constructors
        public PointPayload() {}

        public PointPayload(Map<String, Object> filter, int size, int from) {
            this.filter = filter;
            this.size = size;
            this.from = from;
        }

        // Getters & Setters
        public Map<String, Object> getFilter() {
            return filter;
        }

        public void setFilter(Map<String, Object> filter) {
            this.filter = filter;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }
    }

}

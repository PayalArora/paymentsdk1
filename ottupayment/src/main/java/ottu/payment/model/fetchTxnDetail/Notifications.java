
package ottu.payment.model.fetchTxnDetail;

import java.util.HashMap;
import java.util.Map;



public class Notifications {

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

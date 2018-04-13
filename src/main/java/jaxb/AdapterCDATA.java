package jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class AdapterCDATA extends XmlAdapter<String, String> {
    public String unmarshal(String v) throws Exception {
        return v;
    }

    public String marshal(String v) throws Exception {
        return "<![CDATA[ " + v + " ]]>";
    }
}

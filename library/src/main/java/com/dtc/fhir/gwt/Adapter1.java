//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.dtc.fhir.gwt.extension.Constant;

public class Adapter1
    extends XmlAdapter<String, Date>
{

    private static final SimpleDateFormat format = new SimpleDateFormat(Constant.DATETIME_PATTERN);

    @Override
	public Date unmarshal(String value) {
        try {
            return format.parse(value);
        } catch (ParseException e) {
            return null;
        }
    }

    public String marshal(Date value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
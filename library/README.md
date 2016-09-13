

如何用 XML schema 產生 VO
==========================

1. 在此下載[fhir-all-xsd.zip](http://hl7.org/fhir/fhir-all-xsd.zip)，FHIR schema 並解壓縮。
1. 在此下載[jaxb-ri-2.2.7.zip](https://jaxb.java.net/2.2.7/)，jaxb 執行檔，解壓縮後設定環境變數。
1. 複製 `library/src/main/resources/binding.xml` 檔案至 `fhir-all-xsd` 目錄。
1. 移動到 `fhir-all-xsd` 目錄下。
1. 新增目錄 `src`。
1. 執行指令：`xjc -p com.dtc.fhir.gwt -b binding.xml fhir-all.xsd -d src`

修改產生的 VO
=============

1. 為 `class Element` 和 `class Resource` 實作 `序列化`。  

```
	class Element implements Serializable
```
```
	class Resource implements Serializable
```

2. 修正時間無法 unmarshal 之問題  
在 `class Adapter1` 的 `method unmarshal(String value)` 無法正確轉換成 Date。修改方式如下：
```
    private static final SimpleDateFormat format = new SimpleDateFormat(Constant.DATETIME_PATTERN);

    public Date unmarshal(String value) {
        try {
            return format.parse(value);
        } catch (ParseException e) {
            return null;
        }
    }
	
	public class Constant {
		/** FHIR 的時間字串格式 */
		public static final String DATETIME_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

		//XXX 是否要提供 GWT 的 DateTimeFormat？
	}
```




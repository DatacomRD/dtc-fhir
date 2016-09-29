

如何用 XML schema 產生 VO
==========================

1. 在此下載[fhir-all-xsd.zip](http://hl7.org/fhir/fhir-all-xsd.zip)，FHIR schema 並解壓縮，會得到一個目錄，以下稱為 `blahblah`。
1. 在此下載[jaxb-ri-2.2.7.zip](https://jaxb.java.net/2.2.7/)，jaxb 執行檔，解壓縮後設定環境變數。
1. 複製 `library/src/main/resources/binding.xml` 檔案至 `blahblah` 目錄。
1. 移動到 `blahblah` 目錄下。
1. 假設 VO 預計的 classpath 為 z:\wtf\foo，執行指令：`xjc -p com.dtc.fhir.gwt -b binding.xml fhir-all.xsd -d z:\wtf\foo`

修改產生的 VO
=============

1. 將 Element、Resource 加上 Serializable 這個 interface。  

2. 修正時間無法 unmarshal、marshal 之問題  
> 在 `class Adapter1` 的 `method unmarshal(String value)` 與 `method marshal(Date value)` 無法正確轉換成 Date。修改方式分別如下：

    ```
        private static final SimpleDateFormat format = new SimpleDateFormat(Constant.DATETIME_PATTERN);

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
            return format.format(value);
        }
    ```




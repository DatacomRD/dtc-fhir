> ###### 注意 ######
> 目前仍在實驗中，充滿了各種不自動不科學不明所以的步驟...... :secret:


用 XML schema 產生 VO set
=========================

1. 執行 `GetXSD`，假設路徑指到 `d:\test\xsd` 底下
1. 將 `d:\test\xsd\fhir-base.xsd` 的下列行數註解掉
	* 39
	* 507～511
1. 將 `resources/binding.xml` 複製到 `d:\test` 下
1. 在 `d:\test` 下執行 `xjc -p com.dtc.fhir.gwt.vo -b binding.xml xsd/fhir-all.xsd`
	* 可以用 `-d FOO_DIRECTORY` 指定產出目錄

這樣可以產生出可通過 GWT compile、gwt-jackson 也能正常正常運作，
但是資料結構跟 FHIR 吐出來的 JSON 不一樣。
例如 `Organization` 的 `id`，在 Java 中的型態 `Id` 這個 class，
但是在 JSON 當中只是一個字串，所以無論在 server side 用 gson 
還是 client side 用 gwt-jackson 都一樣，無法順利 unmarshal。

（好像有用 hapi 的 VO set 搭配 gson 做 unmarshal，也是卡在同樣的問題上......）
package ${packageName};

import java.io.Serializable;

public class ${className} implements Serializable {
	private static final long serialVersionUID = 1L;
	
	<@fieldContent fieldList />
	
	<#list innerList as inner>
	public static class ${inner.className} implements Serializable {
		private static final long serialVersionUID = 1L;
		
		<@fieldContent inner.fieldList />
	}
	</#list>
}

<#macro fieldContent fieldList>
	<#list fieldList as field>
	private ${field.type} ${field.name};
	public ${field.type} get${field.name?cap_first}() {
		return ${field.name};
	}
	public void set${field.name?cap_first}(${field.type} value) {
		${field.name} = value;
	}
	
	</#list>
</#macro>
package ${packageName};

import java.io.Serializable;

public class ${className} implements Serializable {
	private static final long serialVersionUID = 1L;
	
	<#list fieldList as field>
	private ${field.type} ${field.name};
	public ${field.type} get${field.name?cap_first}() {
		return ${field.name};
	}
	public void set${field.name?cap_first}(${field.type} value) {
		${field.name} = value;
	}
	
	</#list>
}
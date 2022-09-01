module com.datahub.modules{
	
	requires transitive java.annotation;
	requires transitive spring.data.commons;
	requires transitive spring.data.jpa;
    requires transitive spring.beans;
    requires transitive spring.context;
    requires transitive spring.boot;
    requires transitive spring.boot.autoconfigure;
    requires transitive lombok;
    requires transitive java.persistence;
    requires transitive java.validation;
	requires transitive spring.tx; 
    
	requires com.shared.modules;
	
    exports com.datahub.entities.commerce to com.commerce.modules;
    exports com.datahub.repositories.commerce to com.commerce.modules;
    exports com.datahub.types to com.commerce.modules;
    exports com.datahub.entities.shared;
  
    exports com.datahub.entities.users to com.userhub.modules;
    exports com.datahub.repositories.users to com.userhub.modules;

    exports com.datahub.config;
    exports com.datahub.shared;
    exports com.datahub.entities.preferences;
    exports com.datahub.repositories.preferences;
}
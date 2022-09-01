module com.commerce.modules {
	
	requires transitive com.datahub.modules;
	requires transitive com.userhub.modules;
	requires com.shared.modules;
	
	exports com.commerce.facade;
	exports com.commerce.config;
	exports com.commerce.model;
}
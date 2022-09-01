module com.userhub.modules{
	requires com.datahub.modules;
	requires com.shared.modules;
	requires org.slf4j;
	requires transitive spring.beans;
	exports com.userhub.facade;
	exports com.userhub.config;
	exports com.userhub.model;
	exports com.userhub.model.requests;
	exports com.userhub.model.response;
}
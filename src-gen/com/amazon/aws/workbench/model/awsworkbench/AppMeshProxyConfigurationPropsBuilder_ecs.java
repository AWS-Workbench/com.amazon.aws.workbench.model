/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Mesh Proxy Configuration Props Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getAppPorts_java_lang_Number_AsList <em>App Ports java lang Number As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getProxyEgressPort_java_lang_Number_ <em>Proxy Egress Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getProxyIngressPort_java_lang_Number_ <em>Proxy Ingress Port java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getEgressIgnoredIPs_java_lang_String_AsList <em>Egress Ignored IPs java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getEgressIgnoredPorts_java_lang_Number_AsList <em>Egress Ignored Ports java lang Number As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getIgnoredGid_java_lang_Number_ <em>Ignored Gid java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getIgnoredUid_java_lang_Number_ <em>Ignored Uid java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppMeshProxyConfigurationPropsBuilder_ecs()
 * @model
 * @generated
 */
public interface AppMeshProxyConfigurationPropsBuilder_ecs extends EObject {
	/**
	 * Returns the value of the '<em><b>App Ports java lang Number As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Ports java lang Number As List</em>' attribute.
	 * @see #setAppPorts_java_lang_Number_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppMeshProxyConfigurationPropsBuilder_ecs_AppPorts_java_lang_Number_AsList()
	 * @model
	 * @generated
	 */
	String getAppPorts_java_lang_Number_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getAppPorts_java_lang_Number_AsList <em>App Ports java lang Number As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Ports java lang Number As List</em>' attribute.
	 * @see #getAppPorts_java_lang_Number_AsList()
	 * @generated
	 */
	void setAppPorts_java_lang_Number_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Proxy Egress Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Egress Port java lang Number </em>' attribute.
	 * @see #setProxyEgressPort_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppMeshProxyConfigurationPropsBuilder_ecs_ProxyEgressPort_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getProxyEgressPort_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getProxyEgressPort_java_lang_Number_ <em>Proxy Egress Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Egress Port java lang Number </em>' attribute.
	 * @see #getProxyEgressPort_java_lang_Number_()
	 * @generated
	 */
	void setProxyEgressPort_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Proxy Ingress Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Ingress Port java lang Number </em>' attribute.
	 * @see #setProxyIngressPort_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppMeshProxyConfigurationPropsBuilder_ecs_ProxyIngressPort_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getProxyIngressPort_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getProxyIngressPort_java_lang_Number_ <em>Proxy Ingress Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Ingress Port java lang Number </em>' attribute.
	 * @see #getProxyIngressPort_java_lang_Number_()
	 * @generated
	 */
	void setProxyIngressPort_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Egress Ignored IPs java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egress Ignored IPs java lang String As List</em>' attribute.
	 * @see #setEgressIgnoredIPs_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppMeshProxyConfigurationPropsBuilder_ecs_EgressIgnoredIPs_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getEgressIgnoredIPs_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getEgressIgnoredIPs_java_lang_String_AsList <em>Egress Ignored IPs java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Egress Ignored IPs java lang String As List</em>' attribute.
	 * @see #getEgressIgnoredIPs_java_lang_String_AsList()
	 * @generated
	 */
	void setEgressIgnoredIPs_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Egress Ignored Ports java lang Number As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egress Ignored Ports java lang Number As List</em>' attribute.
	 * @see #setEgressIgnoredPorts_java_lang_Number_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppMeshProxyConfigurationPropsBuilder_ecs_EgressIgnoredPorts_java_lang_Number_AsList()
	 * @model
	 * @generated
	 */
	String getEgressIgnoredPorts_java_lang_Number_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getEgressIgnoredPorts_java_lang_Number_AsList <em>Egress Ignored Ports java lang Number As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Egress Ignored Ports java lang Number As List</em>' attribute.
	 * @see #getEgressIgnoredPorts_java_lang_Number_AsList()
	 * @generated
	 */
	void setEgressIgnoredPorts_java_lang_Number_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Ignored Gid java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignored Gid java lang Number </em>' attribute.
	 * @see #setIgnoredGid_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppMeshProxyConfigurationPropsBuilder_ecs_IgnoredGid_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getIgnoredGid_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getIgnoredGid_java_lang_Number_ <em>Ignored Gid java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignored Gid java lang Number </em>' attribute.
	 * @see #getIgnoredGid_java_lang_Number_()
	 * @generated
	 */
	void setIgnoredGid_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Ignored Uid java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignored Uid java lang Number </em>' attribute.
	 * @see #setIgnoredUid_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppMeshProxyConfigurationPropsBuilder_ecs_IgnoredUid_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getIgnoredUid_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getIgnoredUid_java_lang_Number_ <em>Ignored Uid java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignored Uid java lang Number </em>' attribute.
	 * @see #getIgnoredUid_java_lang_Number_()
	 * @generated
	 */
	void setIgnoredUid_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppMeshProxyConfigurationPropsBuilder_ecs_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppMeshProxyConfigurationPropsBuilder_ecs_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppMeshProxyConfigurationPropsBuilder_ecs_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppMeshProxyConfigurationPropsBuilder_ecs_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // AppMeshProxyConfigurationPropsBuilder_ecs

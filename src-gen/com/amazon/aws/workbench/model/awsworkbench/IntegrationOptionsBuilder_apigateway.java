/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration Options Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getCacheKeyParameters_java_lang_String_AsList <em>Cache Key Parameters java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getCacheNamespace_java_lang_String_ <em>Cache Namespace java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_ <em>Connection Type software amazon awscdk services apigateway Connection Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_ <em>Content Handling software amazon awscdk services apigateway Content Handling </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getCredentialsPassthrough_java_lang_Boolean_ <em>Credentials Passthrough java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Credentials Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList <em>Integration Responses software amazon awscdk services apigateway Integration Response As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_ <em>Passthrough Behavior software amazon awscdk services apigateway Passthrough Behavior </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getRequestParameters_java_lang_String__java_lang_String_AsMap <em>Request Parameters java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getRequestTemplates_java_lang_String__java_lang_String_AsMap <em>Request Templates java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference <em>Vpc Link With IVpc Link software amazon awscdk services apigateway IVpc Link As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway()
 * @model
 * @generated
 */
public interface IntegrationOptionsBuilder_apigateway extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Cache Key Parameters java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Key Parameters java lang String As List</em>' attribute.
	 * @see #setCacheKeyParameters_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway_CacheKeyParameters_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getCacheKeyParameters_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getCacheKeyParameters_java_lang_String_AsList <em>Cache Key Parameters java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Key Parameters java lang String As List</em>' attribute.
	 * @see #getCacheKeyParameters_java_lang_String_AsList()
	 * @generated
	 */
	void setCacheKeyParameters_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Cache Namespace java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Namespace java lang String </em>' attribute.
	 * @see #setCacheNamespace_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway_CacheNamespace_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getCacheNamespace_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getCacheNamespace_java_lang_String_ <em>Cache Namespace java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Namespace java lang String </em>' attribute.
	 * @see #getCacheNamespace_java_lang_String_()
	 * @generated
	 */
	void setCacheNamespace_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Connection Type software amazon awscdk services apigateway Connection Type </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.ConnectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Type software amazon awscdk services apigateway Connection Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ConnectionType
	 * @see #setConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_(ConnectionType)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway_ConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.ConnectionType"
	 * @generated
	 */
	ConnectionType getConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_ <em>Connection Type software amazon awscdk services apigateway Connection Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type software amazon awscdk services apigateway Connection Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ConnectionType
	 * @see #getConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_()
	 * @generated
	 */
	void setConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>Content Handling software amazon awscdk services apigateway Content Handling </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.ContentHandling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Handling software amazon awscdk services apigateway Content Handling </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ContentHandling
	 * @see #setContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_(ContentHandling)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway_ContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.ContentHandling"
	 * @generated
	 */
	ContentHandling getContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_ <em>Content Handling software amazon awscdk services apigateway Content Handling </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Handling software amazon awscdk services apigateway Content Handling </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ContentHandling
	 * @see #getContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_()
	 * @generated
	 */
	void setContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_(ContentHandling value);

	/**
	 * Returns the value of the '<em><b>Credentials Passthrough java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials Passthrough java lang Boolean </em>' attribute.
	 * @see #setCredentialsPassthrough_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway_CredentialsPassthrough_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getCredentialsPassthrough_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getCredentialsPassthrough_java_lang_Boolean_ <em>Credentials Passthrough java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentials Passthrough java lang Boolean </em>' attribute.
	 * @see #getCredentialsPassthrough_java_lang_Boolean_()
	 * @generated
	 */
	void setCredentialsPassthrough_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Credentials Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway_CredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Credentials Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentials Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #getCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 */
	void setCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Integration Responses software amazon awscdk services apigateway Integration Response As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integration Responses software amazon awscdk services apigateway Integration Response As List</em>' attribute.
	 * @see #setIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway_IntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList()
	 * @model
	 * @generated
	 */
	String getIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList <em>Integration Responses software amazon awscdk services apigateway Integration Response As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integration Responses software amazon awscdk services apigateway Integration Response As List</em>' attribute.
	 * @see #getIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList()
	 * @generated
	 */
	void setIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Passthrough Behavior software amazon awscdk services apigateway Passthrough Behavior </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.PassthroughBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passthrough Behavior software amazon awscdk services apigateway Passthrough Behavior </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PassthroughBehavior
	 * @see #setPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_(PassthroughBehavior)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway_PassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.PassthroughBehavior"
	 * @generated
	 */
	PassthroughBehavior getPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_ <em>Passthrough Behavior software amazon awscdk services apigateway Passthrough Behavior </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passthrough Behavior software amazon awscdk services apigateway Passthrough Behavior </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PassthroughBehavior
	 * @see #getPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_()
	 * @generated
	 */
	void setPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_(
			PassthroughBehavior value);

	/**
	 * Returns the value of the '<em><b>Request Parameters java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Parameters java lang String java lang String As Map</em>' attribute.
	 * @see #setRequestParameters_java_lang_String__java_lang_String_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway_RequestParameters_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getRequestParameters_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getRequestParameters_java_lang_String__java_lang_String_AsMap <em>Request Parameters java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Parameters java lang String java lang String As Map</em>' attribute.
	 * @see #getRequestParameters_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setRequestParameters_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Request Templates java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Templates java lang String java lang String As Map</em>' attribute.
	 * @see #setRequestTemplates_java_lang_String__java_lang_String_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway_RequestTemplates_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getRequestTemplates_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getRequestTemplates_java_lang_String__java_lang_String_AsMap <em>Request Templates java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Templates java lang String java lang String As Map</em>' attribute.
	 * @see #getRequestTemplates_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setRequestTemplates_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Vpc Link With IVpc Link software amazon awscdk services apigateway IVpc Link As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc Link With IVpc Link software amazon awscdk services apigateway IVpc Link As Reference</em>' attribute.
	 * @see #setVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway_VpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference <em>Vpc Link With IVpc Link software amazon awscdk services apigateway IVpc Link As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Link With IVpc Link software amazon awscdk services apigateway IVpc Link As Reference</em>' attribute.
	 * @see #getVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference()
	 * @generated
	 */
	void setVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.IntegrationOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.IntegrationOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationOptionsBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // IntegrationOptionsBuilder_apigateway

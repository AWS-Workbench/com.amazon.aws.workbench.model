/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.ConnectionType;
import com.amazon.aws.workbench.model.awsworkbench.ContentHandling;
import com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.PassthroughBehavior;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integration Options Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationOptionsBuilder_apigatewayImpl#getCacheKeyParameters_java_lang_String_AsList <em>Cache Key Parameters java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationOptionsBuilder_apigatewayImpl#getCacheNamespace_java_lang_String_ <em>Cache Namespace java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationOptionsBuilder_apigatewayImpl#getConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_ <em>Connection Type software amazon awscdk services apigateway Connection Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationOptionsBuilder_apigatewayImpl#getContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_ <em>Content Handling software amazon awscdk services apigateway Content Handling </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationOptionsBuilder_apigatewayImpl#getCredentialsPassthrough_java_lang_Boolean_ <em>Credentials Passthrough java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationOptionsBuilder_apigatewayImpl#getCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Credentials Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationOptionsBuilder_apigatewayImpl#getIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList <em>Integration Responses software amazon awscdk services apigateway Integration Response As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationOptionsBuilder_apigatewayImpl#getPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_ <em>Passthrough Behavior software amazon awscdk services apigateway Passthrough Behavior </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationOptionsBuilder_apigatewayImpl#getRequestParameters_java_lang_String__java_lang_String_AsMap <em>Request Parameters java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationOptionsBuilder_apigatewayImpl#getRequestTemplates_java_lang_String__java_lang_String_AsMap <em>Request Templates java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationOptionsBuilder_apigatewayImpl#getVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference <em>Vpc Link With IVpc Link software amazon awscdk services apigateway IVpc Link As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationOptionsBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationOptionsBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationOptionsBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.IntegrationOptionsBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegrationOptionsBuilder_apigatewayImpl extends ServiceResourcesImpl
		implements IntegrationOptionsBuilder_apigateway {
	/**
	 * The default value of the '{@link #getCacheKeyParameters_java_lang_String_AsList() <em>Cache Key Parameters java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheKeyParameters_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheKeyParameters_java_lang_String_AsList() <em>Cache Key Parameters java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheKeyParameters_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String cacheKeyParameters_java_lang_String_AsList = CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheNamespace_java_lang_String_() <em>Cache Namespace java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheNamespace_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHE_NAMESPACE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheNamespace_java_lang_String_() <em>Cache Namespace java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheNamespace_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String cacheNamespace_java_lang_String_ = CACHE_NAMESPACE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_() <em>Connection Type software amazon awscdk services apigateway Connection Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionType CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE__EDEFAULT = ConnectionType.INTERNET;

	/**
	 * The cached value of the '{@link #getConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_() <em>Connection Type software amazon awscdk services apigateway Connection Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_()
	 * @generated
	 * @ordered
	 */
	protected ConnectionType connectionType_software_amazon_awscdk_services_apigateway_ConnectionType_ = CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_() <em>Content Handling software amazon awscdk services apigateway Content Handling </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_()
	 * @generated
	 * @ordered
	 */
	protected static final ContentHandling CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING__EDEFAULT = ContentHandling.CONVERT_TO_BINARY;

	/**
	 * The cached value of the '{@link #getContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_() <em>Content Handling software amazon awscdk services apigateway Content Handling </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_()
	 * @generated
	 * @ordered
	 */
	protected ContentHandling contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_ = CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING__EDEFAULT;

	/**
	 * The default value of the '{@link #getCredentialsPassthrough_java_lang_Boolean_() <em>Credentials Passthrough java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentialsPassthrough_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCredentialsPassthrough_java_lang_Boolean_() <em>Credentials Passthrough java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentialsPassthrough_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean credentialsPassthrough_java_lang_Boolean_ = CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Credentials Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Credentials Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String credentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList() <em>Integration Responses software amazon awscdk services apigateway Integration Response As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList() <em>Integration Responses software amazon awscdk services apigateway Integration Response As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList()
	 * @generated
	 * @ordered
	 */
	protected String integrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList = INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_() <em>Passthrough Behavior software amazon awscdk services apigateway Passthrough Behavior </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_()
	 * @generated
	 * @ordered
	 */
	protected static final PassthroughBehavior PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR__EDEFAULT = PassthroughBehavior.WHEN_NO_MATCH;

	/**
	 * The cached value of the '{@link #getPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_() <em>Passthrough Behavior software amazon awscdk services apigateway Passthrough Behavior </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_()
	 * @generated
	 * @ordered
	 */
	protected PassthroughBehavior passthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_ = PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR__EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestParameters_java_lang_String__java_lang_String_AsMap() <em>Request Parameters java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestParameters_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestParameters_java_lang_String__java_lang_String_AsMap() <em>Request Parameters java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestParameters_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String requestParameters_java_lang_String__java_lang_String_AsMap = REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestTemplates_java_lang_String__java_lang_String_AsMap() <em>Request Templates java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestTemplates_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestTemplates_java_lang_String__java_lang_String_AsMap() <em>Request Templates java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestTemplates_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String requestTemplates_java_lang_String__java_lang_String_AsMap = REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference() <em>Vpc Link With IVpc Link software amazon awscdk services apigateway IVpc Link As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference() <em>Vpc Link With IVpc Link software amazon awscdk services apigateway IVpc Link As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String vpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference = VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.IntegrationOptions";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationOptionsBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCacheKeyParameters_java_lang_String_AsList() {
		return cacheKeyParameters_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCacheKeyParameters_java_lang_String_AsList(String newCacheKeyParameters_java_lang_String_AsList) {
		String oldCacheKeyParameters_java_lang_String_AsList = cacheKeyParameters_java_lang_String_AsList;
		cacheKeyParameters_java_lang_String_AsList = newCacheKeyParameters_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST,
					oldCacheKeyParameters_java_lang_String_AsList, cacheKeyParameters_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCacheNamespace_java_lang_String_() {
		return cacheNamespace_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCacheNamespace_java_lang_String_(String newCacheNamespace_java_lang_String_) {
		String oldCacheNamespace_java_lang_String_ = cacheNamespace_java_lang_String_;
		cacheNamespace_java_lang_String_ = newCacheNamespace_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_NAMESPACE_JAVA_LANG_STRING_,
					oldCacheNamespace_java_lang_String_, cacheNamespace_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionType getConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_() {
		return connectionType_software_amazon_awscdk_services_apigateway_ConnectionType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_(
			ConnectionType newConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_) {
		ConnectionType oldConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_ = connectionType_software_amazon_awscdk_services_apigateway_ConnectionType_;
		connectionType_software_amazon_awscdk_services_apigateway_ConnectionType_ = newConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_ == null
				? CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE__EDEFAULT
				: newConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE_,
					oldConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_,
					connectionType_software_amazon_awscdk_services_apigateway_ConnectionType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentHandling getContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_() {
		return contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_(
			ContentHandling newContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_) {
		ContentHandling oldContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_ = contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_;
		contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_ = newContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_ == null
				? CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING__EDEFAULT
				: newContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING_,
					oldContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_,
					contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCredentialsPassthrough_java_lang_Boolean_() {
		return credentialsPassthrough_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredentialsPassthrough_java_lang_Boolean_(Boolean newCredentialsPassthrough_java_lang_Boolean_) {
		Boolean oldCredentialsPassthrough_java_lang_Boolean_ = credentialsPassthrough_java_lang_Boolean_;
		credentialsPassthrough_java_lang_Boolean_ = newCredentialsPassthrough_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN_,
					oldCredentialsPassthrough_java_lang_Boolean_, credentialsPassthrough_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return credentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
			String newCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference) {
		String oldCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = credentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		credentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = newCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
					oldCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference,
					credentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList() {
		return integrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList(
			String newIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList) {
		String oldIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList = integrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList;
		integrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList = newIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST,
					oldIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList,
					integrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassthroughBehavior getPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_() {
		return passthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_(
			PassthroughBehavior newPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_) {
		PassthroughBehavior oldPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_ = passthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_;
		passthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_ = newPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_ == null
				? PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR__EDEFAULT
				: newPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR_,
					oldPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_,
					passthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestParameters_java_lang_String__java_lang_String_AsMap() {
		return requestParameters_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestParameters_java_lang_String__java_lang_String_AsMap(
			String newRequestParameters_java_lang_String__java_lang_String_AsMap) {
		String oldRequestParameters_java_lang_String__java_lang_String_AsMap = requestParameters_java_lang_String__java_lang_String_AsMap;
		requestParameters_java_lang_String__java_lang_String_AsMap = newRequestParameters_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldRequestParameters_java_lang_String__java_lang_String_AsMap,
					requestParameters_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestTemplates_java_lang_String__java_lang_String_AsMap() {
		return requestTemplates_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestTemplates_java_lang_String__java_lang_String_AsMap(
			String newRequestTemplates_java_lang_String__java_lang_String_AsMap) {
		String oldRequestTemplates_java_lang_String__java_lang_String_AsMap = requestTemplates_java_lang_String__java_lang_String_AsMap;
		requestTemplates_java_lang_String__java_lang_String_AsMap = newRequestTemplates_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldRequestTemplates_java_lang_String__java_lang_String_AsMap,
					requestTemplates_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference() {
		return vpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference(
			String newVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference) {
		String oldVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference = vpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference;
		vpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference = newVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE,
					oldVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference,
					vpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST:
			return getCacheKeyParameters_java_lang_String_AsList();
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_NAMESPACE_JAVA_LANG_STRING_:
			return getCacheNamespace_java_lang_String_();
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE_:
			return getConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_();
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING_:
			return getContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_();
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN_:
			return getCredentialsPassthrough_java_lang_Boolean_();
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return getCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST:
			return getIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList();
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR_:
			return getPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_();
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getRequestParameters_java_lang_String__java_lang_String_AsMap();
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getRequestTemplates_java_lang_String__java_lang_String_AsMap();
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE:
			return getVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference();
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			return getAdditionalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST:
			setCacheKeyParameters_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_NAMESPACE_JAVA_LANG_STRING_:
			setCacheNamespace_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE_:
			setConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_((ConnectionType) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING_:
			setContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_((ContentHandling) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN_:
			setCredentialsPassthrough_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST:
			setIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList(
					(String) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR_:
			setPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_(
					(PassthroughBehavior) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setRequestParameters_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setRequestTemplates_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE:
			setVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST:
			setCacheKeyParameters_java_lang_String_AsList(CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_NAMESPACE_JAVA_LANG_STRING_:
			setCacheNamespace_java_lang_String_(CACHE_NAMESPACE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE_:
			setConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_(
					CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE__EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING_:
			setContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_(
					CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING__EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN_:
			setCredentialsPassthrough_java_lang_Boolean_(CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
					CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST:
			setIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList(
					INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR_:
			setPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_(
					PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR__EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setRequestParameters_java_lang_String__java_lang_String_AsMap(
					REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setRequestTemplates_java_lang_String__java_lang_String_AsMap(
					REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE:
			setVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference(
					VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST:
			return CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? cacheKeyParameters_java_lang_String_AsList != null
					: !CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(cacheKeyParameters_java_lang_String_AsList);
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_NAMESPACE_JAVA_LANG_STRING_:
			return CACHE_NAMESPACE_JAVA_LANG_STRING__EDEFAULT == null ? cacheNamespace_java_lang_String_ != null
					: !CACHE_NAMESPACE_JAVA_LANG_STRING__EDEFAULT.equals(cacheNamespace_java_lang_String_);
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE_:
			return connectionType_software_amazon_awscdk_services_apigateway_ConnectionType_ != CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE__EDEFAULT;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING_:
			return contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_ != CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING__EDEFAULT;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN_:
			return CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? credentialsPassthrough_java_lang_Boolean_ != null
					: !CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(credentialsPassthrough_java_lang_Boolean_);
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT == null
					? credentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference != null
					: !CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT
							.equals(credentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST:
			return INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST_EDEFAULT == null
					? integrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList != null
					: !INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST_EDEFAULT
							.equals(integrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList);
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR_:
			return passthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_ != PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR__EDEFAULT;
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? requestParameters_java_lang_String__java_lang_String_AsMap != null
					: !REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(requestParameters_java_lang_String__java_lang_String_AsMap);
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? requestTemplates_java_lang_String__java_lang_String_AsMap != null
					: !REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(requestTemplates_java_lang_String__java_lang_String_AsMap);
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE:
			return VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE_EDEFAULT == null
					? vpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference != null
					: !VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE_EDEFAULT
							.equals(vpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference);
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cacheKeyParameters_java_lang_String_AsList: ");
		result.append(cacheKeyParameters_java_lang_String_AsList);
		result.append(", cacheNamespace_java_lang_String_: ");
		result.append(cacheNamespace_java_lang_String_);
		result.append(", connectionType_software_amazon_awscdk_services_apigateway_ConnectionType_: ");
		result.append(connectionType_software_amazon_awscdk_services_apigateway_ConnectionType_);
		result.append(", contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_: ");
		result.append(contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_);
		result.append(", credentialsPassthrough_java_lang_Boolean_: ");
		result.append(credentialsPassthrough_java_lang_Boolean_);
		result.append(", credentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference: ");
		result.append(credentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		result.append(", integrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList: ");
		result.append(integrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList);
		result.append(", passthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_: ");
		result.append(passthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_);
		result.append(", requestParameters_java_lang_String__java_lang_String_AsMap: ");
		result.append(requestParameters_java_lang_String__java_lang_String_AsMap);
		result.append(", requestTemplates_java_lang_String__java_lang_String_AsMap: ");
		result.append(requestTemplates_java_lang_String__java_lang_String_AsMap);
		result.append(", vpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference: ");
		result.append(vpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //IntegrationOptionsBuilder_apigatewayImpl

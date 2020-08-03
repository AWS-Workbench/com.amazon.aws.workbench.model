/**
 */
package apigateway.impl;

import apigateway.ApiKeyPropsBuilder_apigateway;
import apigateway.ApigatewayPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Api Key Props Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.ApiKeyPropsBuilder_apigatewayImpl#getCustomerId_java_lang_String_ <em>Customer Id java lang String </em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyPropsBuilder_apigatewayImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyPropsBuilder_apigatewayImpl#getEnabled_java_lang_Boolean_ <em>Enabled java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyPropsBuilder_apigatewayImpl#getGenerateDistinctId_java_lang_Boolean_ <em>Generate Distinct Id java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyPropsBuilder_apigatewayImpl#getResources_software_amazon_awscdk_services_apigateway_RestApi_AsList <em>Resources software amazon awscdk services apigateway Rest Api As List</em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyPropsBuilder_apigatewayImpl#getApiKeyName_java_lang_String_ <em>Api Key Name java lang String </em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyPropsBuilder_apigatewayImpl#getValue_java_lang_String_ <em>Value java lang String </em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyPropsBuilder_apigatewayImpl#getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference <em>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyPropsBuilder_apigatewayImpl#getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference <em>Default Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyPropsBuilder_apigatewayImpl#getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference <em>Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyPropsBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyPropsBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyPropsBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyPropsBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApiKeyPropsBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements ApiKeyPropsBuilder_apigateway {
	/**
	 * The default value of the '{@link #getCustomerId_java_lang_String_() <em>Customer Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerId_java_lang_String_() <em>Customer Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String customerId_java_lang_String_ = CUSTOMER_ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String description_java_lang_String_ = DESCRIPTION_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabled_java_lang_Boolean_() <em>Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabled_java_lang_Boolean_() <em>Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean enabled_java_lang_Boolean_ = ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerateDistinctId_java_lang_Boolean_() <em>Generate Distinct Id java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerateDistinctId_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerateDistinctId_java_lang_Boolean_() <em>Generate Distinct Id java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerateDistinctId_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean generateDistinctId_java_lang_Boolean_ = GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getResources_software_amazon_awscdk_services_apigateway_RestApi_AsList() <em>Resources software amazon awscdk services apigateway Rest Api As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources_software_amazon_awscdk_services_apigateway_RestApi_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResources_software_amazon_awscdk_services_apigateway_RestApi_AsList() <em>Resources software amazon awscdk services apigateway Rest Api As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources_software_amazon_awscdk_services_apigateway_RestApi_AsList()
	 * @generated
	 * @ordered
	 */
	protected String resources_software_amazon_awscdk_services_apigateway_RestApi_AsList = RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getApiKeyName_java_lang_String_() <em>Api Key Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKeyName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String API_KEY_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiKeyName_java_lang_String_() <em>Api Key Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKeyName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String apiKeyName_java_lang_String_ = API_KEY_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getValue_java_lang_String_() <em>Value java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue_java_lang_String_() <em>Value java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String value_java_lang_String_ = VALUE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() <em>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() <em>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference = DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() <em>Default Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() <em>Default Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference = DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() <em>Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() <em>Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference = DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.ApiKeyProps";

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
	protected ApiKeyPropsBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.API_KEY_PROPS_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomerId_java_lang_String_() {
		return customerId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerId_java_lang_String_(String newCustomerId_java_lang_String_) {
		String oldCustomerId_java_lang_String_ = customerId_java_lang_String_;
		customerId_java_lang_String_ = newCustomerId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__CUSTOMER_ID_JAVA_LANG_STRING_,
					oldCustomerId_java_lang_String_, customerId_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription_java_lang_String_() {
		return description_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription_java_lang_String_(String newDescription_java_lang_String_) {
		String oldDescription_java_lang_String_ = description_java_lang_String_;
		description_java_lang_String_ = newDescription_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_,
					oldDescription_java_lang_String_, description_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnabled_java_lang_Boolean_() {
		return enabled_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled_java_lang_Boolean_(Boolean newEnabled_java_lang_Boolean_) {
		Boolean oldEnabled_java_lang_Boolean_ = enabled_java_lang_Boolean_;
		enabled_java_lang_Boolean_ = newEnabled_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__ENABLED_JAVA_LANG_BOOLEAN_,
					oldEnabled_java_lang_Boolean_, enabled_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getGenerateDistinctId_java_lang_Boolean_() {
		return generateDistinctId_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerateDistinctId_java_lang_Boolean_(Boolean newGenerateDistinctId_java_lang_Boolean_) {
		Boolean oldGenerateDistinctId_java_lang_Boolean_ = generateDistinctId_java_lang_Boolean_;
		generateDistinctId_java_lang_Boolean_ = newGenerateDistinctId_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN_,
					oldGenerateDistinctId_java_lang_Boolean_, generateDistinctId_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResources_software_amazon_awscdk_services_apigateway_RestApi_AsList() {
		return resources_software_amazon_awscdk_services_apigateway_RestApi_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResources_software_amazon_awscdk_services_apigateway_RestApi_AsList(
			String newResources_software_amazon_awscdk_services_apigateway_RestApi_AsList) {
		String oldResources_software_amazon_awscdk_services_apigateway_RestApi_AsList = resources_software_amazon_awscdk_services_apigateway_RestApi_AsList;
		resources_software_amazon_awscdk_services_apigateway_RestApi_AsList = newResources_software_amazon_awscdk_services_apigateway_RestApi_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST,
					oldResources_software_amazon_awscdk_services_apigateway_RestApi_AsList,
					resources_software_amazon_awscdk_services_apigateway_RestApi_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiKeyName_java_lang_String_() {
		return apiKeyName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiKeyName_java_lang_String_(String newApiKeyName_java_lang_String_) {
		String oldApiKeyName_java_lang_String_ = apiKeyName_java_lang_String_;
		apiKeyName_java_lang_String_ = newApiKeyName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_,
					oldApiKeyName_java_lang_String_, apiKeyName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue_java_lang_String_() {
		return value_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue_java_lang_String_(String newValue_java_lang_String_) {
		String oldValue_java_lang_String_ = value_java_lang_String_;
		value_java_lang_String_ = newValue_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_,
					oldValue_java_lang_String_, value_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(
			String newDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference) {
		String oldDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference = defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference;
		defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference = newDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE,
					oldDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference,
					defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(
			String newDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference) {
		String oldDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference = defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference;
		defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference = newDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE,
					oldDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference,
					defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(
			String newDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference) {
		String oldDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference = defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference;
		defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference = newDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE,
					oldDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference,
					defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference));
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
					ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__CUSTOMER_ID_JAVA_LANG_STRING_:
			return getCustomerId_java_lang_String_();
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__ENABLED_JAVA_LANG_BOOLEAN_:
			return getEnabled_java_lang_Boolean_();
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN_:
			return getGenerateDistinctId_java_lang_Boolean_();
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST:
			return getResources_software_amazon_awscdk_services_apigateway_RestApi_AsList();
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_:
			return getApiKeyName_java_lang_String_();
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_:
			return getValue_java_lang_String_();
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE:
			return getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference();
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			return getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference();
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			return getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference();
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__CUSTOMER_ID_JAVA_LANG_STRING_:
			setCustomerId_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__ENABLED_JAVA_LANG_BOOLEAN_:
			setEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN_:
			setGenerateDistinctId_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST:
			setResources_software_amazon_awscdk_services_apigateway_RestApi_AsList((String) newValue);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_:
			setApiKeyName_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_:
			setValue_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE:
			setDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			setDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			setDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__CUSTOMER_ID_JAVA_LANG_STRING_:
			setCustomerId_java_lang_String_(CUSTOMER_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__ENABLED_JAVA_LANG_BOOLEAN_:
			setEnabled_java_lang_Boolean_(ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN_:
			setGenerateDistinctId_java_lang_Boolean_(GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST:
			setResources_software_amazon_awscdk_services_apigateway_RestApi_AsList(
					RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_:
			setApiKeyName_java_lang_String_(API_KEY_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_:
			setValue_java_lang_String_(VALUE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE:
			setDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(
					DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			setDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(
					DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			setDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(
					DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__CUSTOMER_ID_JAVA_LANG_STRING_:
			return CUSTOMER_ID_JAVA_LANG_STRING__EDEFAULT == null ? customerId_java_lang_String_ != null
					: !CUSTOMER_ID_JAVA_LANG_STRING__EDEFAULT.equals(customerId_java_lang_String_);
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__ENABLED_JAVA_LANG_BOOLEAN_:
			return ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? enabled_java_lang_Boolean_ != null
					: !ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(enabled_java_lang_Boolean_);
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN_:
			return GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? generateDistinctId_java_lang_Boolean_ != null
					: !GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN__EDEFAULT.equals(generateDistinctId_java_lang_Boolean_);
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST:
			return RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST_EDEFAULT == null
					? resources_software_amazon_awscdk_services_apigateway_RestApi_AsList != null
					: !RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST_EDEFAULT
							.equals(resources_software_amazon_awscdk_services_apigateway_RestApi_AsList);
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_:
			return API_KEY_NAME_JAVA_LANG_STRING__EDEFAULT == null ? apiKeyName_java_lang_String_ != null
					: !API_KEY_NAME_JAVA_LANG_STRING__EDEFAULT.equals(apiKeyName_java_lang_String_);
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_:
			return VALUE_JAVA_LANG_STRING__EDEFAULT == null ? value_java_lang_String_ != null
					: !VALUE_JAVA_LANG_STRING__EDEFAULT.equals(value_java_lang_String_);
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE:
			return DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference != null
					: !DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference);
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			return DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT == null
					? defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference != null
					: !DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT
							.equals(defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference);
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			return DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference != null
					: !DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference);
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (customerId_java_lang_String_: ");
		result.append(customerId_java_lang_String_);
		result.append(", description_java_lang_String_: ");
		result.append(description_java_lang_String_);
		result.append(", enabled_java_lang_Boolean_: ");
		result.append(enabled_java_lang_Boolean_);
		result.append(", generateDistinctId_java_lang_Boolean_: ");
		result.append(generateDistinctId_java_lang_Boolean_);
		result.append(", resources_software_amazon_awscdk_services_apigateway_RestApi_AsList: ");
		result.append(resources_software_amazon_awscdk_services_apigateway_RestApi_AsList);
		result.append(", apiKeyName_java_lang_String_: ");
		result.append(apiKeyName_java_lang_String_);
		result.append(", value_java_lang_String_: ");
		result.append(value_java_lang_String_);
		result.append(
				", defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference: ");
		result.append(
				defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference);
		result.append(
				", defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference: ");
		result.append(
				defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference);
		result.append(
				", defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference: ");
		result.append(
				defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference);
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

} //ApiKeyPropsBuilder_apigatewayImpl

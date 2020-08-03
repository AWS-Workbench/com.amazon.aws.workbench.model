/**
 */
package apigateway.impl;

import apigateway.ApiKeyOptionsBuilder_apigateway;
import apigateway.ApigatewayPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Api Key Options Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.ApiKeyOptionsBuilder_apigatewayImpl#getApiKeyName_java_lang_String_ <em>Api Key Name java lang String </em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyOptionsBuilder_apigatewayImpl#getValue_java_lang_String_ <em>Value java lang String </em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyOptionsBuilder_apigatewayImpl#getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference <em>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyOptionsBuilder_apigatewayImpl#getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference <em>Default Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyOptionsBuilder_apigatewayImpl#getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference <em>Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyOptionsBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyOptionsBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyOptionsBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.ApiKeyOptionsBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApiKeyOptionsBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements ApiKeyOptionsBuilder_apigateway {
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
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.ApiKeyOptions";

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
	protected ApiKeyOptionsBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.API_KEY_OPTIONS_BUILDER_APIGATEWAY;
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
					ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_,
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
					ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_,
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
					ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE,
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
					ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE,
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
					ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE,
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
					ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_:
			return getApiKeyName_java_lang_String_();
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_:
			return getValue_java_lang_String_();
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE:
			return getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference();
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			return getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference();
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			return getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference();
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_:
			setApiKeyName_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_:
			setValue_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE:
			setDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			setDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			setDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_:
			setApiKeyName_java_lang_String_(API_KEY_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_:
			setValue_java_lang_String_(VALUE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE:
			setDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(
					DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			setDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(
					DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			setDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(
					DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_:
			return API_KEY_NAME_JAVA_LANG_STRING__EDEFAULT == null ? apiKeyName_java_lang_String_ != null
					: !API_KEY_NAME_JAVA_LANG_STRING__EDEFAULT.equals(apiKeyName_java_lang_String_);
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_:
			return VALUE_JAVA_LANG_STRING__EDEFAULT == null ? value_java_lang_String_ != null
					: !VALUE_JAVA_LANG_STRING__EDEFAULT.equals(value_java_lang_String_);
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE:
			return DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference != null
					: !DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference);
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			return DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT == null
					? defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference != null
					: !DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT
							.equals(defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference);
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			return DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference != null
					: !DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference);
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (apiKeyName_java_lang_String_: ");
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

} //ApiKeyOptionsBuilder_apigatewayImpl

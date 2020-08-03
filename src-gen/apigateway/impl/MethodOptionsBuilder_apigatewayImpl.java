/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.AuthorizationType;
import apigateway.MethodOptionsBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Options Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.MethodOptionsBuilder_apigatewayImpl#getApiKeyRequired_java_lang_Boolean_ <em>Api Key Required java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.MethodOptionsBuilder_apigatewayImpl#getAuthorizationScopes_java_lang_String_AsList <em>Authorization Scopes java lang String As List</em>}</li>
 *   <li>{@link apigateway.impl.MethodOptionsBuilder_apigatewayImpl#getAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_ <em>Authorization Type software amazon awscdk services apigateway Authorization Type </em>}</li>
 *   <li>{@link apigateway.impl.MethodOptionsBuilder_apigatewayImpl#getAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference <em>Authorizer With IAuthorizer software amazon awscdk services apigateway IAuthorizer As Reference</em>}</li>
 *   <li>{@link apigateway.impl.MethodOptionsBuilder_apigatewayImpl#getMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList <em>Method Responses software amazon awscdk services apigateway Method Response As List</em>}</li>
 *   <li>{@link apigateway.impl.MethodOptionsBuilder_apigatewayImpl#getOperationName_java_lang_String_ <em>Operation Name java lang String </em>}</li>
 *   <li>{@link apigateway.impl.MethodOptionsBuilder_apigatewayImpl#getRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap <em>Request Models java lang String software amazon awscdk services apigateway IModel As Map</em>}</li>
 *   <li>{@link apigateway.impl.MethodOptionsBuilder_apigatewayImpl#getRequestParameters_java_lang_String__java_lang_Boolean_AsMap <em>Request Parameters java lang String java lang Boolean As Map</em>}</li>
 *   <li>{@link apigateway.impl.MethodOptionsBuilder_apigatewayImpl#getRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference <em>Request Validator With IRequest Validator software amazon awscdk services apigateway IRequest Validator As Reference</em>}</li>
 *   <li>{@link apigateway.impl.MethodOptionsBuilder_apigatewayImpl#getRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference <em>Request Validator Options With Request Validator Options software amazon awscdk services apigateway Request Validator Options As Reference</em>}</li>
 *   <li>{@link apigateway.impl.MethodOptionsBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.MethodOptionsBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.MethodOptionsBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.MethodOptionsBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodOptionsBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements MethodOptionsBuilder_apigateway {
	/**
	 * The default value of the '{@link #getApiKeyRequired_java_lang_Boolean_() <em>Api Key Required java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKeyRequired_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean API_KEY_REQUIRED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiKeyRequired_java_lang_Boolean_() <em>Api Key Required java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKeyRequired_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean apiKeyRequired_java_lang_Boolean_ = API_KEY_REQUIRED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorizationScopes_java_lang_String_AsList() <em>Authorization Scopes java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationScopes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORIZATION_SCOPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorizationScopes_java_lang_String_AsList() <em>Authorization Scopes java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationScopes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String authorizationScopes_java_lang_String_AsList = AUTHORIZATION_SCOPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_() <em>Authorization Type software amazon awscdk services apigateway Authorization Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_()
	 * @generated
	 * @ordered
	 */
	protected static final AuthorizationType AUTHORIZATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_AUTHORIZATION_TYPE__EDEFAULT = AuthorizationType.NONE;

	/**
	 * The cached value of the '{@link #getAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_() <em>Authorization Type software amazon awscdk services apigateway Authorization Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_()
	 * @generated
	 * @ordered
	 */
	protected AuthorizationType authorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_ = AUTHORIZATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_AUTHORIZATION_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference() <em>Authorizer With IAuthorizer software amazon awscdk services apigateway IAuthorizer As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORIZER_WITH_IAUTHORIZER_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAUTHORIZER_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference() <em>Authorizer With IAuthorizer software amazon awscdk services apigateway IAuthorizer As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String authorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference = AUTHORIZER_WITH_IAUTHORIZER_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAUTHORIZER_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList() <em>Method Responses software amazon awscdk services apigateway Method Response As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_RESPONSE_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList() <em>Method Responses software amazon awscdk services apigateway Method Response As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList()
	 * @generated
	 * @ordered
	 */
	protected String methodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList = METHOD_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_RESPONSE_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationName_java_lang_String_() <em>Operation Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationName_java_lang_String_() <em>Operation Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String operationName_java_lang_String_ = OPERATION_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap() <em>Request Models java lang String software amazon awscdk services apigateway IModel As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap() <em>Request Models java lang String software amazon awscdk services apigateway IModel As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String requestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap = REQUEST_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestParameters_java_lang_String__java_lang_Boolean_AsMap() <em>Request Parameters java lang String java lang Boolean As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestParameters_java_lang_String__java_lang_Boolean_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestParameters_java_lang_String__java_lang_Boolean_AsMap() <em>Request Parameters java lang String java lang Boolean As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestParameters_java_lang_String__java_lang_Boolean_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String requestParameters_java_lang_String__java_lang_Boolean_AsMap = REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference() <em>Request Validator With IRequest Validator software amazon awscdk services apigateway IRequest Validator As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_VALIDATOR_WITH_IREQUEST_VALIDATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREQUEST_VALIDATOR_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference() <em>Request Validator With IRequest Validator software amazon awscdk services apigateway IRequest Validator As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String requestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference = REQUEST_VALIDATOR_WITH_IREQUEST_VALIDATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREQUEST_VALIDATOR_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference() <em>Request Validator Options With Request Validator Options software amazon awscdk services apigateway Request Validator Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_VALIDATOR_OPTIONS_WITH_REQUEST_VALIDATOR_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REQUEST_VALIDATOR_OPTIONS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference() <em>Request Validator Options With Request Validator Options software amazon awscdk services apigateway Request Validator Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String requestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference = REQUEST_VALIDATOR_OPTIONS_WITH_REQUEST_VALIDATOR_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REQUEST_VALIDATOR_OPTIONS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.MethodOptions";

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
	protected MethodOptionsBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.METHOD_OPTIONS_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getApiKeyRequired_java_lang_Boolean_() {
		return apiKeyRequired_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiKeyRequired_java_lang_Boolean_(Boolean newApiKeyRequired_java_lang_Boolean_) {
		Boolean oldApiKeyRequired_java_lang_Boolean_ = apiKeyRequired_java_lang_Boolean_;
		apiKeyRequired_java_lang_Boolean_ = newApiKeyRequired_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__API_KEY_REQUIRED_JAVA_LANG_BOOLEAN_,
					oldApiKeyRequired_java_lang_Boolean_, apiKeyRequired_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthorizationScopes_java_lang_String_AsList() {
		return authorizationScopes_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizationScopes_java_lang_String_AsList(String newAuthorizationScopes_java_lang_String_AsList) {
		String oldAuthorizationScopes_java_lang_String_AsList = authorizationScopes_java_lang_String_AsList;
		authorizationScopes_java_lang_String_AsList = newAuthorizationScopes_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_SCOPES_JAVA_LANG_STRING_AS_LIST,
					oldAuthorizationScopes_java_lang_String_AsList, authorizationScopes_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorizationType getAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_() {
		return authorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_(
			AuthorizationType newAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_) {
		AuthorizationType oldAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_ = authorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_;
		authorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_ = newAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_ == null
				? AUTHORIZATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_AUTHORIZATION_TYPE__EDEFAULT
				: newAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_AUTHORIZATION_TYPE_,
					oldAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_,
					authorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference() {
		return authorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference(
			String newAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference) {
		String oldAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference = authorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference;
		authorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference = newAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZER_WITH_IAUTHORIZER_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAUTHORIZER_AS_REFERENCE,
					oldAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference,
					authorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList() {
		return methodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList(
			String newMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList) {
		String oldMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList = methodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList;
		methodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList = newMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__METHOD_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_RESPONSE_AS_LIST,
					oldMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList,
					methodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperationName_java_lang_String_() {
		return operationName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationName_java_lang_String_(String newOperationName_java_lang_String_) {
		String oldOperationName_java_lang_String_ = operationName_java_lang_String_;
		operationName_java_lang_String_ = newOperationName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__OPERATION_NAME_JAVA_LANG_STRING_,
					oldOperationName_java_lang_String_, operationName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap() {
		return requestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap(
			String newRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap) {
		String oldRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap = requestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap;
		requestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap = newRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP,
					oldRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap,
					requestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestParameters_java_lang_String__java_lang_Boolean_AsMap() {
		return requestParameters_java_lang_String__java_lang_Boolean_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestParameters_java_lang_String__java_lang_Boolean_AsMap(
			String newRequestParameters_java_lang_String__java_lang_Boolean_AsMap) {
		String oldRequestParameters_java_lang_String__java_lang_Boolean_AsMap = requestParameters_java_lang_String__java_lang_Boolean_AsMap;
		requestParameters_java_lang_String__java_lang_Boolean_AsMap = newRequestParameters_java_lang_String__java_lang_Boolean_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP,
					oldRequestParameters_java_lang_String__java_lang_Boolean_AsMap,
					requestParameters_java_lang_String__java_lang_Boolean_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference() {
		return requestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference(
			String newRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference) {
		String oldRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference = requestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference;
		requestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference = newRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_WITH_IREQUEST_VALIDATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREQUEST_VALIDATOR_AS_REFERENCE,
					oldRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference,
					requestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference() {
		return requestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference(
			String newRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference) {
		String oldRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference = requestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference;
		requestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference = newRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_OPTIONS_WITH_REQUEST_VALIDATOR_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REQUEST_VALIDATOR_OPTIONS_AS_REFERENCE,
					oldRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference,
					requestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference));
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
					ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__API_KEY_REQUIRED_JAVA_LANG_BOOLEAN_:
			return getApiKeyRequired_java_lang_Boolean_();
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_SCOPES_JAVA_LANG_STRING_AS_LIST:
			return getAuthorizationScopes_java_lang_String_AsList();
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_AUTHORIZATION_TYPE_:
			return getAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_();
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZER_WITH_IAUTHORIZER_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAUTHORIZER_AS_REFERENCE:
			return getAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference();
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__METHOD_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_RESPONSE_AS_LIST:
			return getMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList();
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__OPERATION_NAME_JAVA_LANG_STRING_:
			return getOperationName_java_lang_String_();
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP:
			return getRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap();
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP:
			return getRequestParameters_java_lang_String__java_lang_Boolean_AsMap();
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_WITH_IREQUEST_VALIDATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREQUEST_VALIDATOR_AS_REFERENCE:
			return getRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference();
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_OPTIONS_WITH_REQUEST_VALIDATOR_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REQUEST_VALIDATOR_OPTIONS_AS_REFERENCE:
			return getRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference();
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__API_KEY_REQUIRED_JAVA_LANG_BOOLEAN_:
			setApiKeyRequired_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_SCOPES_JAVA_LANG_STRING_AS_LIST:
			setAuthorizationScopes_java_lang_String_AsList((String) newValue);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_AUTHORIZATION_TYPE_:
			setAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_(
					(AuthorizationType) newValue);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZER_WITH_IAUTHORIZER_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAUTHORIZER_AS_REFERENCE:
			setAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__METHOD_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_RESPONSE_AS_LIST:
			setMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList((String) newValue);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__OPERATION_NAME_JAVA_LANG_STRING_:
			setOperationName_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP:
			setRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap(
					(String) newValue);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP:
			setRequestParameters_java_lang_String__java_lang_Boolean_AsMap((String) newValue);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_WITH_IREQUEST_VALIDATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREQUEST_VALIDATOR_AS_REFERENCE:
			setRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_OPTIONS_WITH_REQUEST_VALIDATOR_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REQUEST_VALIDATOR_OPTIONS_AS_REFERENCE:
			setRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__API_KEY_REQUIRED_JAVA_LANG_BOOLEAN_:
			setApiKeyRequired_java_lang_Boolean_(API_KEY_REQUIRED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_SCOPES_JAVA_LANG_STRING_AS_LIST:
			setAuthorizationScopes_java_lang_String_AsList(AUTHORIZATION_SCOPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_AUTHORIZATION_TYPE_:
			setAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_(
					AUTHORIZATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_AUTHORIZATION_TYPE__EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZER_WITH_IAUTHORIZER_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAUTHORIZER_AS_REFERENCE:
			setAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference(
					AUTHORIZER_WITH_IAUTHORIZER_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAUTHORIZER_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__METHOD_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_RESPONSE_AS_LIST:
			setMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList(
					METHOD_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_RESPONSE_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__OPERATION_NAME_JAVA_LANG_STRING_:
			setOperationName_java_lang_String_(OPERATION_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP:
			setRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap(
					REQUEST_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP_EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP:
			setRequestParameters_java_lang_String__java_lang_Boolean_AsMap(
					REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP_EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_WITH_IREQUEST_VALIDATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREQUEST_VALIDATOR_AS_REFERENCE:
			setRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference(
					REQUEST_VALIDATOR_WITH_IREQUEST_VALIDATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREQUEST_VALIDATOR_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_OPTIONS_WITH_REQUEST_VALIDATOR_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REQUEST_VALIDATOR_OPTIONS_AS_REFERENCE:
			setRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference(
					REQUEST_VALIDATOR_OPTIONS_WITH_REQUEST_VALIDATOR_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REQUEST_VALIDATOR_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__API_KEY_REQUIRED_JAVA_LANG_BOOLEAN_:
			return API_KEY_REQUIRED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? apiKeyRequired_java_lang_Boolean_ != null
					: !API_KEY_REQUIRED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(apiKeyRequired_java_lang_Boolean_);
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_SCOPES_JAVA_LANG_STRING_AS_LIST:
			return AUTHORIZATION_SCOPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? authorizationScopes_java_lang_String_AsList != null
					: !AUTHORIZATION_SCOPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(authorizationScopes_java_lang_String_AsList);
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_AUTHORIZATION_TYPE_:
			return authorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_ != AUTHORIZATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_AUTHORIZATION_TYPE__EDEFAULT;
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZER_WITH_IAUTHORIZER_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAUTHORIZER_AS_REFERENCE:
			return AUTHORIZER_WITH_IAUTHORIZER_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAUTHORIZER_AS_REFERENCE_EDEFAULT == null
					? authorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference != null
					: !AUTHORIZER_WITH_IAUTHORIZER_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAUTHORIZER_AS_REFERENCE_EDEFAULT
							.equals(authorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference);
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__METHOD_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_RESPONSE_AS_LIST:
			return METHOD_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_RESPONSE_AS_LIST_EDEFAULT == null
					? methodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList != null
					: !METHOD_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_RESPONSE_AS_LIST_EDEFAULT
							.equals(methodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList);
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__OPERATION_NAME_JAVA_LANG_STRING_:
			return OPERATION_NAME_JAVA_LANG_STRING__EDEFAULT == null ? operationName_java_lang_String_ != null
					: !OPERATION_NAME_JAVA_LANG_STRING__EDEFAULT.equals(operationName_java_lang_String_);
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP:
			return REQUEST_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP_EDEFAULT == null
					? requestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap != null
					: !REQUEST_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP_EDEFAULT
							.equals(requestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap);
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP:
			return REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP_EDEFAULT == null
					? requestParameters_java_lang_String__java_lang_Boolean_AsMap != null
					: !REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP_EDEFAULT
							.equals(requestParameters_java_lang_String__java_lang_Boolean_AsMap);
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_WITH_IREQUEST_VALIDATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREQUEST_VALIDATOR_AS_REFERENCE:
			return REQUEST_VALIDATOR_WITH_IREQUEST_VALIDATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREQUEST_VALIDATOR_AS_REFERENCE_EDEFAULT == null
					? requestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference != null
					: !REQUEST_VALIDATOR_WITH_IREQUEST_VALIDATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREQUEST_VALIDATOR_AS_REFERENCE_EDEFAULT
							.equals(requestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference);
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_OPTIONS_WITH_REQUEST_VALIDATOR_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REQUEST_VALIDATOR_OPTIONS_AS_REFERENCE:
			return REQUEST_VALIDATOR_OPTIONS_WITH_REQUEST_VALIDATOR_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REQUEST_VALIDATOR_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? requestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference != null
					: !REQUEST_VALIDATOR_OPTIONS_WITH_REQUEST_VALIDATOR_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REQUEST_VALIDATOR_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(requestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference);
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (apiKeyRequired_java_lang_Boolean_: ");
		result.append(apiKeyRequired_java_lang_Boolean_);
		result.append(", authorizationScopes_java_lang_String_AsList: ");
		result.append(authorizationScopes_java_lang_String_AsList);
		result.append(", authorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_: ");
		result.append(authorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_);
		result.append(
				", authorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference: ");
		result.append(authorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference);
		result.append(", methodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList: ");
		result.append(methodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList);
		result.append(", operationName_java_lang_String_: ");
		result.append(operationName_java_lang_String_);
		result.append(", requestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap: ");
		result.append(requestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap);
		result.append(", requestParameters_java_lang_String__java_lang_Boolean_AsMap: ");
		result.append(requestParameters_java_lang_String__java_lang_Boolean_AsMap);
		result.append(
				", requestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference: ");
		result.append(
				requestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference);
		result.append(
				", requestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference: ");
		result.append(
				requestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference);
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

} //MethodOptionsBuilder_apigatewayImpl

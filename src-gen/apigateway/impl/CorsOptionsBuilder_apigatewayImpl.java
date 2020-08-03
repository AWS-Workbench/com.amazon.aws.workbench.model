/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.CorsOptionsBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cors Options Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.CorsOptionsBuilder_apigatewayImpl#getAllowOrigins_java_lang_String_AsList <em>Allow Origins java lang String As List</em>}</li>
 *   <li>{@link apigateway.impl.CorsOptionsBuilder_apigatewayImpl#getAllowCredentials_java_lang_Boolean_ <em>Allow Credentials java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.CorsOptionsBuilder_apigatewayImpl#getAllowHeaders_java_lang_String_AsList <em>Allow Headers java lang String As List</em>}</li>
 *   <li>{@link apigateway.impl.CorsOptionsBuilder_apigatewayImpl#getAllowMethods_java_lang_String_AsList <em>Allow Methods java lang String As List</em>}</li>
 *   <li>{@link apigateway.impl.CorsOptionsBuilder_apigatewayImpl#getDisableCache_java_lang_Boolean_ <em>Disable Cache java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.CorsOptionsBuilder_apigatewayImpl#getExposeHeaders_java_lang_String_AsList <em>Expose Headers java lang String As List</em>}</li>
 *   <li>{@link apigateway.impl.CorsOptionsBuilder_apigatewayImpl#getMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Age With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link apigateway.impl.CorsOptionsBuilder_apigatewayImpl#getStatusCode_java_lang_Number_ <em>Status Code java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.CorsOptionsBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.CorsOptionsBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.CorsOptionsBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.CorsOptionsBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CorsOptionsBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements CorsOptionsBuilder_apigateway {
	/**
	 * The default value of the '{@link #getAllowOrigins_java_lang_String_AsList() <em>Allow Origins java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowOrigins_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_ORIGINS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowOrigins_java_lang_String_AsList() <em>Allow Origins java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowOrigins_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String allowOrigins_java_lang_String_AsList = ALLOW_ORIGINS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowCredentials_java_lang_Boolean_() <em>Allow Credentials java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowCredentials_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_CREDENTIALS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowCredentials_java_lang_Boolean_() <em>Allow Credentials java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowCredentials_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowCredentials_java_lang_Boolean_ = ALLOW_CREDENTIALS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowHeaders_java_lang_String_AsList() <em>Allow Headers java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowHeaders_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowHeaders_java_lang_String_AsList() <em>Allow Headers java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowHeaders_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String allowHeaders_java_lang_String_AsList = ALLOW_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowMethods_java_lang_String_AsList() <em>Allow Methods java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMethods_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_METHODS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowMethods_java_lang_String_AsList() <em>Allow Methods java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMethods_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String allowMethods_java_lang_String_AsList = ALLOW_METHODS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisableCache_java_lang_Boolean_() <em>Disable Cache java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableCache_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DISABLE_CACHE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisableCache_java_lang_Boolean_() <em>Disable Cache java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableCache_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean disableCache_java_lang_Boolean_ = DISABLE_CACHE_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getExposeHeaders_java_lang_String_AsList() <em>Expose Headers java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposeHeaders_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPOSE_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExposeHeaders_java_lang_String_AsList() <em>Expose Headers java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposeHeaders_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String exposeHeaders_java_lang_String_AsList = EXPOSE_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Max Age With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Max Age With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String maxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference = MAX_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusCode_java_lang_Number_() <em>Status Code java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int STATUS_CODE_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStatusCode_java_lang_Number_() <em>Status Code java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int statusCode_java_lang_Number_ = STATUS_CODE_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.CorsOptions";

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
	protected CorsOptionsBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.CORS_OPTIONS_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowOrigins_java_lang_String_AsList() {
		return allowOrigins_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowOrigins_java_lang_String_AsList(String newAllowOrigins_java_lang_String_AsList) {
		String oldAllowOrigins_java_lang_String_AsList = allowOrigins_java_lang_String_AsList;
		allowOrigins_java_lang_String_AsList = newAllowOrigins_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_ORIGINS_JAVA_LANG_STRING_AS_LIST,
					oldAllowOrigins_java_lang_String_AsList, allowOrigins_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowCredentials_java_lang_Boolean_() {
		return allowCredentials_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowCredentials_java_lang_Boolean_(Boolean newAllowCredentials_java_lang_Boolean_) {
		Boolean oldAllowCredentials_java_lang_Boolean_ = allowCredentials_java_lang_Boolean_;
		allowCredentials_java_lang_Boolean_ = newAllowCredentials_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_CREDENTIALS_JAVA_LANG_BOOLEAN_,
					oldAllowCredentials_java_lang_Boolean_, allowCredentials_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowHeaders_java_lang_String_AsList() {
		return allowHeaders_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowHeaders_java_lang_String_AsList(String newAllowHeaders_java_lang_String_AsList) {
		String oldAllowHeaders_java_lang_String_AsList = allowHeaders_java_lang_String_AsList;
		allowHeaders_java_lang_String_AsList = newAllowHeaders_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_HEADERS_JAVA_LANG_STRING_AS_LIST,
					oldAllowHeaders_java_lang_String_AsList, allowHeaders_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowMethods_java_lang_String_AsList() {
		return allowMethods_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowMethods_java_lang_String_AsList(String newAllowMethods_java_lang_String_AsList) {
		String oldAllowMethods_java_lang_String_AsList = allowMethods_java_lang_String_AsList;
		allowMethods_java_lang_String_AsList = newAllowMethods_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_METHODS_JAVA_LANG_STRING_AS_LIST,
					oldAllowMethods_java_lang_String_AsList, allowMethods_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDisableCache_java_lang_Boolean_() {
		return disableCache_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisableCache_java_lang_Boolean_(Boolean newDisableCache_java_lang_Boolean_) {
		Boolean oldDisableCache_java_lang_Boolean_ = disableCache_java_lang_Boolean_;
		disableCache_java_lang_Boolean_ = newDisableCache_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__DISABLE_CACHE_JAVA_LANG_BOOLEAN_,
					oldDisableCache_java_lang_Boolean_, disableCache_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExposeHeaders_java_lang_String_AsList() {
		return exposeHeaders_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExposeHeaders_java_lang_String_AsList(String newExposeHeaders_java_lang_String_AsList) {
		String oldExposeHeaders_java_lang_String_AsList = exposeHeaders_java_lang_String_AsList;
		exposeHeaders_java_lang_String_AsList = newExposeHeaders_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__EXPOSE_HEADERS_JAVA_LANG_STRING_AS_LIST,
					oldExposeHeaders_java_lang_String_AsList, exposeHeaders_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return maxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference = maxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		maxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference = newMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__MAX_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					maxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStatusCode_java_lang_Number_() {
		return statusCode_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusCode_java_lang_Number_(int newStatusCode_java_lang_Number_) {
		int oldStatusCode_java_lang_Number_ = statusCode_java_lang_Number_;
		statusCode_java_lang_Number_ = newStatusCode_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_NUMBER_,
					oldStatusCode_java_lang_Number_, statusCode_java_lang_Number_));
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
					ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_ORIGINS_JAVA_LANG_STRING_AS_LIST:
			return getAllowOrigins_java_lang_String_AsList();
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_CREDENTIALS_JAVA_LANG_BOOLEAN_:
			return getAllowCredentials_java_lang_Boolean_();
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_HEADERS_JAVA_LANG_STRING_AS_LIST:
			return getAllowHeaders_java_lang_String_AsList();
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_METHODS_JAVA_LANG_STRING_AS_LIST:
			return getAllowMethods_java_lang_String_AsList();
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__DISABLE_CACHE_JAVA_LANG_BOOLEAN_:
			return getDisableCache_java_lang_Boolean_();
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__EXPOSE_HEADERS_JAVA_LANG_STRING_AS_LIST:
			return getExposeHeaders_java_lang_String_AsList();
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__MAX_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_NUMBER_:
			return getStatusCode_java_lang_Number_();
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_ORIGINS_JAVA_LANG_STRING_AS_LIST:
			setAllowOrigins_java_lang_String_AsList((String) newValue);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_CREDENTIALS_JAVA_LANG_BOOLEAN_:
			setAllowCredentials_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_HEADERS_JAVA_LANG_STRING_AS_LIST:
			setAllowHeaders_java_lang_String_AsList((String) newValue);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_METHODS_JAVA_LANG_STRING_AS_LIST:
			setAllowMethods_java_lang_String_AsList((String) newValue);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__DISABLE_CACHE_JAVA_LANG_BOOLEAN_:
			setDisableCache_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__EXPOSE_HEADERS_JAVA_LANG_STRING_AS_LIST:
			setExposeHeaders_java_lang_String_AsList((String) newValue);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__MAX_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_NUMBER_:
			setStatusCode_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_ORIGINS_JAVA_LANG_STRING_AS_LIST:
			setAllowOrigins_java_lang_String_AsList(ALLOW_ORIGINS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_CREDENTIALS_JAVA_LANG_BOOLEAN_:
			setAllowCredentials_java_lang_Boolean_(ALLOW_CREDENTIALS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_HEADERS_JAVA_LANG_STRING_AS_LIST:
			setAllowHeaders_java_lang_String_AsList(ALLOW_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_METHODS_JAVA_LANG_STRING_AS_LIST:
			setAllowMethods_java_lang_String_AsList(ALLOW_METHODS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__DISABLE_CACHE_JAVA_LANG_BOOLEAN_:
			setDisableCache_java_lang_Boolean_(DISABLE_CACHE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__EXPOSE_HEADERS_JAVA_LANG_STRING_AS_LIST:
			setExposeHeaders_java_lang_String_AsList(EXPOSE_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__MAX_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					MAX_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_NUMBER_:
			setStatusCode_java_lang_Number_(STATUS_CODE_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_ORIGINS_JAVA_LANG_STRING_AS_LIST:
			return ALLOW_ORIGINS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? allowOrigins_java_lang_String_AsList != null
					: !ALLOW_ORIGINS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(allowOrigins_java_lang_String_AsList);
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_CREDENTIALS_JAVA_LANG_BOOLEAN_:
			return ALLOW_CREDENTIALS_JAVA_LANG_BOOLEAN__EDEFAULT == null ? allowCredentials_java_lang_Boolean_ != null
					: !ALLOW_CREDENTIALS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(allowCredentials_java_lang_Boolean_);
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_HEADERS_JAVA_LANG_STRING_AS_LIST:
			return ALLOW_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? allowHeaders_java_lang_String_AsList != null
					: !ALLOW_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(allowHeaders_java_lang_String_AsList);
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_METHODS_JAVA_LANG_STRING_AS_LIST:
			return ALLOW_METHODS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? allowMethods_java_lang_String_AsList != null
					: !ALLOW_METHODS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(allowMethods_java_lang_String_AsList);
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__DISABLE_CACHE_JAVA_LANG_BOOLEAN_:
			return DISABLE_CACHE_JAVA_LANG_BOOLEAN__EDEFAULT == null ? disableCache_java_lang_Boolean_ != null
					: !DISABLE_CACHE_JAVA_LANG_BOOLEAN__EDEFAULT.equals(disableCache_java_lang_Boolean_);
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__EXPOSE_HEADERS_JAVA_LANG_STRING_AS_LIST:
			return EXPOSE_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? exposeHeaders_java_lang_String_AsList != null
					: !EXPOSE_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(exposeHeaders_java_lang_String_AsList);
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__MAX_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return MAX_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? maxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !MAX_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(maxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_NUMBER_:
			return statusCode_java_lang_Number_ != STATUS_CODE_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (allowOrigins_java_lang_String_AsList: ");
		result.append(allowOrigins_java_lang_String_AsList);
		result.append(", allowCredentials_java_lang_Boolean_: ");
		result.append(allowCredentials_java_lang_Boolean_);
		result.append(", allowHeaders_java_lang_String_AsList: ");
		result.append(allowHeaders_java_lang_String_AsList);
		result.append(", allowMethods_java_lang_String_AsList: ");
		result.append(allowMethods_java_lang_String_AsList);
		result.append(", disableCache_java_lang_Boolean_: ");
		result.append(disableCache_java_lang_Boolean_);
		result.append(", exposeHeaders_java_lang_String_AsList: ");
		result.append(exposeHeaders_java_lang_String_AsList);
		result.append(", maxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(maxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", statusCode_java_lang_Number_: ");
		result.append(statusCode_java_lang_Number_);
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

} //CorsOptionsBuilder_apigatewayImpl

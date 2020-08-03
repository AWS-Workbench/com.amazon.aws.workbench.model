/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.UsagePlanBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Plan Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.UsagePlanBuilder_apigatewayImpl#getApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference <em>Api Key With IApi Key software amazon awscdk services apigateway IApi Key As Reference</em>}</li>
 *   <li>{@link apigateway.impl.UsagePlanBuilder_apigatewayImpl#getApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList <em>Api Stages software amazon awscdk services apigateway Usage Plan Per Api Stage As List</em>}</li>
 *   <li>{@link apigateway.impl.UsagePlanBuilder_apigatewayImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link apigateway.impl.UsagePlanBuilder_apigatewayImpl#getName_java_lang_String_ <em>Name java lang String </em>}</li>
 *   <li>{@link apigateway.impl.UsagePlanBuilder_apigatewayImpl#getQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference <em>Quota With Quota Settings software amazon awscdk services apigateway Quota Settings As Reference</em>}</li>
 *   <li>{@link apigateway.impl.UsagePlanBuilder_apigatewayImpl#getThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference <em>Throttle With Throttle Settings software amazon awscdk services apigateway Throttle Settings As Reference</em>}</li>
 *   <li>{@link apigateway.impl.UsagePlanBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.UsagePlanBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.UsagePlanBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.UsagePlanBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsagePlanBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements UsagePlanBuilder_apigateway {
	/**
	 * The default value of the '{@link #getApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference() <em>Api Key With IApi Key software amazon awscdk services apigateway IApi Key As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String API_KEY_WITH_IAPI_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAPI_KEY_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference() <em>Api Key With IApi Key software amazon awscdk services apigateway IApi Key As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String apiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference = API_KEY_WITH_IAPI_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAPI_KEY_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList() <em>Api Stages software amazon awscdk services apigateway Usage Plan Per Api Stage As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList() <em>Api Stages software amazon awscdk services apigateway Usage Plan Per Api Stage As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList()
	 * @generated
	 * @ordered
	 */
	protected String apiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList = API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST_EDEFAULT;

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
	 * The default value of the '{@link #getName_java_lang_String_() <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_java_lang_String_() <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String name_java_lang_String_ = NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference() <em>Quota With Quota Settings software amazon awscdk services apigateway Quota Settings As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference() <em>Quota With Quota Settings software amazon awscdk services apigateway Quota Settings As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String quotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference = QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference() <em>Throttle With Throttle Settings software amazon awscdk services apigateway Throttle Settings As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference() <em>Throttle With Throttle Settings software amazon awscdk services apigateway Throttle Settings As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference = THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.UsagePlan";

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
	protected UsagePlanBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.USAGE_PLAN_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference() {
		return apiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference(
			String newApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference) {
		String oldApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference = apiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference;
		apiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference = newApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__API_KEY_WITH_IAPI_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAPI_KEY_AS_REFERENCE,
					oldApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference,
					apiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList() {
		return apiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList(
			String newApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList) {
		String oldApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList = apiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList;
		apiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList = newApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST,
					oldApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList,
					apiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList));
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
					ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_,
					oldDescription_java_lang_String_, description_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName_java_lang_String_() {
		return name_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName_java_lang_String_(String newName_java_lang_String_) {
		String oldName_java_lang_String_ = name_java_lang_String_;
		name_java_lang_String_ = newName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__NAME_JAVA_LANG_STRING_, oldName_java_lang_String_,
					name_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference() {
		return quotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference(
			String newQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference) {
		String oldQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference = quotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference;
		quotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference = newQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE,
					oldQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference,
					quotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference() {
		return throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference(
			String newThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference) {
		String oldThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference = throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference;
		throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference = newThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE,
					oldThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference,
					throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference));
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
					ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__API_KEY_WITH_IAPI_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAPI_KEY_AS_REFERENCE:
			return getApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference();
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST:
			return getApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList();
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__NAME_JAVA_LANG_STRING_:
			return getName_java_lang_String_();
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE:
			return getQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference();
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE:
			return getThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference();
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__API_KEY_WITH_IAPI_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAPI_KEY_AS_REFERENCE:
			setApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference((String) newValue);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST:
			setApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList((String) newValue);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE:
			setQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE:
			setThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__API_KEY_WITH_IAPI_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAPI_KEY_AS_REFERENCE:
			setApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference(
					API_KEY_WITH_IAPI_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAPI_KEY_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST:
			setApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList(
					API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_(NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE:
			setQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference(
					QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE:
			setThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference(
					THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__API_KEY_WITH_IAPI_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAPI_KEY_AS_REFERENCE:
			return API_KEY_WITH_IAPI_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAPI_KEY_AS_REFERENCE_EDEFAULT == null
					? apiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference != null
					: !API_KEY_WITH_IAPI_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAPI_KEY_AS_REFERENCE_EDEFAULT
							.equals(apiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference);
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST:
			return API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST_EDEFAULT == null
					? apiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList != null
					: !API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST_EDEFAULT
							.equals(apiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList);
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__NAME_JAVA_LANG_STRING_:
			return NAME_JAVA_LANG_STRING__EDEFAULT == null ? name_java_lang_String_ != null
					: !NAME_JAVA_LANG_STRING__EDEFAULT.equals(name_java_lang_String_);
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE:
			return QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE_EDEFAULT == null
					? quotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference != null
					: !QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE_EDEFAULT
							.equals(quotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference);
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE:
			return THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE_EDEFAULT == null
					? throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference != null
					: !THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE_EDEFAULT
							.equals(throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference);
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (apiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference: ");
		result.append(apiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference);
		result.append(", apiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList: ");
		result.append(apiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList);
		result.append(", description_java_lang_String_: ");
		result.append(description_java_lang_String_);
		result.append(", name_java_lang_String_: ");
		result.append(name_java_lang_String_);
		result.append(
				", quotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference: ");
		result.append(quotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference);
		result.append(
				", throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference: ");
		result.append(
				throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference);
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

} //UsagePlanBuilder_apigatewayImpl

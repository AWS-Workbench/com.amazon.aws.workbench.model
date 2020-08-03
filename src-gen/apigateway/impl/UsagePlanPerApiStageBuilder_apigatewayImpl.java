/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.UsagePlanPerApiStageBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Plan Per Api Stage Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.UsagePlanPerApiStageBuilder_apigatewayImpl#getApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference <em>Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>}</li>
 *   <li>{@link apigateway.impl.UsagePlanPerApiStageBuilder_apigatewayImpl#getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference <em>Stage With Stage software amazon awscdk services apigateway Stage As Reference</em>}</li>
 *   <li>{@link apigateway.impl.UsagePlanPerApiStageBuilder_apigatewayImpl#getThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList <em>Throttle software amazon awscdk services apigateway Throttling Per Method As List</em>}</li>
 *   <li>{@link apigateway.impl.UsagePlanPerApiStageBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.UsagePlanPerApiStageBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.UsagePlanPerApiStageBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.UsagePlanPerApiStageBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsagePlanPerApiStageBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements UsagePlanPerApiStageBuilder_apigateway {
	/**
	 * The default value of the '{@link #getApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() <em>Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() <em>Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String apiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference = API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference() <em>Stage With Stage software amazon awscdk services apigateway Stage As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference() <em>Stage With Stage software amazon awscdk services apigateway Stage As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference = STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList() <em>Throttle software amazon awscdk services apigateway Throttling Per Method As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String THROTTLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLING_PER_METHOD_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList() <em>Throttle software amazon awscdk services apigateway Throttling Per Method As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList()
	 * @generated
	 * @ordered
	 */
	protected String throttle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList = THROTTLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLING_PER_METHOD_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage";

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
	protected UsagePlanPerApiStageBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return apiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(
			String newApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference) {
		String oldApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference = apiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference;
		apiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference = newApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE,
					oldApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference,
					apiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference() {
		return stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference(
			String newStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference) {
		String oldStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference = stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference;
		stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference = newStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE,
					oldStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference,
					stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList() {
		return throttle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList(
			String newThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList) {
		String oldThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList = throttle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList;
		throttle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList = newThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__THROTTLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLING_PER_METHOD_AS_LIST,
					oldThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList,
					throttle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList));
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
					ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier,
					identifier));
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
					ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE:
			return getApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference();
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE:
			return getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference();
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__THROTTLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLING_PER_METHOD_AS_LIST:
			return getThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList();
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE:
			setApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference((String) newValue);
			return;
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE:
			setStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference((String) newValue);
			return;
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__THROTTLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLING_PER_METHOD_AS_LIST:
			setThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList((String) newValue);
			return;
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE:
			setApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(
					API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE:
			setStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference(
					STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__THROTTLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLING_PER_METHOD_AS_LIST:
			setThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList(
					THROTTLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLING_PER_METHOD_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE:
			return API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE_EDEFAULT == null
					? apiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference != null
					: !API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE_EDEFAULT
							.equals(apiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference);
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE:
			return STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE_EDEFAULT == null
					? stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference != null
					: !STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE_EDEFAULT
							.equals(stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference);
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__THROTTLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLING_PER_METHOD_AS_LIST:
			return THROTTLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLING_PER_METHOD_AS_LIST_EDEFAULT == null
					? throttle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList != null
					: !THROTTLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLING_PER_METHOD_AS_LIST_EDEFAULT
							.equals(throttle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList);
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (apiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference: ");
		result.append(apiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference);
		result.append(", stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference: ");
		result.append(stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference);
		result.append(", throttle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList: ");
		result.append(throttle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList);
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

} //UsagePlanPerApiStageBuilder_apigatewayImpl

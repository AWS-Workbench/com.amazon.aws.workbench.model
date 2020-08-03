/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.ThrottlingPerMethodBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throttling Per Method Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.ThrottlingPerMethodBuilder_apigatewayImpl#getMethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference <em>Method With Method software amazon awscdk services apigateway Method As Reference</em>}</li>
 *   <li>{@link apigateway.impl.ThrottlingPerMethodBuilder_apigatewayImpl#getThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference <em>Throttle With Throttle Settings software amazon awscdk services apigateway Throttle Settings As Reference</em>}</li>
 *   <li>{@link apigateway.impl.ThrottlingPerMethodBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.ThrottlingPerMethodBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.ThrottlingPerMethodBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.ThrottlingPerMethodBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThrottlingPerMethodBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements ThrottlingPerMethodBuilder_apigateway {
	/**
	 * The default value of the '{@link #getMethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference() <em>Method With Method software amazon awscdk services apigateway Method As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_WITH_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference() <em>Method With Method software amazon awscdk services apigateway Method As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String methodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference = METHOD_WITH_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_AS_REFERENCE_EDEFAULT;

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
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.ThrottlingPerMethod";

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
	protected ThrottlingPerMethodBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference() {
		return methodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference(
			String newMethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference) {
		String oldMethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference = methodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference;
		methodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference = newMethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__METHOD_WITH_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_AS_REFERENCE,
					oldMethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference,
					methodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference));
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
					ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE,
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
					ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__METHOD_WITH_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_AS_REFERENCE:
			return getMethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference();
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE:
			return getThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference();
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__METHOD_WITH_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_AS_REFERENCE:
			setMethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference((String) newValue);
			return;
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE:
			setThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__METHOD_WITH_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_AS_REFERENCE:
			setMethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference(
					METHOD_WITH_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE:
			setThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference(
					THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__METHOD_WITH_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_AS_REFERENCE:
			return METHOD_WITH_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_AS_REFERENCE_EDEFAULT == null
					? methodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference != null
					: !METHOD_WITH_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_AS_REFERENCE_EDEFAULT
							.equals(methodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference);
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE:
			return THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE_EDEFAULT == null
					? throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference != null
					: !THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE_EDEFAULT
							.equals(throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference);
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (methodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference: ");
		result.append(methodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference);
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

} //ThrottlingPerMethodBuilder_apigatewayImpl

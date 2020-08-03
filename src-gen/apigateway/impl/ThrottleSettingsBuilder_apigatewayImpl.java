/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.ThrottleSettingsBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throttle Settings Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.ThrottleSettingsBuilder_apigatewayImpl#getBurstLimit_java_lang_Number_ <em>Burst Limit java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.ThrottleSettingsBuilder_apigatewayImpl#getRateLimit_java_lang_Number_ <em>Rate Limit java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.ThrottleSettingsBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.ThrottleSettingsBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.ThrottleSettingsBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.ThrottleSettingsBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThrottleSettingsBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements ThrottleSettingsBuilder_apigateway {
	/**
	 * The default value of the '{@link #getBurstLimit_java_lang_Number_() <em>Burst Limit java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstLimit_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int BURST_LIMIT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBurstLimit_java_lang_Number_() <em>Burst Limit java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstLimit_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int burstLimit_java_lang_Number_ = BURST_LIMIT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getRateLimit_java_lang_Number_() <em>Rate Limit java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateLimit_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int RATE_LIMIT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRateLimit_java_lang_Number_() <em>Rate Limit java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateLimit_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int rateLimit_java_lang_Number_ = RATE_LIMIT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.ThrottleSettings";

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
	protected ThrottleSettingsBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.THROTTLE_SETTINGS_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBurstLimit_java_lang_Number_() {
		return burstLimit_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBurstLimit_java_lang_Number_(int newBurstLimit_java_lang_Number_) {
		int oldBurstLimit_java_lang_Number_ = burstLimit_java_lang_Number_;
		burstLimit_java_lang_Number_ = newBurstLimit_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__BURST_LIMIT_JAVA_LANG_NUMBER_,
					oldBurstLimit_java_lang_Number_, burstLimit_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRateLimit_java_lang_Number_() {
		return rateLimit_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateLimit_java_lang_Number_(int newRateLimit_java_lang_Number_) {
		int oldRateLimit_java_lang_Number_ = rateLimit_java_lang_Number_;
		rateLimit_java_lang_Number_ = newRateLimit_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__RATE_LIMIT_JAVA_LANG_NUMBER_,
					oldRateLimit_java_lang_Number_, rateLimit_java_lang_Number_));
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
					ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__BURST_LIMIT_JAVA_LANG_NUMBER_:
			return getBurstLimit_java_lang_Number_();
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__RATE_LIMIT_JAVA_LANG_NUMBER_:
			return getRateLimit_java_lang_Number_();
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__BURST_LIMIT_JAVA_LANG_NUMBER_:
			setBurstLimit_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__RATE_LIMIT_JAVA_LANG_NUMBER_:
			setRateLimit_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__BURST_LIMIT_JAVA_LANG_NUMBER_:
			setBurstLimit_java_lang_Number_(BURST_LIMIT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__RATE_LIMIT_JAVA_LANG_NUMBER_:
			setRateLimit_java_lang_Number_(RATE_LIMIT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__BURST_LIMIT_JAVA_LANG_NUMBER_:
			return burstLimit_java_lang_Number_ != BURST_LIMIT_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__RATE_LIMIT_JAVA_LANG_NUMBER_:
			return rateLimit_java_lang_Number_ != RATE_LIMIT_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (burstLimit_java_lang_Number_: ");
		result.append(burstLimit_java_lang_Number_);
		result.append(", rateLimit_java_lang_Number_: ");
		result.append(rateLimit_java_lang_Number_);
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

} //ThrottleSettingsBuilder_apigatewayImpl

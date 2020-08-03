/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.Period;
import apigateway.QuotaSettingsBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quota Settings Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.QuotaSettingsBuilder_apigatewayImpl#getLimit_java_lang_Number_ <em>Limit java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.QuotaSettingsBuilder_apigatewayImpl#getOffset_java_lang_Number_ <em>Offset java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.QuotaSettingsBuilder_apigatewayImpl#getPeriod_software_amazon_awscdk_services_apigateway_Period_ <em>Period software amazon awscdk services apigateway Period </em>}</li>
 *   <li>{@link apigateway.impl.QuotaSettingsBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.QuotaSettingsBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.QuotaSettingsBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.QuotaSettingsBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuotaSettingsBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements QuotaSettingsBuilder_apigateway {
	/**
	 * The default value of the '{@link #getLimit_java_lang_Number_() <em>Limit java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMIT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimit_java_lang_Number_() <em>Limit java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int limit_java_lang_Number_ = LIMIT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset_java_lang_Number_() <em>Offset java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffset_java_lang_Number_() <em>Offset java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int offset_java_lang_Number_ = OFFSET_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod_software_amazon_awscdk_services_apigateway_Period_() <em>Period software amazon awscdk services apigateway Period </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod_software_amazon_awscdk_services_apigateway_Period_()
	 * @generated
	 * @ordered
	 */
	protected static final Period PERIOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PERIOD__EDEFAULT = Period.DAY;

	/**
	 * The cached value of the '{@link #getPeriod_software_amazon_awscdk_services_apigateway_Period_() <em>Period software amazon awscdk services apigateway Period </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod_software_amazon_awscdk_services_apigateway_Period_()
	 * @generated
	 * @ordered
	 */
	protected Period period_software_amazon_awscdk_services_apigateway_Period_ = PERIOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PERIOD__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.QuotaSettings";

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
	protected QuotaSettingsBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.QUOTA_SETTINGS_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLimit_java_lang_Number_() {
		return limit_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLimit_java_lang_Number_(int newLimit_java_lang_Number_) {
		int oldLimit_java_lang_Number_ = limit_java_lang_Number_;
		limit_java_lang_Number_ = newLimit_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__LIMIT_JAVA_LANG_NUMBER_,
					oldLimit_java_lang_Number_, limit_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOffset_java_lang_Number_() {
		return offset_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffset_java_lang_Number_(int newOffset_java_lang_Number_) {
		int oldOffset_java_lang_Number_ = offset_java_lang_Number_;
		offset_java_lang_Number_ = newOffset_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__OFFSET_JAVA_LANG_NUMBER_,
					oldOffset_java_lang_Number_, offset_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPeriod_software_amazon_awscdk_services_apigateway_Period_() {
		return period_software_amazon_awscdk_services_apigateway_Period_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriod_software_amazon_awscdk_services_apigateway_Period_(
			Period newPeriod_software_amazon_awscdk_services_apigateway_Period_) {
		Period oldPeriod_software_amazon_awscdk_services_apigateway_Period_ = period_software_amazon_awscdk_services_apigateway_Period_;
		period_software_amazon_awscdk_services_apigateway_Period_ = newPeriod_software_amazon_awscdk_services_apigateway_Period_ == null
				? PERIOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PERIOD__EDEFAULT
				: newPeriod_software_amazon_awscdk_services_apigateway_Period_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__PERIOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PERIOD_,
					oldPeriod_software_amazon_awscdk_services_apigateway_Period_,
					period_software_amazon_awscdk_services_apigateway_Period_));
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
					ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__LIMIT_JAVA_LANG_NUMBER_:
			return getLimit_java_lang_Number_();
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__OFFSET_JAVA_LANG_NUMBER_:
			return getOffset_java_lang_Number_();
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__PERIOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PERIOD_:
			return getPeriod_software_amazon_awscdk_services_apigateway_Period_();
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__LIMIT_JAVA_LANG_NUMBER_:
			setLimit_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__OFFSET_JAVA_LANG_NUMBER_:
			setOffset_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__PERIOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PERIOD_:
			setPeriod_software_amazon_awscdk_services_apigateway_Period_((Period) newValue);
			return;
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__LIMIT_JAVA_LANG_NUMBER_:
			setLimit_java_lang_Number_(LIMIT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__OFFSET_JAVA_LANG_NUMBER_:
			setOffset_java_lang_Number_(OFFSET_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__PERIOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PERIOD_:
			setPeriod_software_amazon_awscdk_services_apigateway_Period_(
					PERIOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PERIOD__EDEFAULT);
			return;
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__LIMIT_JAVA_LANG_NUMBER_:
			return limit_java_lang_Number_ != LIMIT_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__OFFSET_JAVA_LANG_NUMBER_:
			return offset_java_lang_Number_ != OFFSET_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__PERIOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PERIOD_:
			return period_software_amazon_awscdk_services_apigateway_Period_ != PERIOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PERIOD__EDEFAULT;
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (limit_java_lang_Number_: ");
		result.append(limit_java_lang_Number_);
		result.append(", offset_java_lang_Number_: ");
		result.append(offset_java_lang_Number_);
		result.append(", period_software_amazon_awscdk_services_apigateway_Period_: ");
		result.append(period_software_amazon_awscdk_services_apigateway_Period_);
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

} //QuotaSettingsBuilder_apigatewayImpl

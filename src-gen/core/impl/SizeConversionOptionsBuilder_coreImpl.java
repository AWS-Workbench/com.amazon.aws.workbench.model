/**
 */
package core.impl;

import core.CorePackage;
import core.SizeConversionOptionsBuilder_core;
import core.SizeRoundingBehavior;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Size Conversion Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.SizeConversionOptionsBuilder_coreImpl#getRounding_software_amazon_awscdk_core_SizeRoundingBehavior_ <em>Rounding software amazon awscdk core Size Rounding Behavior </em>}</li>
 *   <li>{@link core.impl.SizeConversionOptionsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.SizeConversionOptionsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.SizeConversionOptionsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.SizeConversionOptionsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SizeConversionOptionsBuilder_coreImpl extends MinimalEObjectImpl.Container
		implements SizeConversionOptionsBuilder_core {
	/**
	 * The default value of the '{@link #getRounding_software_amazon_awscdk_core_SizeRoundingBehavior_() <em>Rounding software amazon awscdk core Size Rounding Behavior </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRounding_software_amazon_awscdk_core_SizeRoundingBehavior_()
	 * @generated
	 * @ordered
	 */
	protected static final SizeRoundingBehavior ROUNDING_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_ROUNDING_BEHAVIOR__EDEFAULT = SizeRoundingBehavior.FAIL;

	/**
	 * The cached value of the '{@link #getRounding_software_amazon_awscdk_core_SizeRoundingBehavior_() <em>Rounding software amazon awscdk core Size Rounding Behavior </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRounding_software_amazon_awscdk_core_SizeRoundingBehavior_()
	 * @generated
	 * @ordered
	 */
	protected SizeRoundingBehavior rounding_software_amazon_awscdk_core_SizeRoundingBehavior_ = ROUNDING_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_ROUNDING_BEHAVIOR__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.SizeConversionOptions";

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
	protected SizeConversionOptionsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SIZE_CONVERSION_OPTIONS_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SizeRoundingBehavior getRounding_software_amazon_awscdk_core_SizeRoundingBehavior_() {
		return rounding_software_amazon_awscdk_core_SizeRoundingBehavior_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRounding_software_amazon_awscdk_core_SizeRoundingBehavior_(
			SizeRoundingBehavior newRounding_software_amazon_awscdk_core_SizeRoundingBehavior_) {
		SizeRoundingBehavior oldRounding_software_amazon_awscdk_core_SizeRoundingBehavior_ = rounding_software_amazon_awscdk_core_SizeRoundingBehavior_;
		rounding_software_amazon_awscdk_core_SizeRoundingBehavior_ = newRounding_software_amazon_awscdk_core_SizeRoundingBehavior_ == null
				? ROUNDING_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_ROUNDING_BEHAVIOR__EDEFAULT
				: newRounding_software_amazon_awscdk_core_SizeRoundingBehavior_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ROUNDING_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_ROUNDING_BEHAVIOR_,
					oldRounding_software_amazon_awscdk_core_SizeRoundingBehavior_,
					rounding_software_amazon_awscdk_core_SizeRoundingBehavior_));
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
					CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__VAR_NAME, oldVarName, varName));
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
					CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
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
					CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode,
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
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ROUNDING_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_ROUNDING_BEHAVIOR_:
			return getRounding_software_amazon_awscdk_core_SizeRoundingBehavior_();
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ROUNDING_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_ROUNDING_BEHAVIOR_:
			setRounding_software_amazon_awscdk_core_SizeRoundingBehavior_((SizeRoundingBehavior) newValue);
			return;
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ROUNDING_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_ROUNDING_BEHAVIOR_:
			setRounding_software_amazon_awscdk_core_SizeRoundingBehavior_(
					ROUNDING_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_ROUNDING_BEHAVIOR__EDEFAULT);
			return;
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ROUNDING_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_ROUNDING_BEHAVIOR_:
			return rounding_software_amazon_awscdk_core_SizeRoundingBehavior_ != ROUNDING_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_ROUNDING_BEHAVIOR__EDEFAULT;
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (rounding_software_amazon_awscdk_core_SizeRoundingBehavior_: ");
		result.append(rounding_software_amazon_awscdk_core_SizeRoundingBehavior_);
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

} //SizeConversionOptionsBuilder_coreImpl

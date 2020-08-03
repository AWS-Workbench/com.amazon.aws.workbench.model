/**
 */
package dynamodb.impl;

import dynamodb.DynamodbPackage;
import dynamodb.UtilizationScalingPropsBuilder_dynamodb;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Utilization Scaling Props Builder dynamodb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dynamodb.impl.UtilizationScalingPropsBuilder_dynamodbImpl#getTargetUtilizationPercent_java_lang_Number_ <em>Target Utilization Percent java lang Number </em>}</li>
 *   <li>{@link dynamodb.impl.UtilizationScalingPropsBuilder_dynamodbImpl#getDisableScaleIn_java_lang_Boolean_ <em>Disable Scale In java lang Boolean </em>}</li>
 *   <li>{@link dynamodb.impl.UtilizationScalingPropsBuilder_dynamodbImpl#getPolicyName_java_lang_String_ <em>Policy Name java lang String </em>}</li>
 *   <li>{@link dynamodb.impl.UtilizationScalingPropsBuilder_dynamodbImpl#getScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Scale In Cooldown With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link dynamodb.impl.UtilizationScalingPropsBuilder_dynamodbImpl#getScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Scale Out Cooldown With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link dynamodb.impl.UtilizationScalingPropsBuilder_dynamodbImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link dynamodb.impl.UtilizationScalingPropsBuilder_dynamodbImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link dynamodb.impl.UtilizationScalingPropsBuilder_dynamodbImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dynamodb.impl.UtilizationScalingPropsBuilder_dynamodbImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilizationScalingPropsBuilder_dynamodbImpl extends MinimalEObjectImpl.Container
		implements UtilizationScalingPropsBuilder_dynamodb {
	/**
	 * The default value of the '{@link #getTargetUtilizationPercent_java_lang_Number_() <em>Target Utilization Percent java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUtilizationPercent_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGET_UTILIZATION_PERCENT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTargetUtilizationPercent_java_lang_Number_() <em>Target Utilization Percent java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUtilizationPercent_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int targetUtilizationPercent_java_lang_Number_ = TARGET_UTILIZATION_PERCENT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getDisableScaleIn_java_lang_Boolean_() <em>Disable Scale In java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableScaleIn_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DISABLE_SCALE_IN_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisableScaleIn_java_lang_Boolean_() <em>Disable Scale In java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableScaleIn_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean disableScaleIn_java_lang_Boolean_ = DISABLE_SCALE_IN_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyName_java_lang_String_() <em>Policy Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyName_java_lang_String_() <em>Policy Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String policyName_java_lang_String_ = POLICY_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Scale In Cooldown With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_IN_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Scale In Cooldown With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String scaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference = SCALE_IN_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Scale Out Cooldown With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_OUT_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Scale Out Cooldown With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String scaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference = SCALE_OUT_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.dynamodb.UtilizationScalingProps";

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
	protected UtilizationScalingPropsBuilder_dynamodbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamodbPackage.Literals.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTargetUtilizationPercent_java_lang_Number_() {
		return targetUtilizationPercent_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetUtilizationPercent_java_lang_Number_(int newTargetUtilizationPercent_java_lang_Number_) {
		int oldTargetUtilizationPercent_java_lang_Number_ = targetUtilizationPercent_java_lang_Number_;
		targetUtilizationPercent_java_lang_Number_ = newTargetUtilizationPercent_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__TARGET_UTILIZATION_PERCENT_JAVA_LANG_NUMBER_,
					oldTargetUtilizationPercent_java_lang_Number_, targetUtilizationPercent_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDisableScaleIn_java_lang_Boolean_() {
		return disableScaleIn_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisableScaleIn_java_lang_Boolean_(Boolean newDisableScaleIn_java_lang_Boolean_) {
		Boolean oldDisableScaleIn_java_lang_Boolean_ = disableScaleIn_java_lang_Boolean_;
		disableScaleIn_java_lang_Boolean_ = newDisableScaleIn_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__DISABLE_SCALE_IN_JAVA_LANG_BOOLEAN_,
					oldDisableScaleIn_java_lang_Boolean_, disableScaleIn_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicyName_java_lang_String_() {
		return policyName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyName_java_lang_String_(String newPolicyName_java_lang_String_) {
		String oldPolicyName_java_lang_String_ = policyName_java_lang_String_;
		policyName_java_lang_String_ = newPolicyName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__POLICY_NAME_JAVA_LANG_STRING_,
					oldPolicyName_java_lang_String_, policyName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return scaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference = scaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		scaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference = newScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_IN_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					scaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return scaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference = scaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		scaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference = newScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_OUT_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					scaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference));
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
					DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME, oldVarName, varName));
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
					DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER, oldIdentifier, identifier));
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
					DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE, oldAdditionalCode,
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
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__TARGET_UTILIZATION_PERCENT_JAVA_LANG_NUMBER_:
			return getTargetUtilizationPercent_java_lang_Number_();
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__DISABLE_SCALE_IN_JAVA_LANG_BOOLEAN_:
			return getDisableScaleIn_java_lang_Boolean_();
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__POLICY_NAME_JAVA_LANG_STRING_:
			return getPolicyName_java_lang_String_();
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_IN_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_OUT_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME:
			return getVarName();
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
			return getIdentifier();
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__TARGET_UTILIZATION_PERCENT_JAVA_LANG_NUMBER_:
			setTargetUtilizationPercent_java_lang_Number_((Integer) newValue);
			return;
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__DISABLE_SCALE_IN_JAVA_LANG_BOOLEAN_:
			setDisableScaleIn_java_lang_Boolean_((Boolean) newValue);
			return;
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__POLICY_NAME_JAVA_LANG_STRING_:
			setPolicyName_java_lang_String_((String) newValue);
			return;
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_IN_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_OUT_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME:
			setVarName((String) newValue);
			return;
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__TARGET_UTILIZATION_PERCENT_JAVA_LANG_NUMBER_:
			setTargetUtilizationPercent_java_lang_Number_(TARGET_UTILIZATION_PERCENT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__DISABLE_SCALE_IN_JAVA_LANG_BOOLEAN_:
			setDisableScaleIn_java_lang_Boolean_(DISABLE_SCALE_IN_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__POLICY_NAME_JAVA_LANG_STRING_:
			setPolicyName_java_lang_String_(POLICY_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_IN_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					SCALE_IN_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_OUT_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					SCALE_OUT_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__TARGET_UTILIZATION_PERCENT_JAVA_LANG_NUMBER_:
			return targetUtilizationPercent_java_lang_Number_ != TARGET_UTILIZATION_PERCENT_JAVA_LANG_NUMBER__EDEFAULT;
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__DISABLE_SCALE_IN_JAVA_LANG_BOOLEAN_:
			return DISABLE_SCALE_IN_JAVA_LANG_BOOLEAN__EDEFAULT == null ? disableScaleIn_java_lang_Boolean_ != null
					: !DISABLE_SCALE_IN_JAVA_LANG_BOOLEAN__EDEFAULT.equals(disableScaleIn_java_lang_Boolean_);
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__POLICY_NAME_JAVA_LANG_STRING_:
			return POLICY_NAME_JAVA_LANG_STRING__EDEFAULT == null ? policyName_java_lang_String_ != null
					: !POLICY_NAME_JAVA_LANG_STRING__EDEFAULT.equals(policyName_java_lang_String_);
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_IN_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return SCALE_IN_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? scaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !SCALE_IN_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(scaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_OUT_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return SCALE_OUT_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? scaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !SCALE_OUT_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(scaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		result.append(" (targetUtilizationPercent_java_lang_Number_: ");
		result.append(targetUtilizationPercent_java_lang_Number_);
		result.append(", disableScaleIn_java_lang_Boolean_: ");
		result.append(disableScaleIn_java_lang_Boolean_);
		result.append(", policyName_java_lang_String_: ");
		result.append(policyName_java_lang_String_);
		result.append(", scaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(scaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", scaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(scaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference);
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

} //UtilizationScalingPropsBuilder_dynamodbImpl

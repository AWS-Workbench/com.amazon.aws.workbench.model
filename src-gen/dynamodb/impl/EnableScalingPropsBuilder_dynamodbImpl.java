/**
 */
package dynamodb.impl;

import dynamodb.DynamodbPackage;
import dynamodb.EnableScalingPropsBuilder_dynamodb;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enable Scaling Props Builder dynamodb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dynamodb.impl.EnableScalingPropsBuilder_dynamodbImpl#getMaxCapacity_java_lang_Number_ <em>Max Capacity java lang Number </em>}</li>
 *   <li>{@link dynamodb.impl.EnableScalingPropsBuilder_dynamodbImpl#getMinCapacity_java_lang_Number_ <em>Min Capacity java lang Number </em>}</li>
 *   <li>{@link dynamodb.impl.EnableScalingPropsBuilder_dynamodbImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link dynamodb.impl.EnableScalingPropsBuilder_dynamodbImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link dynamodb.impl.EnableScalingPropsBuilder_dynamodbImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dynamodb.impl.EnableScalingPropsBuilder_dynamodbImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnableScalingPropsBuilder_dynamodbImpl extends MinimalEObjectImpl.Container
		implements EnableScalingPropsBuilder_dynamodb {
	/**
	 * The default value of the '{@link #getMaxCapacity_java_lang_Number_() <em>Max Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxCapacity_java_lang_Number_() <em>Max Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maxCapacity_java_lang_Number_ = MAX_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMinCapacity_java_lang_Number_() <em>Min Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinCapacity_java_lang_Number_() <em>Min Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int minCapacity_java_lang_Number_ = MIN_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.dynamodb.EnableScalingProps";

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
	protected EnableScalingPropsBuilder_dynamodbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamodbPackage.Literals.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxCapacity_java_lang_Number_() {
		return maxCapacity_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCapacity_java_lang_Number_(int newMaxCapacity_java_lang_Number_) {
		int oldMaxCapacity_java_lang_Number_ = maxCapacity_java_lang_Number_;
		maxCapacity_java_lang_Number_ = newMaxCapacity_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MAX_CAPACITY_JAVA_LANG_NUMBER_,
					oldMaxCapacity_java_lang_Number_, maxCapacity_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinCapacity_java_lang_Number_() {
		return minCapacity_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinCapacity_java_lang_Number_(int newMinCapacity_java_lang_Number_) {
		int oldMinCapacity_java_lang_Number_ = minCapacity_java_lang_Number_;
		minCapacity_java_lang_Number_ = newMinCapacity_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MIN_CAPACITY_JAVA_LANG_NUMBER_,
					oldMinCapacity_java_lang_Number_, minCapacity_java_lang_Number_));
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
					DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME, oldVarName, varName));
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
					DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER, oldIdentifier, identifier));
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
					DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE, oldAdditionalCode,
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
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MAX_CAPACITY_JAVA_LANG_NUMBER_:
			return getMaxCapacity_java_lang_Number_();
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MIN_CAPACITY_JAVA_LANG_NUMBER_:
			return getMinCapacity_java_lang_Number_();
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME:
			return getVarName();
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
			return getIdentifier();
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MAX_CAPACITY_JAVA_LANG_NUMBER_:
			setMaxCapacity_java_lang_Number_((Integer) newValue);
			return;
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MIN_CAPACITY_JAVA_LANG_NUMBER_:
			setMinCapacity_java_lang_Number_((Integer) newValue);
			return;
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME:
			setVarName((String) newValue);
			return;
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MAX_CAPACITY_JAVA_LANG_NUMBER_:
			setMaxCapacity_java_lang_Number_(MAX_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MIN_CAPACITY_JAVA_LANG_NUMBER_:
			setMinCapacity_java_lang_Number_(MIN_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MAX_CAPACITY_JAVA_LANG_NUMBER_:
			return maxCapacity_java_lang_Number_ != MAX_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MIN_CAPACITY_JAVA_LANG_NUMBER_:
			return minCapacity_java_lang_Number_ != MIN_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		result.append(" (maxCapacity_java_lang_Number_: ");
		result.append(maxCapacity_java_lang_Number_);
		result.append(", minCapacity_java_lang_Number_: ");
		result.append(minCapacity_java_lang_Number_);
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

} //EnableScalingPropsBuilder_dynamodbImpl

/**
 */
package core.impl;

import core.CorePackage;
import core.RemoveTagBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Tag Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.RemoveTagBuilder_coreImpl#getApplyToLaunchedInstances_java_lang_Boolean_ <em>Apply To Launched Instances java lang Boolean </em>}</li>
 *   <li>{@link core.impl.RemoveTagBuilder_coreImpl#getExcludeResourceTypes_java_lang_String_AsList <em>Exclude Resource Types java lang String As List</em>}</li>
 *   <li>{@link core.impl.RemoveTagBuilder_coreImpl#getIncludeResourceTypes_java_lang_String_AsList <em>Include Resource Types java lang String As List</em>}</li>
 *   <li>{@link core.impl.RemoveTagBuilder_coreImpl#getPriority_java_lang_Number_ <em>Priority java lang Number </em>}</li>
 *   <li>{@link core.impl.RemoveTagBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.RemoveTagBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.RemoveTagBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.RemoveTagBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveTagBuilder_coreImpl extends MinimalEObjectImpl.Container implements RemoveTagBuilder_core {
	/**
	 * The default value of the '{@link #getApplyToLaunchedInstances_java_lang_Boolean_() <em>Apply To Launched Instances java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyToLaunchedInstances_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplyToLaunchedInstances_java_lang_Boolean_() <em>Apply To Launched Instances java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyToLaunchedInstances_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean applyToLaunchedInstances_java_lang_Boolean_ = APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeResourceTypes_java_lang_String_AsList() <em>Exclude Resource Types java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeResourceTypes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeResourceTypes_java_lang_String_AsList() <em>Exclude Resource Types java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeResourceTypes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String excludeResourceTypes_java_lang_String_AsList = EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeResourceTypes_java_lang_String_AsList() <em>Include Resource Types java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeResourceTypes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeResourceTypes_java_lang_String_AsList() <em>Include Resource Types java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeResourceTypes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String includeResourceTypes_java_lang_String_AsList = INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority_java_lang_Number_() <em>Priority java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority_java_lang_Number_() <em>Priority java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int priority_java_lang_Number_ = PRIORITY_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.RemoveTag";

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
	protected RemoveTagBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.REMOVE_TAG_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getApplyToLaunchedInstances_java_lang_Boolean_() {
		return applyToLaunchedInstances_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplyToLaunchedInstances_java_lang_Boolean_(Boolean newApplyToLaunchedInstances_java_lang_Boolean_) {
		Boolean oldApplyToLaunchedInstances_java_lang_Boolean_ = applyToLaunchedInstances_java_lang_Boolean_;
		applyToLaunchedInstances_java_lang_Boolean_ = newApplyToLaunchedInstances_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.REMOVE_TAG_BUILDER_CORE__APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN_,
					oldApplyToLaunchedInstances_java_lang_Boolean_, applyToLaunchedInstances_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExcludeResourceTypes_java_lang_String_AsList() {
		return excludeResourceTypes_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcludeResourceTypes_java_lang_String_AsList(
			String newExcludeResourceTypes_java_lang_String_AsList) {
		String oldExcludeResourceTypes_java_lang_String_AsList = excludeResourceTypes_java_lang_String_AsList;
		excludeResourceTypes_java_lang_String_AsList = newExcludeResourceTypes_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.REMOVE_TAG_BUILDER_CORE__EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST,
					oldExcludeResourceTypes_java_lang_String_AsList, excludeResourceTypes_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIncludeResourceTypes_java_lang_String_AsList() {
		return includeResourceTypes_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeResourceTypes_java_lang_String_AsList(
			String newIncludeResourceTypes_java_lang_String_AsList) {
		String oldIncludeResourceTypes_java_lang_String_AsList = includeResourceTypes_java_lang_String_AsList;
		includeResourceTypes_java_lang_String_AsList = newIncludeResourceTypes_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.REMOVE_TAG_BUILDER_CORE__INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST,
					oldIncludeResourceTypes_java_lang_String_AsList, includeResourceTypes_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPriority_java_lang_Number_() {
		return priority_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority_java_lang_Number_(int newPriority_java_lang_Number_) {
		int oldPriority_java_lang_Number_ = priority_java_lang_Number_;
		priority_java_lang_Number_ = newPriority_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.REMOVE_TAG_BUILDER_CORE__PRIORITY_JAVA_LANG_NUMBER_, oldPriority_java_lang_Number_,
					priority_java_lang_Number_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REMOVE_TAG_BUILDER_CORE__VAR_NAME,
					oldVarName, varName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REMOVE_TAG_BUILDER_CORE__IDENTIFIER,
					oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REMOVE_TAG_BUILDER_CORE__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CorePackage.REMOVE_TAG_BUILDER_CORE__APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN_:
			return getApplyToLaunchedInstances_java_lang_Boolean_();
		case CorePackage.REMOVE_TAG_BUILDER_CORE__EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST:
			return getExcludeResourceTypes_java_lang_String_AsList();
		case CorePackage.REMOVE_TAG_BUILDER_CORE__INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST:
			return getIncludeResourceTypes_java_lang_String_AsList();
		case CorePackage.REMOVE_TAG_BUILDER_CORE__PRIORITY_JAVA_LANG_NUMBER_:
			return getPriority_java_lang_Number_();
		case CorePackage.REMOVE_TAG_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.REMOVE_TAG_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.REMOVE_TAG_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.REMOVE_TAG_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.REMOVE_TAG_BUILDER_CORE__APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN_:
			setApplyToLaunchedInstances_java_lang_Boolean_((Boolean) newValue);
			return;
		case CorePackage.REMOVE_TAG_BUILDER_CORE__EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST:
			setExcludeResourceTypes_java_lang_String_AsList((String) newValue);
			return;
		case CorePackage.REMOVE_TAG_BUILDER_CORE__INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST:
			setIncludeResourceTypes_java_lang_String_AsList((String) newValue);
			return;
		case CorePackage.REMOVE_TAG_BUILDER_CORE__PRIORITY_JAVA_LANG_NUMBER_:
			setPriority_java_lang_Number_((Integer) newValue);
			return;
		case CorePackage.REMOVE_TAG_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.REMOVE_TAG_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.REMOVE_TAG_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.REMOVE_TAG_BUILDER_CORE__APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN_:
			setApplyToLaunchedInstances_java_lang_Boolean_(APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case CorePackage.REMOVE_TAG_BUILDER_CORE__EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST:
			setExcludeResourceTypes_java_lang_String_AsList(EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case CorePackage.REMOVE_TAG_BUILDER_CORE__INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST:
			setIncludeResourceTypes_java_lang_String_AsList(INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case CorePackage.REMOVE_TAG_BUILDER_CORE__PRIORITY_JAVA_LANG_NUMBER_:
			setPriority_java_lang_Number_(PRIORITY_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case CorePackage.REMOVE_TAG_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.REMOVE_TAG_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.REMOVE_TAG_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.REMOVE_TAG_BUILDER_CORE__APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN_:
			return APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? applyToLaunchedInstances_java_lang_Boolean_ != null
					: !APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(applyToLaunchedInstances_java_lang_Boolean_);
		case CorePackage.REMOVE_TAG_BUILDER_CORE__EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST:
			return EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? excludeResourceTypes_java_lang_String_AsList != null
					: !EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(excludeResourceTypes_java_lang_String_AsList);
		case CorePackage.REMOVE_TAG_BUILDER_CORE__INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST:
			return INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? includeResourceTypes_java_lang_String_AsList != null
					: !INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(includeResourceTypes_java_lang_String_AsList);
		case CorePackage.REMOVE_TAG_BUILDER_CORE__PRIORITY_JAVA_LANG_NUMBER_:
			return priority_java_lang_Number_ != PRIORITY_JAVA_LANG_NUMBER__EDEFAULT;
		case CorePackage.REMOVE_TAG_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.REMOVE_TAG_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.REMOVE_TAG_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.REMOVE_TAG_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (applyToLaunchedInstances_java_lang_Boolean_: ");
		result.append(applyToLaunchedInstances_java_lang_Boolean_);
		result.append(", excludeResourceTypes_java_lang_String_AsList: ");
		result.append(excludeResourceTypes_java_lang_String_AsList);
		result.append(", includeResourceTypes_java_lang_String_AsList: ");
		result.append(includeResourceTypes_java_lang_String_AsList);
		result.append(", priority_java_lang_Number_: ");
		result.append(priority_java_lang_Number_);
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

} //RemoveTagBuilder_coreImpl

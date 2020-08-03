/**
 */
package core.impl;

import core.CorePackage;
import core.NestedStackPropsBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Stack Props Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.NestedStackPropsBuilder_coreImpl#getNotificationArns_java_lang_String_AsList <em>Notification Arns java lang String As List</em>}</li>
 *   <li>{@link core.impl.NestedStackPropsBuilder_coreImpl#getParameters_java_lang_String__java_lang_String_AsMap <em>Parameters java lang String java lang String As Map</em>}</li>
 *   <li>{@link core.impl.NestedStackPropsBuilder_coreImpl#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link core.impl.NestedStackPropsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.NestedStackPropsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.NestedStackPropsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.NestedStackPropsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedStackPropsBuilder_coreImpl extends MinimalEObjectImpl.Container
		implements NestedStackPropsBuilder_core {
	/**
	 * The default value of the '{@link #getNotificationArns_java_lang_String_AsList() <em>Notification Arns java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationArns_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotificationArns_java_lang_String_AsList() <em>Notification Arns java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationArns_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String notificationArns_java_lang_String_AsList = NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameters_java_lang_String__java_lang_String_AsMap() <em>Parameters java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameters_java_lang_String__java_lang_String_AsMap() <em>Parameters java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String parameters_java_lang_String__java_lang_String_AsMap = PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.NestedStackProps";

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
	protected NestedStackPropsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.NESTED_STACK_PROPS_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotificationArns_java_lang_String_AsList() {
		return notificationArns_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotificationArns_java_lang_String_AsList(String newNotificationArns_java_lang_String_AsList) {
		String oldNotificationArns_java_lang_String_AsList = notificationArns_java_lang_String_AsList;
		notificationArns_java_lang_String_AsList = newNotificationArns_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST,
					oldNotificationArns_java_lang_String_AsList, notificationArns_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameters_java_lang_String__java_lang_String_AsMap() {
		return parameters_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameters_java_lang_String__java_lang_String_AsMap(
			String newParameters_java_lang_String__java_lang_String_AsMap) {
		String oldParameters_java_lang_String__java_lang_String_AsMap = parameters_java_lang_String__java_lang_String_AsMap;
		parameters_java_lang_String__java_lang_String_AsMap = newParameters_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldParameters_java_lang_String__java_lang_String_AsMap,
					parameters_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = newTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
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
					CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST:
			return getNotificationArns_java_lang_String_AsList();
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getParameters_java_lang_String__java_lang_String_AsMap();
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST:
			setNotificationArns_java_lang_String_AsList((String) newValue);
			return;
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setParameters_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST:
			setNotificationArns_java_lang_String_AsList(NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setParameters_java_lang_String__java_lang_String_AsMap(
					PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST:
			return NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? notificationArns_java_lang_String_AsList != null
					: !NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(notificationArns_java_lang_String_AsList);
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? parameters_java_lang_String__java_lang_String_AsMap != null
					: !PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(parameters_java_lang_String__java_lang_String_AsMap);
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (notificationArns_java_lang_String_AsList: ");
		result.append(notificationArns_java_lang_String_AsList);
		result.append(", parameters_java_lang_String__java_lang_String_AsMap: ");
		result.append(parameters_java_lang_String__java_lang_String_AsMap);
		result.append(", timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
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

} //NestedStackPropsBuilder_coreImpl

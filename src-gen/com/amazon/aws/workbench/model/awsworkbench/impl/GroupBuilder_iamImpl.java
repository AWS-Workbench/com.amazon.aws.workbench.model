/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.GroupBuilder_iam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Builder iam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.GroupBuilder_iamImpl#getGroupName_java_lang_String_ <em>Group Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.GroupBuilder_iamImpl#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.GroupBuilder_iamImpl#getPath_java_lang_String_ <em>Path java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.GroupBuilder_iamImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.GroupBuilder_iamImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.GroupBuilder_iamImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.GroupBuilder_iamImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupBuilder_iamImpl extends ServiceResourcesImpl implements GroupBuilder_iam {
	/**
	 * The default value of the '{@link #getGroupName_java_lang_String_() <em>Group Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName_java_lang_String_() <em>Group Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String groupName_java_lang_String_ = GROUP_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList() <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList() <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList()
	 * @generated
	 * @ordered
	 */
	protected String managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList = MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath_java_lang_String_() <em>Path java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath_java_lang_String_() <em>Path java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String path_java_lang_String_ = PATH_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.iam.Group";

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
	protected GroupBuilder_iamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.GROUP_BUILDER_IAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupName_java_lang_String_() {
		return groupName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupName_java_lang_String_(String newGroupName_java_lang_String_) {
		String oldGroupName_java_lang_String_ = groupName_java_lang_String_;
		groupName_java_lang_String_ = newGroupName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.GROUP_BUILDER_IAM__GROUP_NAME_JAVA_LANG_STRING_, oldGroupName_java_lang_String_,
					groupName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList() {
		return managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(
			String newManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList) {
		String oldManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList = managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList;
		managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList = newManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.GROUP_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST,
					oldManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList,
					managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath_java_lang_String_() {
		return path_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath_java_lang_String_(String newPath_java_lang_String_) {
		String oldPath_java_lang_String_ = path_java_lang_String_;
		path_java_lang_String_ = newPath_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.GROUP_BUILDER_IAM__PATH_JAVA_LANG_STRING_, oldPath_java_lang_String_,
					path_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.GROUP_BUILDER_IAM__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.GROUP_BUILDER_IAM__IDENTIFIER,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.GROUP_BUILDER_IAM__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__GROUP_NAME_JAVA_LANG_STRING_:
			return getGroupName_java_lang_String_();
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST:
			return getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			return getPath_java_lang_String_();
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__GROUP_NAME_JAVA_LANG_STRING_:
			setGroupName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST:
			setManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			setPath_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__GROUP_NAME_JAVA_LANG_STRING_:
			setGroupName_java_lang_String_(GROUP_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST:
			setManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(
					MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			setPath_java_lang_String_(PATH_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__GROUP_NAME_JAVA_LANG_STRING_:
			return GROUP_NAME_JAVA_LANG_STRING__EDEFAULT == null ? groupName_java_lang_String_ != null
					: !GROUP_NAME_JAVA_LANG_STRING__EDEFAULT.equals(groupName_java_lang_String_);
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST:
			return MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST_EDEFAULT == null
					? managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList != null
					: !MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST_EDEFAULT
							.equals(managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList);
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			return PATH_JAVA_LANG_STRING__EDEFAULT == null ? path_java_lang_String_ != null
					: !PATH_JAVA_LANG_STRING__EDEFAULT.equals(path_java_lang_String_);
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.GROUP_BUILDER_IAM__ADDITIONAL_CODE:
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
		result.append(" (groupName_java_lang_String_: ");
		result.append(groupName_java_lang_String_);
		result.append(", managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList: ");
		result.append(managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList);
		result.append(", path_java_lang_String_: ");
		result.append(path_java_lang_String_);
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

} //GroupBuilder_iamImpl

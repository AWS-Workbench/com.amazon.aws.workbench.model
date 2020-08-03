/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.UserBuilder_iam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Builder iam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserBuilder_iamImpl#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList <em>Groups software amazon awscdk services iam IGroup As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserBuilder_iamImpl#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserBuilder_iamImpl#getPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference <em>Password With Secret Value software amazon awscdk core Secret Value As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserBuilder_iamImpl#getPasswordResetRequired_java_lang_Boolean_ <em>Password Reset Required java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserBuilder_iamImpl#getPath_java_lang_String_ <em>Path java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserBuilder_iamImpl#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference <em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserBuilder_iamImpl#getUserName_java_lang_String_ <em>User Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserBuilder_iamImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserBuilder_iamImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserBuilder_iamImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.UserBuilder_iamImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserBuilder_iamImpl extends MinimalEObjectImpl.Container implements UserBuilder_iam {
	/**
	 * The default value of the '{@link #getGroups_software_amazon_awscdk_services_iam_IGroup_AsList() <em>Groups software amazon awscdk services iam IGroup As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups_software_amazon_awscdk_services_iam_IGroup_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroups_software_amazon_awscdk_services_iam_IGroup_AsList() <em>Groups software amazon awscdk services iam IGroup As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups_software_amazon_awscdk_services_iam_IGroup_AsList()
	 * @generated
	 * @ordered
	 */
	protected String groups_software_amazon_awscdk_services_iam_IGroup_AsList = GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST_EDEFAULT;

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
	 * The default value of the '{@link #getPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference() <em>Password With Secret Value software amazon awscdk core Secret Value As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference() <em>Password With Secret Value software amazon awscdk core Secret Value As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String passwordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference = PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordResetRequired_java_lang_Boolean_() <em>Password Reset Required java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordResetRequired_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPasswordResetRequired_java_lang_Boolean_() <em>Password Reset Required java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordResetRequired_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean passwordResetRequired_java_lang_Boolean_ = PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN__EDEFAULT;

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
	 * The default value of the '{@link #getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference() <em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference() <em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference = PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName_java_lang_String_() <em>User Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName_java_lang_String_() <em>User Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String userName_java_lang_String_ = USER_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.iam.User";

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
	protected UserBuilder_iamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.USER_BUILDER_IAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroups_software_amazon_awscdk_services_iam_IGroup_AsList() {
		return groups_software_amazon_awscdk_services_iam_IGroup_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroups_software_amazon_awscdk_services_iam_IGroup_AsList(
			String newGroups_software_amazon_awscdk_services_iam_IGroup_AsList) {
		String oldGroups_software_amazon_awscdk_services_iam_IGroup_AsList = groups_software_amazon_awscdk_services_iam_IGroup_AsList;
		groups_software_amazon_awscdk_services_iam_IGroup_AsList = newGroups_software_amazon_awscdk_services_iam_IGroup_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST,
					oldGroups_software_amazon_awscdk_services_iam_IGroup_AsList,
					groups_software_amazon_awscdk_services_iam_IGroup_AsList));
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
					AwsworkbenchPackage.USER_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST,
					oldManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList,
					managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference() {
		return passwordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference(
			String newPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference) {
		String oldPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference = passwordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference;
		passwordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference = newPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_BUILDER_IAM__PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE,
					oldPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference,
					passwordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPasswordResetRequired_java_lang_Boolean_() {
		return passwordResetRequired_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPasswordResetRequired_java_lang_Boolean_(Boolean newPasswordResetRequired_java_lang_Boolean_) {
		Boolean oldPasswordResetRequired_java_lang_Boolean_ = passwordResetRequired_java_lang_Boolean_;
		passwordResetRequired_java_lang_Boolean_ = newPasswordResetRequired_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_BUILDER_IAM__PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN_,
					oldPasswordResetRequired_java_lang_Boolean_, passwordResetRequired_java_lang_Boolean_));
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
					AwsworkbenchPackage.USER_BUILDER_IAM__PATH_JAVA_LANG_STRING_, oldPath_java_lang_String_,
					path_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference() {
		return permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(
			String newPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference) {
		String oldPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference = permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference;
		permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference = newPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE,
					oldPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference,
					permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserName_java_lang_String_() {
		return userName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserName_java_lang_String_(String newUserName_java_lang_String_) {
		String oldUserName_java_lang_String_ = userName_java_lang_String_;
		userName_java_lang_String_ = newUserName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.USER_BUILDER_IAM__USER_NAME_JAVA_LANG_STRING_, oldUserName_java_lang_String_,
					userName_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.USER_BUILDER_IAM__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.USER_BUILDER_IAM__IDENTIFIER,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.USER_BUILDER_IAM__ADDITIONAL_CODE,
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
		case AwsworkbenchPackage.USER_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST:
			return getGroups_software_amazon_awscdk_services_iam_IGroup_AsList();
		case AwsworkbenchPackage.USER_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST:
			return getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();
		case AwsworkbenchPackage.USER_BUILDER_IAM__PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE:
			return getPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference();
		case AwsworkbenchPackage.USER_BUILDER_IAM__PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN_:
			return getPasswordResetRequired_java_lang_Boolean_();
		case AwsworkbenchPackage.USER_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			return getPath_java_lang_String_();
		case AwsworkbenchPackage.USER_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE:
			return getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();
		case AwsworkbenchPackage.USER_BUILDER_IAM__USER_NAME_JAVA_LANG_STRING_:
			return getUserName_java_lang_String_();
		case AwsworkbenchPackage.USER_BUILDER_IAM__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.USER_BUILDER_IAM__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.USER_BUILDER_IAM__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.USER_BUILDER_IAM__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.USER_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST:
			setGroups_software_amazon_awscdk_services_iam_IGroup_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST:
			setManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE:
			setPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN_:
			setPasswordResetRequired_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			setPath_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE:
			setPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__USER_NAME_JAVA_LANG_STRING_:
			setUserName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.USER_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST:
			setGroups_software_amazon_awscdk_services_iam_IGroup_AsList(
					GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST:
			setManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(
					MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE:
			setPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference(
					PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN_:
			setPasswordResetRequired_java_lang_Boolean_(PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			setPath_java_lang_String_(PATH_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE:
			setPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(
					PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__USER_NAME_JAVA_LANG_STRING_:
			setUserName_java_lang_String_(USER_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.USER_BUILDER_IAM__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.USER_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST:
			return GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST_EDEFAULT == null
					? groups_software_amazon_awscdk_services_iam_IGroup_AsList != null
					: !GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST_EDEFAULT
							.equals(groups_software_amazon_awscdk_services_iam_IGroup_AsList);
		case AwsworkbenchPackage.USER_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST:
			return MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST_EDEFAULT == null
					? managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList != null
					: !MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST_EDEFAULT
							.equals(managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList);
		case AwsworkbenchPackage.USER_BUILDER_IAM__PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE:
			return PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE_EDEFAULT == null
					? passwordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference != null
					: !PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE_EDEFAULT
							.equals(passwordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference);
		case AwsworkbenchPackage.USER_BUILDER_IAM__PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN_:
			return PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? passwordResetRequired_java_lang_Boolean_ != null
					: !PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(passwordResetRequired_java_lang_Boolean_);
		case AwsworkbenchPackage.USER_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			return PATH_JAVA_LANG_STRING__EDEFAULT == null ? path_java_lang_String_ != null
					: !PATH_JAVA_LANG_STRING__EDEFAULT.equals(path_java_lang_String_);
		case AwsworkbenchPackage.USER_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE:
			return PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE_EDEFAULT == null
					? permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference != null
					: !PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE_EDEFAULT
							.equals(permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference);
		case AwsworkbenchPackage.USER_BUILDER_IAM__USER_NAME_JAVA_LANG_STRING_:
			return USER_NAME_JAVA_LANG_STRING__EDEFAULT == null ? userName_java_lang_String_ != null
					: !USER_NAME_JAVA_LANG_STRING__EDEFAULT.equals(userName_java_lang_String_);
		case AwsworkbenchPackage.USER_BUILDER_IAM__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.USER_BUILDER_IAM__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.USER_BUILDER_IAM__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.USER_BUILDER_IAM__ADDITIONAL_CODE:
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
		result.append(" (groups_software_amazon_awscdk_services_iam_IGroup_AsList: ");
		result.append(groups_software_amazon_awscdk_services_iam_IGroup_AsList);
		result.append(", managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList: ");
		result.append(managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList);
		result.append(", passwordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference: ");
		result.append(passwordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference);
		result.append(", passwordResetRequired_java_lang_Boolean_: ");
		result.append(passwordResetRequired_java_lang_Boolean_);
		result.append(", path_java_lang_String_: ");
		result.append(path_java_lang_String_);
		result.append(
				", permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference: ");
		result.append(
				permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference);
		result.append(", userName_java_lang_String_: ");
		result.append(userName_java_lang_String_);
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

} //UserBuilder_iamImpl

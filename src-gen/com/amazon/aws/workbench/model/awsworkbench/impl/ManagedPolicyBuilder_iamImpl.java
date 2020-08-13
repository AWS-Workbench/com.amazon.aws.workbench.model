/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.ManagedPolicyBuilder_iam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Managed Policy Builder iam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ManagedPolicyBuilder_iamImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ManagedPolicyBuilder_iamImpl#getDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference <em>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ManagedPolicyBuilder_iamImpl#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList <em>Groups software amazon awscdk services iam IGroup As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ManagedPolicyBuilder_iamImpl#getManagedPolicyName_java_lang_String_ <em>Managed Policy Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ManagedPolicyBuilder_iamImpl#getPath_java_lang_String_ <em>Path java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ManagedPolicyBuilder_iamImpl#getRoles_software_amazon_awscdk_services_iam_IRole_AsList <em>Roles software amazon awscdk services iam IRole As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ManagedPolicyBuilder_iamImpl#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Statements software amazon awscdk services iam Policy Statement As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ManagedPolicyBuilder_iamImpl#getUsers_software_amazon_awscdk_services_iam_IUser_AsList <em>Users software amazon awscdk services iam IUser As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ManagedPolicyBuilder_iamImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ManagedPolicyBuilder_iamImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ManagedPolicyBuilder_iamImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ManagedPolicyBuilder_iamImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManagedPolicyBuilder_iamImpl extends ServiceResourcesImpl implements ManagedPolicyBuilder_iam {
	/**
	 * The default value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String description_java_lang_String_ = DESCRIPTION_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() <em>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() <em>Document With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String documentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference = DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getManagedPolicyName_java_lang_String_() <em>Managed Policy Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedPolicyName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGED_POLICY_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManagedPolicyName_java_lang_String_() <em>Managed Policy Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedPolicyName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String managedPolicyName_java_lang_String_ = MANAGED_POLICY_NAME_JAVA_LANG_STRING__EDEFAULT;

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
	 * The default value of the '{@link #getRoles_software_amazon_awscdk_services_iam_IRole_AsList() <em>Roles software amazon awscdk services iam IRole As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles_software_amazon_awscdk_services_iam_IRole_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoles_software_amazon_awscdk_services_iam_IRole_AsList() <em>Roles software amazon awscdk services iam IRole As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles_software_amazon_awscdk_services_iam_IRole_AsList()
	 * @generated
	 * @ordered
	 */
	protected String roles_software_amazon_awscdk_services_iam_IRole_AsList = ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList() <em>Statements software amazon awscdk services iam Policy Statement As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList() <em>Statements software amazon awscdk services iam Policy Statement As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @generated
	 * @ordered
	 */
	protected String statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList = STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsers_software_amazon_awscdk_services_iam_IUser_AsList() <em>Users software amazon awscdk services iam IUser As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers_software_amazon_awscdk_services_iam_IUser_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsers_software_amazon_awscdk_services_iam_IUser_AsList() <em>Users software amazon awscdk services iam IUser As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers_software_amazon_awscdk_services_iam_IUser_AsList()
	 * @generated
	 * @ordered
	 */
	protected String users_software_amazon_awscdk_services_iam_IUser_AsList = USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.iam.ManagedPolicy";

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
	protected ManagedPolicyBuilder_iamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.MANAGED_POLICY_BUILDER_IAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription_java_lang_String_() {
		return description_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription_java_lang_String_(String newDescription_java_lang_String_) {
		String oldDescription_java_lang_String_ = description_java_lang_String_;
		description_java_lang_String_ = newDescription_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_,
					oldDescription_java_lang_String_, description_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() {
		return documentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(
			String newDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference) {
		String oldDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference = documentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference;
		documentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference = newDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE,
					oldDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference,
					documentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference));
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
					AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST,
					oldGroups_software_amazon_awscdk_services_iam_IGroup_AsList,
					groups_software_amazon_awscdk_services_iam_IGroup_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManagedPolicyName_java_lang_String_() {
		return managedPolicyName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagedPolicyName_java_lang_String_(String newManagedPolicyName_java_lang_String_) {
		String oldManagedPolicyName_java_lang_String_ = managedPolicyName_java_lang_String_;
		managedPolicyName_java_lang_String_ = newManagedPolicyName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__MANAGED_POLICY_NAME_JAVA_LANG_STRING_,
					oldManagedPolicyName_java_lang_String_, managedPolicyName_java_lang_String_));
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
					AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__PATH_JAVA_LANG_STRING_, oldPath_java_lang_String_,
					path_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoles_software_amazon_awscdk_services_iam_IRole_AsList() {
		return roles_software_amazon_awscdk_services_iam_IRole_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoles_software_amazon_awscdk_services_iam_IRole_AsList(
			String newRoles_software_amazon_awscdk_services_iam_IRole_AsList) {
		String oldRoles_software_amazon_awscdk_services_iam_IRole_AsList = roles_software_amazon_awscdk_services_iam_IRole_AsList;
		roles_software_amazon_awscdk_services_iam_IRole_AsList = newRoles_software_amazon_awscdk_services_iam_IRole_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST,
					oldRoles_software_amazon_awscdk_services_iam_IRole_AsList,
					roles_software_amazon_awscdk_services_iam_IRole_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList() {
		return statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(
			String newStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList) {
		String oldStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList = statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList;
		statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList = newStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST,
					oldStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList,
					statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsers_software_amazon_awscdk_services_iam_IUser_AsList() {
		return users_software_amazon_awscdk_services_iam_IUser_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsers_software_amazon_awscdk_services_iam_IUser_AsList(
			String newUsers_software_amazon_awscdk_services_iam_IUser_AsList) {
		String oldUsers_software_amazon_awscdk_services_iam_IUser_AsList = users_software_amazon_awscdk_services_iam_IUser_AsList;
		users_software_amazon_awscdk_services_iam_IUser_AsList = newUsers_software_amazon_awscdk_services_iam_IUser_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST,
					oldUsers_software_amazon_awscdk_services_iam_IUser_AsList,
					users_software_amazon_awscdk_services_iam_IUser_AsList));
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
					AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
			return getDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference();
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST:
			return getGroups_software_amazon_awscdk_services_iam_IGroup_AsList();
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__MANAGED_POLICY_NAME_JAVA_LANG_STRING_:
			return getManagedPolicyName_java_lang_String_();
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			return getPath_java_lang_String_();
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST:
			return getRoles_software_amazon_awscdk_services_iam_IRole_AsList();
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			return getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST:
			return getUsers_software_amazon_awscdk_services_iam_IUser_AsList();
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
			setDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST:
			setGroups_software_amazon_awscdk_services_iam_IGroup_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__MANAGED_POLICY_NAME_JAVA_LANG_STRING_:
			setManagedPolicyName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			setPath_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST:
			setRoles_software_amazon_awscdk_services_iam_IRole_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			setStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST:
			setUsers_software_amazon_awscdk_services_iam_IUser_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
			setDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(
					DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST:
			setGroups_software_amazon_awscdk_services_iam_IGroup_AsList(
					GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__MANAGED_POLICY_NAME_JAVA_LANG_STRING_:
			setManagedPolicyName_java_lang_String_(MANAGED_POLICY_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			setPath_java_lang_String_(PATH_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST:
			setRoles_software_amazon_awscdk_services_iam_IRole_AsList(
					ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			setStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(
					STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST:
			setUsers_software_amazon_awscdk_services_iam_IUser_AsList(
					USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
			return DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE_EDEFAULT == null
					? documentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference != null
					: !DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE_EDEFAULT
							.equals(documentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference);
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST:
			return GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST_EDEFAULT == null
					? groups_software_amazon_awscdk_services_iam_IGroup_AsList != null
					: !GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST_EDEFAULT
							.equals(groups_software_amazon_awscdk_services_iam_IGroup_AsList);
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__MANAGED_POLICY_NAME_JAVA_LANG_STRING_:
			return MANAGED_POLICY_NAME_JAVA_LANG_STRING__EDEFAULT == null ? managedPolicyName_java_lang_String_ != null
					: !MANAGED_POLICY_NAME_JAVA_LANG_STRING__EDEFAULT.equals(managedPolicyName_java_lang_String_);
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			return PATH_JAVA_LANG_STRING__EDEFAULT == null ? path_java_lang_String_ != null
					: !PATH_JAVA_LANG_STRING__EDEFAULT.equals(path_java_lang_String_);
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST:
			return ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST_EDEFAULT == null
					? roles_software_amazon_awscdk_services_iam_IRole_AsList != null
					: !ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST_EDEFAULT
							.equals(roles_software_amazon_awscdk_services_iam_IRole_AsList);
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			return STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT == null
					? statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList != null
					: !STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT
							.equals(statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList);
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST:
			return USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST_EDEFAULT == null
					? users_software_amazon_awscdk_services_iam_IUser_AsList != null
					: !USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST_EDEFAULT
							.equals(users_software_amazon_awscdk_services_iam_IUser_AsList);
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__ADDITIONAL_CODE:
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
		result.append(" (description_java_lang_String_: ");
		result.append(description_java_lang_String_);
		result.append(", documentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference: ");
		result.append(documentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference);
		result.append(", groups_software_amazon_awscdk_services_iam_IGroup_AsList: ");
		result.append(groups_software_amazon_awscdk_services_iam_IGroup_AsList);
		result.append(", managedPolicyName_java_lang_String_: ");
		result.append(managedPolicyName_java_lang_String_);
		result.append(", path_java_lang_String_: ");
		result.append(path_java_lang_String_);
		result.append(", roles_software_amazon_awscdk_services_iam_IRole_AsList: ");
		result.append(roles_software_amazon_awscdk_services_iam_IRole_AsList);
		result.append(", statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList: ");
		result.append(statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList);
		result.append(", users_software_amazon_awscdk_services_iam_IUser_AsList: ");
		result.append(users_software_amazon_awscdk_services_iam_IUser_AsList);
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

} //ManagedPolicyBuilder_iamImpl

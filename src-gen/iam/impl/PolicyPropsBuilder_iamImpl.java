/**
 */
package iam.impl;

import iam.IamPackage;
import iam.PolicyPropsBuilder_iam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Props Builder iam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iam.impl.PolicyPropsBuilder_iamImpl#getForce_java_lang_Boolean_ <em>Force java lang Boolean </em>}</li>
 *   <li>{@link iam.impl.PolicyPropsBuilder_iamImpl#getGroups_software_amazon_awscdk_services_iam_IGroup_AsList <em>Groups software amazon awscdk services iam IGroup As List</em>}</li>
 *   <li>{@link iam.impl.PolicyPropsBuilder_iamImpl#getPolicyName_java_lang_String_ <em>Policy Name java lang String </em>}</li>
 *   <li>{@link iam.impl.PolicyPropsBuilder_iamImpl#getRoles_software_amazon_awscdk_services_iam_IRole_AsList <em>Roles software amazon awscdk services iam IRole As List</em>}</li>
 *   <li>{@link iam.impl.PolicyPropsBuilder_iamImpl#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Statements software amazon awscdk services iam Policy Statement As List</em>}</li>
 *   <li>{@link iam.impl.PolicyPropsBuilder_iamImpl#getUsers_software_amazon_awscdk_services_iam_IUser_AsList <em>Users software amazon awscdk services iam IUser As List</em>}</li>
 *   <li>{@link iam.impl.PolicyPropsBuilder_iamImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link iam.impl.PolicyPropsBuilder_iamImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link iam.impl.PolicyPropsBuilder_iamImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link iam.impl.PolicyPropsBuilder_iamImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyPropsBuilder_iamImpl extends MinimalEObjectImpl.Container implements PolicyPropsBuilder_iam {
	/**
	 * The default value of the '{@link #getForce_java_lang_Boolean_() <em>Force java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForce_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FORCE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForce_java_lang_Boolean_() <em>Force java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForce_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean force_java_lang_Boolean_ = FORCE_JAVA_LANG_BOOLEAN__EDEFAULT;

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
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.iam.PolicyProps";

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
	protected PolicyPropsBuilder_iamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IamPackage.Literals.POLICY_PROPS_BUILDER_IAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getForce_java_lang_Boolean_() {
		return force_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForce_java_lang_Boolean_(Boolean newForce_java_lang_Boolean_) {
		Boolean oldForce_java_lang_Boolean_ = force_java_lang_Boolean_;
		force_java_lang_Boolean_ = newForce_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.POLICY_PROPS_BUILDER_IAM__FORCE_JAVA_LANG_BOOLEAN_, oldForce_java_lang_Boolean_,
					force_java_lang_Boolean_));
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
					IamPackage.POLICY_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST,
					oldGroups_software_amazon_awscdk_services_iam_IGroup_AsList,
					groups_software_amazon_awscdk_services_iam_IGroup_AsList));
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
					IamPackage.POLICY_PROPS_BUILDER_IAM__POLICY_NAME_JAVA_LANG_STRING_, oldPolicyName_java_lang_String_,
					policyName_java_lang_String_));
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
					IamPackage.POLICY_PROPS_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST,
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
					IamPackage.POLICY_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST,
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
					IamPackage.POLICY_PROPS_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST,
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
			eNotify(new ENotificationImpl(this, Notification.SET, IamPackage.POLICY_PROPS_BUILDER_IAM__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, IamPackage.POLICY_PROPS_BUILDER_IAM__IDENTIFIER,
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
			eNotify(new ENotificationImpl(this, Notification.SET, IamPackage.POLICY_PROPS_BUILDER_IAM__ADDITIONAL_CODE,
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
		case IamPackage.POLICY_PROPS_BUILDER_IAM__FORCE_JAVA_LANG_BOOLEAN_:
			return getForce_java_lang_Boolean_();
		case IamPackage.POLICY_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST:
			return getGroups_software_amazon_awscdk_services_iam_IGroup_AsList();
		case IamPackage.POLICY_PROPS_BUILDER_IAM__POLICY_NAME_JAVA_LANG_STRING_:
			return getPolicyName_java_lang_String_();
		case IamPackage.POLICY_PROPS_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST:
			return getRoles_software_amazon_awscdk_services_iam_IRole_AsList();
		case IamPackage.POLICY_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			return getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();
		case IamPackage.POLICY_PROPS_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST:
			return getUsers_software_amazon_awscdk_services_iam_IUser_AsList();
		case IamPackage.POLICY_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case IamPackage.POLICY_PROPS_BUILDER_IAM__VAR_NAME:
			return getVarName();
		case IamPackage.POLICY_PROPS_BUILDER_IAM__IDENTIFIER:
			return getIdentifier();
		case IamPackage.POLICY_PROPS_BUILDER_IAM__ADDITIONAL_CODE:
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
		case IamPackage.POLICY_PROPS_BUILDER_IAM__FORCE_JAVA_LANG_BOOLEAN_:
			setForce_java_lang_Boolean_((Boolean) newValue);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST:
			setGroups_software_amazon_awscdk_services_iam_IGroup_AsList((String) newValue);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__POLICY_NAME_JAVA_LANG_STRING_:
			setPolicyName_java_lang_String_((String) newValue);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST:
			setRoles_software_amazon_awscdk_services_iam_IRole_AsList((String) newValue);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			setStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList((String) newValue);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST:
			setUsers_software_amazon_awscdk_services_iam_IUser_AsList((String) newValue);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__VAR_NAME:
			setVarName((String) newValue);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__ADDITIONAL_CODE:
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
		case IamPackage.POLICY_PROPS_BUILDER_IAM__FORCE_JAVA_LANG_BOOLEAN_:
			setForce_java_lang_Boolean_(FORCE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST:
			setGroups_software_amazon_awscdk_services_iam_IGroup_AsList(
					GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST_EDEFAULT);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__POLICY_NAME_JAVA_LANG_STRING_:
			setPolicyName_java_lang_String_(POLICY_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST:
			setRoles_software_amazon_awscdk_services_iam_IRole_AsList(
					ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST_EDEFAULT);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			setStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(
					STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST:
			setUsers_software_amazon_awscdk_services_iam_IUser_AsList(
					USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST_EDEFAULT);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case IamPackage.POLICY_PROPS_BUILDER_IAM__ADDITIONAL_CODE:
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
		case IamPackage.POLICY_PROPS_BUILDER_IAM__FORCE_JAVA_LANG_BOOLEAN_:
			return FORCE_JAVA_LANG_BOOLEAN__EDEFAULT == null ? force_java_lang_Boolean_ != null
					: !FORCE_JAVA_LANG_BOOLEAN__EDEFAULT.equals(force_java_lang_Boolean_);
		case IamPackage.POLICY_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST:
			return GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST_EDEFAULT == null
					? groups_software_amazon_awscdk_services_iam_IGroup_AsList != null
					: !GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST_EDEFAULT
							.equals(groups_software_amazon_awscdk_services_iam_IGroup_AsList);
		case IamPackage.POLICY_PROPS_BUILDER_IAM__POLICY_NAME_JAVA_LANG_STRING_:
			return POLICY_NAME_JAVA_LANG_STRING__EDEFAULT == null ? policyName_java_lang_String_ != null
					: !POLICY_NAME_JAVA_LANG_STRING__EDEFAULT.equals(policyName_java_lang_String_);
		case IamPackage.POLICY_PROPS_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST:
			return ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST_EDEFAULT == null
					? roles_software_amazon_awscdk_services_iam_IRole_AsList != null
					: !ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST_EDEFAULT
							.equals(roles_software_amazon_awscdk_services_iam_IRole_AsList);
		case IamPackage.POLICY_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			return STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT == null
					? statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList != null
					: !STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT
							.equals(statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList);
		case IamPackage.POLICY_PROPS_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST:
			return USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST_EDEFAULT == null
					? users_software_amazon_awscdk_services_iam_IUser_AsList != null
					: !USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST_EDEFAULT
							.equals(users_software_amazon_awscdk_services_iam_IUser_AsList);
		case IamPackage.POLICY_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case IamPackage.POLICY_PROPS_BUILDER_IAM__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case IamPackage.POLICY_PROPS_BUILDER_IAM__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case IamPackage.POLICY_PROPS_BUILDER_IAM__ADDITIONAL_CODE:
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
		result.append(" (force_java_lang_Boolean_: ");
		result.append(force_java_lang_Boolean_);
		result.append(", groups_software_amazon_awscdk_services_iam_IGroup_AsList: ");
		result.append(groups_software_amazon_awscdk_services_iam_IGroup_AsList);
		result.append(", policyName_java_lang_String_: ");
		result.append(policyName_java_lang_String_);
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

} //PolicyPropsBuilder_iamImpl

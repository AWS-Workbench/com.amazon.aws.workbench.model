/**
 */
package iam.impl;

import iam.IamPackage;
import iam.RoleBuilder_iam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Builder iam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iam.impl.RoleBuilder_iamImpl#getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference <em>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>}</li>
 *   <li>{@link iam.impl.RoleBuilder_iamImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link iam.impl.RoleBuilder_iamImpl#getExternalId_java_lang_String_ <em>External Id java lang String </em>}</li>
 *   <li>{@link iam.impl.RoleBuilder_iamImpl#getExternalIds_java_lang_String_AsList <em>External Ids java lang String As List</em>}</li>
 *   <li>{@link iam.impl.RoleBuilder_iamImpl#getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap <em>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</em>}</li>
 *   <li>{@link iam.impl.RoleBuilder_iamImpl#getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList <em>Managed Policies software amazon awscdk services iam IManaged Policy As List</em>}</li>
 *   <li>{@link iam.impl.RoleBuilder_iamImpl#getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Max Session Duration With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link iam.impl.RoleBuilder_iamImpl#getPath_java_lang_String_ <em>Path java lang String </em>}</li>
 *   <li>{@link iam.impl.RoleBuilder_iamImpl#getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference <em>Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference</em>}</li>
 *   <li>{@link iam.impl.RoleBuilder_iamImpl#getRoleName_java_lang_String_ <em>Role Name java lang String </em>}</li>
 *   <li>{@link iam.impl.RoleBuilder_iamImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link iam.impl.RoleBuilder_iamImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link iam.impl.RoleBuilder_iamImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link iam.impl.RoleBuilder_iamImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleBuilder_iamImpl extends MinimalEObjectImpl.Container implements RoleBuilder_iam {
	/**
	 * The default value of the '{@link #getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference() <em>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference() <em>Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference = ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getExternalId_java_lang_String_() <em>External Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalId_java_lang_String_() <em>External Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String externalId_java_lang_String_ = EXTERNAL_ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalIds_java_lang_String_AsList() <em>External Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalIds_java_lang_String_AsList() <em>External Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String externalIds_java_lang_String_AsList = EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap() <em>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap() <em>Inline Policies java lang String software amazon awscdk services iam Policy Document As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap = INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP_EDEFAULT;

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
	 * The default value of the '{@link #getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Max Session Duration With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Max Session Duration With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference = MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getRoleName_java_lang_String_() <em>Role Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleName_java_lang_String_() <em>Role Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String roleName_java_lang_String_ = ROLE_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.iam.Role";

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
	protected RoleBuilder_iamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IamPackage.Literals.ROLE_BUILDER_IAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference() {
		return assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference(
			String newAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference) {
		String oldAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference = assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference;
		assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference = newAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.ROLE_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE,
					oldAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference,
					assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference));
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
					IamPackage.ROLE_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_, oldDescription_java_lang_String_,
					description_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalId_java_lang_String_() {
		return externalId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalId_java_lang_String_(String newExternalId_java_lang_String_) {
		String oldExternalId_java_lang_String_ = externalId_java_lang_String_;
		externalId_java_lang_String_ = newExternalId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.ROLE_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_, oldExternalId_java_lang_String_,
					externalId_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalIds_java_lang_String_AsList() {
		return externalIds_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalIds_java_lang_String_AsList(String newExternalIds_java_lang_String_AsList) {
		String oldExternalIds_java_lang_String_AsList = externalIds_java_lang_String_AsList;
		externalIds_java_lang_String_AsList = newExternalIds_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.ROLE_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST,
					oldExternalIds_java_lang_String_AsList, externalIds_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap() {
		return inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap(
			String newInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap) {
		String oldInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap = inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap;
		inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap = newInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.ROLE_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP,
					oldInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap,
					inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap));
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
					IamPackage.ROLE_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST,
					oldManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList,
					managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference = maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference = newMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.ROLE_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IamPackage.ROLE_BUILDER_IAM__PATH_JAVA_LANG_STRING_,
					oldPath_java_lang_String_, path_java_lang_String_));
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
					IamPackage.ROLE_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE,
					oldPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference,
					permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleName_java_lang_String_() {
		return roleName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleName_java_lang_String_(String newRoleName_java_lang_String_) {
		String oldRoleName_java_lang_String_ = roleName_java_lang_String_;
		roleName_java_lang_String_ = newRoleName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.ROLE_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_, oldRoleName_java_lang_String_,
					roleName_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IamPackage.ROLE_BUILDER_IAM__VAR_NAME, oldVarName,
					varName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IamPackage.ROLE_BUILDER_IAM__IDENTIFIER,
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
			eNotify(new ENotificationImpl(this, Notification.SET, IamPackage.ROLE_BUILDER_IAM__ADDITIONAL_CODE,
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
		case IamPackage.ROLE_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE:
			return getAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference();
		case IamPackage.ROLE_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case IamPackage.ROLE_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_:
			return getExternalId_java_lang_String_();
		case IamPackage.ROLE_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST:
			return getExternalIds_java_lang_String_AsList();
		case IamPackage.ROLE_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP:
			return getInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap();
		case IamPackage.ROLE_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST:
			return getManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList();
		case IamPackage.ROLE_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case IamPackage.ROLE_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			return getPath_java_lang_String_();
		case IamPackage.ROLE_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE:
			return getPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference();
		case IamPackage.ROLE_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_:
			return getRoleName_java_lang_String_();
		case IamPackage.ROLE_BUILDER_IAM__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case IamPackage.ROLE_BUILDER_IAM__VAR_NAME:
			return getVarName();
		case IamPackage.ROLE_BUILDER_IAM__IDENTIFIER:
			return getIdentifier();
		case IamPackage.ROLE_BUILDER_IAM__ADDITIONAL_CODE:
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
		case IamPackage.ROLE_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE:
			setAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference((String) newValue);
			return;
		case IamPackage.ROLE_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case IamPackage.ROLE_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_:
			setExternalId_java_lang_String_((String) newValue);
			return;
		case IamPackage.ROLE_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST:
			setExternalIds_java_lang_String_AsList((String) newValue);
			return;
		case IamPackage.ROLE_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP:
			setInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap(
					(String) newValue);
			return;
		case IamPackage.ROLE_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST:
			setManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList((String) newValue);
			return;
		case IamPackage.ROLE_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case IamPackage.ROLE_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			setPath_java_lang_String_((String) newValue);
			return;
		case IamPackage.ROLE_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE:
			setPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(
					(String) newValue);
			return;
		case IamPackage.ROLE_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_:
			setRoleName_java_lang_String_((String) newValue);
			return;
		case IamPackage.ROLE_BUILDER_IAM__VAR_NAME:
			setVarName((String) newValue);
			return;
		case IamPackage.ROLE_BUILDER_IAM__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case IamPackage.ROLE_BUILDER_IAM__ADDITIONAL_CODE:
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
		case IamPackage.ROLE_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE:
			setAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference(
					ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE_EDEFAULT);
			return;
		case IamPackage.ROLE_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case IamPackage.ROLE_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_:
			setExternalId_java_lang_String_(EXTERNAL_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case IamPackage.ROLE_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST:
			setExternalIds_java_lang_String_AsList(EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case IamPackage.ROLE_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP:
			setInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap(
					INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP_EDEFAULT);
			return;
		case IamPackage.ROLE_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST:
			setManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(
					MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST_EDEFAULT);
			return;
		case IamPackage.ROLE_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case IamPackage.ROLE_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			setPath_java_lang_String_(PATH_JAVA_LANG_STRING__EDEFAULT);
			return;
		case IamPackage.ROLE_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE:
			setPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(
					PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE_EDEFAULT);
			return;
		case IamPackage.ROLE_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_:
			setRoleName_java_lang_String_(ROLE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case IamPackage.ROLE_BUILDER_IAM__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case IamPackage.ROLE_BUILDER_IAM__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case IamPackage.ROLE_BUILDER_IAM__ADDITIONAL_CODE:
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
		case IamPackage.ROLE_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE:
			return ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE_EDEFAULT == null
					? assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference != null
					: !ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE_EDEFAULT
							.equals(assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference);
		case IamPackage.ROLE_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case IamPackage.ROLE_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_:
			return EXTERNAL_ID_JAVA_LANG_STRING__EDEFAULT == null ? externalId_java_lang_String_ != null
					: !EXTERNAL_ID_JAVA_LANG_STRING__EDEFAULT.equals(externalId_java_lang_String_);
		case IamPackage.ROLE_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST:
			return EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? externalIds_java_lang_String_AsList != null
					: !EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(externalIds_java_lang_String_AsList);
		case IamPackage.ROLE_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP:
			return INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP_EDEFAULT == null
					? inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap != null
					: !INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP_EDEFAULT
							.equals(inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap);
		case IamPackage.ROLE_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST:
			return MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST_EDEFAULT == null
					? managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList != null
					: !MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST_EDEFAULT
							.equals(managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList);
		case IamPackage.ROLE_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case IamPackage.ROLE_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
			return PATH_JAVA_LANG_STRING__EDEFAULT == null ? path_java_lang_String_ != null
					: !PATH_JAVA_LANG_STRING__EDEFAULT.equals(path_java_lang_String_);
		case IamPackage.ROLE_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE:
			return PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE_EDEFAULT == null
					? permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference != null
					: !PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE_EDEFAULT
							.equals(permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference);
		case IamPackage.ROLE_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_:
			return ROLE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? roleName_java_lang_String_ != null
					: !ROLE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(roleName_java_lang_String_);
		case IamPackage.ROLE_BUILDER_IAM__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case IamPackage.ROLE_BUILDER_IAM__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case IamPackage.ROLE_BUILDER_IAM__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case IamPackage.ROLE_BUILDER_IAM__ADDITIONAL_CODE:
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
		result.append(" (assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference: ");
		result.append(assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference);
		result.append(", description_java_lang_String_: ");
		result.append(description_java_lang_String_);
		result.append(", externalId_java_lang_String_: ");
		result.append(externalId_java_lang_String_);
		result.append(", externalIds_java_lang_String_AsList: ");
		result.append(externalIds_java_lang_String_AsList);
		result.append(", inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap: ");
		result.append(inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap);
		result.append(", managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList: ");
		result.append(managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList);
		result.append(", maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", path_java_lang_String_: ");
		result.append(path_java_lang_String_);
		result.append(
				", permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference: ");
		result.append(
				permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference);
		result.append(", roleName_java_lang_String_: ");
		result.append(roleName_java_lang_String_);
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

} //RoleBuilder_iamImpl

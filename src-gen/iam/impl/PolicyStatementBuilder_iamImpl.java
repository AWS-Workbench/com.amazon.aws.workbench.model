/**
 */
package iam.impl;

import iam.Effect;
import iam.IamPackage;
import iam.PolicyStatementBuilder_iam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Statement Builder iam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iam.impl.PolicyStatementBuilder_iamImpl#getActions_java_lang_String_AsList <em>Actions java lang String As List</em>}</li>
 *   <li>{@link iam.impl.PolicyStatementBuilder_iamImpl#getConditions_java_lang_String__java_lang_Object_AsMap <em>Conditions java lang String java lang Object As Map</em>}</li>
 *   <li>{@link iam.impl.PolicyStatementBuilder_iamImpl#getEffect_software_amazon_awscdk_services_iam_Effect_ <em>Effect software amazon awscdk services iam Effect </em>}</li>
 *   <li>{@link iam.impl.PolicyStatementBuilder_iamImpl#getNotActions_java_lang_String_AsList <em>Not Actions java lang String As List</em>}</li>
 *   <li>{@link iam.impl.PolicyStatementBuilder_iamImpl#getNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList <em>Not Principals software amazon awscdk services iam IPrincipal As List</em>}</li>
 *   <li>{@link iam.impl.PolicyStatementBuilder_iamImpl#getNotResources_java_lang_String_AsList <em>Not Resources java lang String As List</em>}</li>
 *   <li>{@link iam.impl.PolicyStatementBuilder_iamImpl#getPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList <em>Principals software amazon awscdk services iam IPrincipal As List</em>}</li>
 *   <li>{@link iam.impl.PolicyStatementBuilder_iamImpl#getResources_java_lang_String_AsList <em>Resources java lang String As List</em>}</li>
 *   <li>{@link iam.impl.PolicyStatementBuilder_iamImpl#getSid_java_lang_String_ <em>Sid java lang String </em>}</li>
 *   <li>{@link iam.impl.PolicyStatementBuilder_iamImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link iam.impl.PolicyStatementBuilder_iamImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link iam.impl.PolicyStatementBuilder_iamImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link iam.impl.PolicyStatementBuilder_iamImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyStatementBuilder_iamImpl extends MinimalEObjectImpl.Container implements PolicyStatementBuilder_iam {
	/**
	 * The default value of the '{@link #getActions_java_lang_String_AsList() <em>Actions java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIONS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActions_java_lang_String_AsList() <em>Actions java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String actions_java_lang_String_AsList = ACTIONS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditions_java_lang_String__java_lang_Object_AsMap() <em>Conditions java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditions_java_lang_String__java_lang_Object_AsMap() <em>Conditions java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String conditions_java_lang_String__java_lang_Object_AsMap = CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffect_software_amazon_awscdk_services_iam_Effect_() <em>Effect software amazon awscdk services iam Effect </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect_software_amazon_awscdk_services_iam_Effect_()
	 * @generated
	 * @ordered
	 */
	protected static final Effect EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT__EDEFAULT = Effect.ALLOW;

	/**
	 * The cached value of the '{@link #getEffect_software_amazon_awscdk_services_iam_Effect_() <em>Effect software amazon awscdk services iam Effect </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect_software_amazon_awscdk_services_iam_Effect_()
	 * @generated
	 * @ordered
	 */
	protected Effect effect_software_amazon_awscdk_services_iam_Effect_ = EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT__EDEFAULT;

	/**
	 * The default value of the '{@link #getNotActions_java_lang_String_AsList() <em>Not Actions java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotActions_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotActions_java_lang_String_AsList() <em>Not Actions java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotActions_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String notActions_java_lang_String_AsList = NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList() <em>Not Principals software amazon awscdk services iam IPrincipal As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList() <em>Not Principals software amazon awscdk services iam IPrincipal As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList()
	 * @generated
	 * @ordered
	 */
	protected String notPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList = NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotResources_java_lang_String_AsList() <em>Not Resources java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotResources_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotResources_java_lang_String_AsList() <em>Not Resources java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotResources_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String notResources_java_lang_String_AsList = NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList() <em>Principals software amazon awscdk services iam IPrincipal As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList() <em>Principals software amazon awscdk services iam IPrincipal As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList()
	 * @generated
	 * @ordered
	 */
	protected String principals_software_amazon_awscdk_services_iam_IPrincipal_AsList = PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getResources_java_lang_String_AsList() <em>Resources java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResources_java_lang_String_AsList() <em>Resources java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String resources_java_lang_String_AsList = RESOURCES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSid_java_lang_String_() <em>Sid java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSid_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSid_java_lang_String_() <em>Sid java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSid_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String sid_java_lang_String_ = SID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.iam.PolicyStatement";

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
	protected PolicyStatementBuilder_iamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IamPackage.Literals.POLICY_STATEMENT_BUILDER_IAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActions_java_lang_String_AsList() {
		return actions_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActions_java_lang_String_AsList(String newActions_java_lang_String_AsList) {
		String oldActions_java_lang_String_AsList = actions_java_lang_String_AsList;
		actions_java_lang_String_AsList = newActions_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.POLICY_STATEMENT_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST,
					oldActions_java_lang_String_AsList, actions_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConditions_java_lang_String__java_lang_Object_AsMap() {
		return conditions_java_lang_String__java_lang_Object_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditions_java_lang_String__java_lang_Object_AsMap(
			String newConditions_java_lang_String__java_lang_Object_AsMap) {
		String oldConditions_java_lang_String__java_lang_Object_AsMap = conditions_java_lang_String__java_lang_Object_AsMap;
		conditions_java_lang_String__java_lang_Object_AsMap = newConditions_java_lang_String__java_lang_Object_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.POLICY_STATEMENT_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP,
					oldConditions_java_lang_String__java_lang_Object_AsMap,
					conditions_java_lang_String__java_lang_Object_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Effect getEffect_software_amazon_awscdk_services_iam_Effect_() {
		return effect_software_amazon_awscdk_services_iam_Effect_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect_software_amazon_awscdk_services_iam_Effect_(
			Effect newEffect_software_amazon_awscdk_services_iam_Effect_) {
		Effect oldEffect_software_amazon_awscdk_services_iam_Effect_ = effect_software_amazon_awscdk_services_iam_Effect_;
		effect_software_amazon_awscdk_services_iam_Effect_ = newEffect_software_amazon_awscdk_services_iam_Effect_ == null
				? EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT__EDEFAULT
				: newEffect_software_amazon_awscdk_services_iam_Effect_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.POLICY_STATEMENT_BUILDER_IAM__EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT_,
					oldEffect_software_amazon_awscdk_services_iam_Effect_,
					effect_software_amazon_awscdk_services_iam_Effect_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotActions_java_lang_String_AsList() {
		return notActions_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotActions_java_lang_String_AsList(String newNotActions_java_lang_String_AsList) {
		String oldNotActions_java_lang_String_AsList = notActions_java_lang_String_AsList;
		notActions_java_lang_String_AsList = newNotActions_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST,
					oldNotActions_java_lang_String_AsList, notActions_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList() {
		return notPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList(
			String newNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList) {
		String oldNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList = notPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList;
		notPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList = newNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST,
					oldNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList,
					notPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotResources_java_lang_String_AsList() {
		return notResources_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotResources_java_lang_String_AsList(String newNotResources_java_lang_String_AsList) {
		String oldNotResources_java_lang_String_AsList = notResources_java_lang_String_AsList;
		notResources_java_lang_String_AsList = newNotResources_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST,
					oldNotResources_java_lang_String_AsList, notResources_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList() {
		return principals_software_amazon_awscdk_services_iam_IPrincipal_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList(
			String newPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList) {
		String oldPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList = principals_software_amazon_awscdk_services_iam_IPrincipal_AsList;
		principals_software_amazon_awscdk_services_iam_IPrincipal_AsList = newPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.POLICY_STATEMENT_BUILDER_IAM__PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST,
					oldPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList,
					principals_software_amazon_awscdk_services_iam_IPrincipal_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResources_java_lang_String_AsList() {
		return resources_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResources_java_lang_String_AsList(String newResources_java_lang_String_AsList) {
		String oldResources_java_lang_String_AsList = resources_java_lang_String_AsList;
		resources_java_lang_String_AsList = newResources_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.POLICY_STATEMENT_BUILDER_IAM__RESOURCES_JAVA_LANG_STRING_AS_LIST,
					oldResources_java_lang_String_AsList, resources_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSid_java_lang_String_() {
		return sid_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSid_java_lang_String_(String newSid_java_lang_String_) {
		String oldSid_java_lang_String_ = sid_java_lang_String_;
		sid_java_lang_String_ = newSid_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.POLICY_STATEMENT_BUILDER_IAM__SID_JAVA_LANG_STRING_, oldSid_java_lang_String_,
					sid_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IamPackage.POLICY_STATEMENT_BUILDER_IAM__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, IamPackage.POLICY_STATEMENT_BUILDER_IAM__IDENTIFIER,
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
					IamPackage.POLICY_STATEMENT_BUILDER_IAM__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST:
			return getActions_java_lang_String_AsList();
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			return getConditions_java_lang_String__java_lang_Object_AsMap();
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT_:
			return getEffect_software_amazon_awscdk_services_iam_Effect_();
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST:
			return getNotActions_java_lang_String_AsList();
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST:
			return getNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList();
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST:
			return getNotResources_java_lang_String_AsList();
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST:
			return getPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList();
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__RESOURCES_JAVA_LANG_STRING_AS_LIST:
			return getResources_java_lang_String_AsList();
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__SID_JAVA_LANG_STRING_:
			return getSid_java_lang_String_();
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__VAR_NAME:
			return getVarName();
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__IDENTIFIER:
			return getIdentifier();
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__ADDITIONAL_CODE:
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
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST:
			setActions_java_lang_String_AsList((String) newValue);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			setConditions_java_lang_String__java_lang_Object_AsMap((String) newValue);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT_:
			setEffect_software_amazon_awscdk_services_iam_Effect_((Effect) newValue);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST:
			setNotActions_java_lang_String_AsList((String) newValue);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST:
			setNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList((String) newValue);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST:
			setNotResources_java_lang_String_AsList((String) newValue);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST:
			setPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList((String) newValue);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__RESOURCES_JAVA_LANG_STRING_AS_LIST:
			setResources_java_lang_String_AsList((String) newValue);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__SID_JAVA_LANG_STRING_:
			setSid_java_lang_String_((String) newValue);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__VAR_NAME:
			setVarName((String) newValue);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__ADDITIONAL_CODE:
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
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST:
			setActions_java_lang_String_AsList(ACTIONS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			setConditions_java_lang_String__java_lang_Object_AsMap(
					CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT_:
			setEffect_software_amazon_awscdk_services_iam_Effect_(
					EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT__EDEFAULT);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST:
			setNotActions_java_lang_String_AsList(NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST:
			setNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList(
					NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST_EDEFAULT);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST:
			setNotResources_java_lang_String_AsList(NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST:
			setPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList(
					PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST_EDEFAULT);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__RESOURCES_JAVA_LANG_STRING_AS_LIST:
			setResources_java_lang_String_AsList(RESOURCES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__SID_JAVA_LANG_STRING_:
			setSid_java_lang_String_(SID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__ADDITIONAL_CODE:
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
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST:
			return ACTIONS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? actions_java_lang_String_AsList != null
					: !ACTIONS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(actions_java_lang_String_AsList);
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			return CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT == null
					? conditions_java_lang_String__java_lang_Object_AsMap != null
					: !CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT
							.equals(conditions_java_lang_String__java_lang_Object_AsMap);
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT_:
			return effect_software_amazon_awscdk_services_iam_Effect_ != EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT__EDEFAULT;
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST:
			return NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? notActions_java_lang_String_AsList != null
					: !NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(notActions_java_lang_String_AsList);
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST:
			return NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST_EDEFAULT == null
					? notPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList != null
					: !NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST_EDEFAULT
							.equals(notPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList);
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST:
			return NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? notResources_java_lang_String_AsList != null
					: !NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(notResources_java_lang_String_AsList);
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST:
			return PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST_EDEFAULT == null
					? principals_software_amazon_awscdk_services_iam_IPrincipal_AsList != null
					: !PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST_EDEFAULT
							.equals(principals_software_amazon_awscdk_services_iam_IPrincipal_AsList);
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__RESOURCES_JAVA_LANG_STRING_AS_LIST:
			return RESOURCES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? resources_java_lang_String_AsList != null
					: !RESOURCES_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(resources_java_lang_String_AsList);
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__SID_JAVA_LANG_STRING_:
			return SID_JAVA_LANG_STRING__EDEFAULT == null ? sid_java_lang_String_ != null
					: !SID_JAVA_LANG_STRING__EDEFAULT.equals(sid_java_lang_String_);
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM__ADDITIONAL_CODE:
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
		result.append(" (actions_java_lang_String_AsList: ");
		result.append(actions_java_lang_String_AsList);
		result.append(", conditions_java_lang_String__java_lang_Object_AsMap: ");
		result.append(conditions_java_lang_String__java_lang_Object_AsMap);
		result.append(", effect_software_amazon_awscdk_services_iam_Effect_: ");
		result.append(effect_software_amazon_awscdk_services_iam_Effect_);
		result.append(", notActions_java_lang_String_AsList: ");
		result.append(notActions_java_lang_String_AsList);
		result.append(", notPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList: ");
		result.append(notPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList);
		result.append(", notResources_java_lang_String_AsList: ");
		result.append(notResources_java_lang_String_AsList);
		result.append(", principals_software_amazon_awscdk_services_iam_IPrincipal_AsList: ");
		result.append(principals_software_amazon_awscdk_services_iam_IPrincipal_AsList);
		result.append(", resources_java_lang_String_AsList: ");
		result.append(resources_java_lang_String_AsList);
		result.append(", sid_java_lang_String_: ");
		result.append(sid_java_lang_String_);
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

} //PolicyStatementBuilder_iamImpl

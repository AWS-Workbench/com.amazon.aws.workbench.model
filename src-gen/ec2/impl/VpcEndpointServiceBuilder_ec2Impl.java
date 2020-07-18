/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.VpcEndpointServiceBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vpc Endpoint Service Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.VpcEndpointServiceBuilder_ec2Impl#getVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList <em>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</em>}</li>
 *   <li>{@link ec2.impl.VpcEndpointServiceBuilder_ec2Impl#getAcceptanceRequired_java_lang_Boolean_ <em>Acceptance Required java lang Boolean </em>}</li>
 *   <li>{@link ec2.impl.VpcEndpointServiceBuilder_ec2Impl#getVpcEndpointServiceName_java_lang_String_ <em>Vpc Endpoint Service Name java lang String </em>}</li>
 *   <li>{@link ec2.impl.VpcEndpointServiceBuilder_ec2Impl#getWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList <em>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</em>}</li>
 *   <li>{@link ec2.impl.VpcEndpointServiceBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.VpcEndpointServiceBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.VpcEndpointServiceBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.VpcEndpointServiceBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VpcEndpointServiceBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements VpcEndpointServiceBuilder_ec2 {
	/**
	 * The default value of the '{@link #getVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList() <em>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList() <em>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList()
	 * @generated
	 * @ordered
	 */
	protected String vpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList = VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcceptanceRequired_java_lang_Boolean_() <em>Acceptance Required java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceRequired_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcceptanceRequired_java_lang_Boolean_() <em>Acceptance Required java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceRequired_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean acceptanceRequired_java_lang_Boolean_ = ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcEndpointServiceName_java_lang_String_() <em>Vpc Endpoint Service Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcEndpointServiceName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcEndpointServiceName_java_lang_String_() <em>Vpc Endpoint Service Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcEndpointServiceName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String vpcEndpointServiceName_java_lang_String_ = VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList() <em>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList() <em>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList()
	 * @generated
	 * @ordered
	 */
	protected String whitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList = WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.VpcEndpointService";

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
	protected VpcEndpointServiceBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.VPC_ENDPOINT_SERVICE_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList() {
		return vpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList(
			String newVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList) {
		String oldVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList = vpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList;
		vpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList = newVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST,
					oldVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList,
					vpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAcceptanceRequired_java_lang_Boolean_() {
		return acceptanceRequired_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcceptanceRequired_java_lang_Boolean_(Boolean newAcceptanceRequired_java_lang_Boolean_) {
		Boolean oldAcceptanceRequired_java_lang_Boolean_ = acceptanceRequired_java_lang_Boolean_;
		acceptanceRequired_java_lang_Boolean_ = newAcceptanceRequired_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN_,
					oldAcceptanceRequired_java_lang_Boolean_, acceptanceRequired_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcEndpointServiceName_java_lang_String_() {
		return vpcEndpointServiceName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcEndpointServiceName_java_lang_String_(String newVpcEndpointServiceName_java_lang_String_) {
		String oldVpcEndpointServiceName_java_lang_String_ = vpcEndpointServiceName_java_lang_String_;
		vpcEndpointServiceName_java_lang_String_ = newVpcEndpointServiceName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING_,
					oldVpcEndpointServiceName_java_lang_String_, vpcEndpointServiceName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList() {
		return whitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList(
			String newWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList) {
		String oldWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList = whitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList;
		whitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList = newWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST,
					oldWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList,
					whitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__VAR_NAME,
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
					Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST:
			return getVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList();
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN_:
			return getAcceptanceRequired_java_lang_Boolean_();
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING_:
			return getVpcEndpointServiceName_java_lang_String_();
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST:
			return getWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList();
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST:
			setVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList(
					(String) newValue);
			return;
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN_:
			setAcceptanceRequired_java_lang_Boolean_((Boolean) newValue);
			return;
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING_:
			setVpcEndpointServiceName_java_lang_String_((String) newValue);
			return;
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST:
			setWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList((String) newValue);
			return;
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST:
			setVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList(
					VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN_:
			setAcceptanceRequired_java_lang_Boolean_(ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING_:
			setVpcEndpointServiceName_java_lang_String_(VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST:
			setWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList(
					WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST:
			return VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST_EDEFAULT == null
					? vpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList != null
					: !VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST_EDEFAULT
							.equals(vpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList);
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN_:
			return ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? acceptanceRequired_java_lang_Boolean_ != null
					: !ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(acceptanceRequired_java_lang_Boolean_);
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING_:
			return VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT == null
					? vpcEndpointServiceName_java_lang_String_ != null
					: !VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING__EDEFAULT
							.equals(vpcEndpointServiceName_java_lang_String_);
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST:
			return WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST_EDEFAULT == null
					? whitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList != null
					: !WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST_EDEFAULT
							.equals(whitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList);
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.VPC_ENDPOINT_SERVICE_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(
				" (vpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList: ");
		result.append(
				vpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList);
		result.append(", acceptanceRequired_java_lang_Boolean_: ");
		result.append(acceptanceRequired_java_lang_Boolean_);
		result.append(", vpcEndpointServiceName_java_lang_String_: ");
		result.append(vpcEndpointServiceName_java_lang_String_);
		result.append(", whitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList: ");
		result.append(whitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList);
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

} //VpcEndpointServiceBuilder_ec2Impl

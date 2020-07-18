/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.GatewayVpcEndpointBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway Vpc Endpoint Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.GatewayVpcEndpointBuilder_ec2Impl#getServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference <em>Service With IGateway Vpc Endpoint Service software amazon awscdk services ec2 IGateway Vpc Endpoint Service As Reference</em>}</li>
 *   <li>{@link ec2.impl.GatewayVpcEndpointBuilder_ec2Impl#getSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList <em>Subnets software amazon awscdk services ec2 Subnet Selection As List</em>}</li>
 *   <li>{@link ec2.impl.GatewayVpcEndpointBuilder_ec2Impl#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link ec2.impl.GatewayVpcEndpointBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.GatewayVpcEndpointBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.GatewayVpcEndpointBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.GatewayVpcEndpointBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GatewayVpcEndpointBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements GatewayVpcEndpointBuilder_ec2 {
	/**
	 * The default value of the '{@link #getServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference() <em>Service With IGateway Vpc Endpoint Service software amazon awscdk services ec2 IGateway Vpc Endpoint Service As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference() <em>Service With IGateway Vpc Endpoint Service software amazon awscdk services ec2 IGateway Vpc Endpoint Service As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String serviceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference = SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList() <em>Subnets software amazon awscdk services ec2 Subnet Selection As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList() <em>Subnets software amazon awscdk services ec2 Subnet Selection As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList()
	 * @generated
	 * @ordered
	 */
	protected String subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList = SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.GatewayVpcEndpoint";

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
	protected GatewayVpcEndpointBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.GATEWAY_VPC_ENDPOINT_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference() {
		return serviceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference(
			String newServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference) {
		String oldServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference = serviceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference;
		serviceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference = newServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE,
					oldServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference,
					serviceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList() {
		return subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList(
			String newSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList) {
		String oldSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList = subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList;
		subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList = newSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST,
					oldSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList,
					subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
			String newVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference) {
		String oldVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
		vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = newVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
					oldVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference,
					vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME,
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
					Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE:
			return getServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference();
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST:
			return getSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE:
			setServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference(
					(String) newValue);
			return;
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST:
			setSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList((String) newValue);
			return;
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference((String) newValue);
			return;
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE:
			setServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference(
					SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST:
			setSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList(
					SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST_EDEFAULT);
			return;
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
					VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE:
			return SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE_EDEFAULT == null
					? serviceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference != null
					: !SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE_EDEFAULT
							.equals(serviceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference);
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST:
			return SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST_EDEFAULT == null
					? subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList != null
					: !SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST_EDEFAULT
							.equals(subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList);
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT == null
					? vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference != null
					: !VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT
							.equals(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.GATEWAY_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE:
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
				" (serviceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference: ");
		result.append(
				serviceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference);
		result.append(", subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList: ");
		result.append(subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList);
		result.append(", vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference: ");
		result.append(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
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

} //GatewayVpcEndpointBuilder_ec2Impl

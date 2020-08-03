/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.EndpointConfigurationBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint Configuration Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EndpointConfigurationBuilder_apigatewayImpl#getTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList <em>Types software amazon awscdk services apigateway Endpoint Type As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EndpointConfigurationBuilder_apigatewayImpl#getVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList <em>Vpc Endpoints software amazon awscdk services ec2 IVpc Endpoint As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EndpointConfigurationBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EndpointConfigurationBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EndpointConfigurationBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.EndpointConfigurationBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndpointConfigurationBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements EndpointConfigurationBuilder_apigateway {
	/**
	 * The default value of the '{@link #getTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList() <em>Types software amazon awscdk services apigateway Endpoint Type As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList() <em>Types software amazon awscdk services apigateway Endpoint Type As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList()
	 * @generated
	 * @ordered
	 */
	protected String types_software_amazon_awscdk_services_apigateway_EndpointType_AsList = TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList() <em>Vpc Endpoints software amazon awscdk services ec2 IVpc Endpoint As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_ENDPOINTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList() <em>Vpc Endpoints software amazon awscdk services ec2 IVpc Endpoint As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList()
	 * @generated
	 * @ordered
	 */
	protected String vpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList = VPC_ENDPOINTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.EndpointConfiguration";

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
	protected EndpointConfigurationBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList() {
		return types_software_amazon_awscdk_services_apigateway_EndpointType_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList(
			String newTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList) {
		String oldTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList = types_software_amazon_awscdk_services_apigateway_EndpointType_AsList;
		types_software_amazon_awscdk_services_apigateway_EndpointType_AsList = newTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST,
					oldTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList,
					types_software_amazon_awscdk_services_apigateway_EndpointType_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList() {
		return vpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList(
			String newVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList) {
		String oldVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList = vpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList;
		vpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList = newVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__VPC_ENDPOINTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_AS_LIST,
					oldVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList,
					vpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList));
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
					AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier,
					identifier));
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
					AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST:
			return getTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList();
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__VPC_ENDPOINTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_AS_LIST:
			return getVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList();
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST:
			setTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__VPC_ENDPOINTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_AS_LIST:
			setVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST:
			setTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList(
					TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__VPC_ENDPOINTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_AS_LIST:
			setVpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList(
					VPC_ENDPOINTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST:
			return TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST_EDEFAULT == null
					? types_software_amazon_awscdk_services_apigateway_EndpointType_AsList != null
					: !TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST_EDEFAULT
							.equals(types_software_amazon_awscdk_services_apigateway_EndpointType_AsList);
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__VPC_ENDPOINTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_AS_LIST:
			return VPC_ENDPOINTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_AS_LIST_EDEFAULT == null
					? vpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList != null
					: !VPC_ENDPOINTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_AS_LIST_EDEFAULT
							.equals(vpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList);
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (types_software_amazon_awscdk_services_apigateway_EndpointType_AsList: ");
		result.append(types_software_amazon_awscdk_services_apigateway_EndpointType_AsList);
		result.append(", vpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList: ");
		result.append(vpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList);
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

} //EndpointConfigurationBuilder_apigatewayImpl

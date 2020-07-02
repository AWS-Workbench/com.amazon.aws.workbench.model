/**
 */
package com.amazon.aws.workbench.model.awsworkbench.services.ec2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.Ec2Factory
 * @model kind="package"
 * @generated
 */
public interface Ec2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ec2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "default.awsworkbench.services.ec2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ec2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ec2Package eINSTANCE = com.amazon.aws.workbench.model.awsworkbench.services.ec2.impl.Ec2PackageImpl.init();

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.impl.VpcBuilderImpl <em>Vpc Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.impl.VpcBuilderImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.impl.Ec2PackageImpl#getVpcBuilder()
	 * @generated
	 */
	int VPC_BUILDER = 0;

	/**
	 * The feature id for the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__CIDR = 0;

	/**
	 * The feature id for the '<em><b>Enable Dns Hostnames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__ENABLE_DNS_HOSTNAMES = 1;

	/**
	 * The feature id for the '<em><b>Enable Dns Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__ENABLE_DNS_SUPPORT = 2;

	/**
	 * The feature id for the '<em><b>Max Azs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__MAX_AZS = 3;

	/**
	 * The feature id for the '<em><b>Nat Gateways</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__NAT_GATEWAYS = 4;

	/**
	 * The feature id for the '<em><b>Vpn Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__VPN_GATEWAY = 5;

	/**
	 * The feature id for the '<em><b>Vpn Gateway Asn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__VPN_GATEWAY_ASN = 6;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__GENERATED_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__VAR_NAME = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__ADDITIONAL_CODE = 10;

	/**
	 * The feature id for the '<em><b>Default Instance Tenancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER__DEFAULT_INSTANCE_TENANCY = 11;

	/**
	 * The number of structural features of the '<em>Vpc Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Vpc Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.DefaultInstanceTenancy <em>Default Instance Tenancy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.DefaultInstanceTenancy
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.impl.Ec2PackageImpl#getDefaultInstanceTenancy()
	 * @generated
	 */
	int DEFAULT_INSTANCE_TENANCY = 1;

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder <em>Vpc Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpc Builder</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder
	 * @generated
	 */
	EClass getVpcBuilder();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getCidr <em>Cidr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getCidr()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_Cidr();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getEnableDnsHostnames <em>Enable Dns Hostnames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dns Hostnames</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getEnableDnsHostnames()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_EnableDnsHostnames();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getEnableDnsSupport <em>Enable Dns Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dns Support</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getEnableDnsSupport()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_EnableDnsSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getMaxAzs <em>Max Azs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Azs</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getMaxAzs()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_MaxAzs();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getNatGateways <em>Nat Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Gateways</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getNatGateways()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_NatGateways();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getVpnGateway <em>Vpn Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Gateway</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getVpnGateway()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_VpnGateway();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getVpnGatewayAsn <em>Vpn Gateway Asn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Gateway Asn</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getVpnGatewayAsn()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_VpnGatewayAsn();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getGeneratedClassName()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getVarName()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getIdentifier()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getAdditionalCode()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_AdditionalCode();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getDefaultInstanceTenancy <em>Default Instance Tenancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Instance Tenancy</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.VpcBuilder#getDefaultInstanceTenancy()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_DefaultInstanceTenancy();

	/**
	 * Returns the meta object for enum '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.DefaultInstanceTenancy <em>Default Instance Tenancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Instance Tenancy</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.DefaultInstanceTenancy
	 * @generated
	 */
	EEnum getDefaultInstanceTenancy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ec2Factory getEc2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.impl.VpcBuilderImpl <em>Vpc Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.impl.VpcBuilderImpl
		 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.impl.Ec2PackageImpl#getVpcBuilder()
		 * @generated
		 */
		EClass VPC_BUILDER = eINSTANCE.getVpcBuilder();

		/**
		 * The meta object literal for the '<em><b>Cidr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__CIDR = eINSTANCE.getVpcBuilder_Cidr();

		/**
		 * The meta object literal for the '<em><b>Enable Dns Hostnames</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__ENABLE_DNS_HOSTNAMES = eINSTANCE.getVpcBuilder_EnableDnsHostnames();

		/**
		 * The meta object literal for the '<em><b>Enable Dns Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__ENABLE_DNS_SUPPORT = eINSTANCE.getVpcBuilder_EnableDnsSupport();

		/**
		 * The meta object literal for the '<em><b>Max Azs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__MAX_AZS = eINSTANCE.getVpcBuilder_MaxAzs();

		/**
		 * The meta object literal for the '<em><b>Nat Gateways</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__NAT_GATEWAYS = eINSTANCE.getVpcBuilder_NatGateways();

		/**
		 * The meta object literal for the '<em><b>Vpn Gateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__VPN_GATEWAY = eINSTANCE.getVpcBuilder_VpnGateway();

		/**
		 * The meta object literal for the '<em><b>Vpn Gateway Asn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__VPN_GATEWAY_ASN = eINSTANCE.getVpcBuilder_VpnGatewayAsn();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__GENERATED_CLASS_NAME = eINSTANCE.getVpcBuilder_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__VAR_NAME = eINSTANCE.getVpcBuilder_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__IDENTIFIER = eINSTANCE.getVpcBuilder_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__ADDITIONAL_CODE = eINSTANCE.getVpcBuilder_AdditionalCode();

		/**
		 * The meta object literal for the '<em><b>Default Instance Tenancy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER__DEFAULT_INSTANCE_TENANCY = eINSTANCE.getVpcBuilder_DefaultInstanceTenancy();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.services.ec2.DefaultInstanceTenancy <em>Default Instance Tenancy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.DefaultInstanceTenancy
		 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.impl.Ec2PackageImpl#getDefaultInstanceTenancy()
		 * @generated
		 */
		EEnum DEFAULT_INSTANCE_TENANCY = eINSTANCE.getDefaultInstanceTenancy();

	}

} //Ec2Package

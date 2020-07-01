/**
 */
package com.amazon.aws.workbench.model.awsworkbench.builders;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see com.amazon.aws.workbench.model.awsworkbench.builders.BuildersFactory
 * @model kind="package"
 * @generated
 */
public interface BuildersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "builders";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "default.builders";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "builders";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuildersPackage eINSTANCE = com.amazon.aws.workbench.model.awsworkbench.builders.impl.BuildersPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.builders.impl.VpcBuilderImpl <em>Vpc Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.impl.VpcBuilderImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.impl.BuildersPackageImpl#getVpcBuilder()
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
	 * The number of structural features of the '<em>Vpc Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Vpc Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.builders.impl.AppBuilderImpl <em>App Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.impl.AppBuilderImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.impl.BuildersPackageImpl#getAppBuilder()
	 * @generated
	 */
	int APP_BUILDER = 1;

	/**
	 * The feature id for the '<em><b>Auto Synth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__AUTO_SYNTH = 0;

	/**
	 * The feature id for the '<em><b>Outdir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__OUTDIR = 1;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__RUNTIME_INFO = 2;

	/**
	 * The feature id for the '<em><b>Stack Traces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__STACK_TRACES = 3;

	/**
	 * The feature id for the '<em><b>Tree Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__TREE_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__ADDITIONAL_CODE = 8;

	/**
	 * The feature id for the '<em><b>Vpcbuilder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__VPCBUILDER = 9;

	/**
	 * The number of structural features of the '<em>App Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>App Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder <em>Vpc Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpc Builder</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder
	 * @generated
	 */
	EClass getVpcBuilder();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getCidr <em>Cidr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getCidr()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_Cidr();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getEnableDnsHostnames <em>Enable Dns Hostnames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dns Hostnames</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getEnableDnsHostnames()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_EnableDnsHostnames();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getEnableDnsSupport <em>Enable Dns Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dns Support</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getEnableDnsSupport()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_EnableDnsSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getMaxAzs <em>Max Azs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Azs</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getMaxAzs()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_MaxAzs();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getNatGateways <em>Nat Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Gateways</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getNatGateways()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_NatGateways();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getVpnGateway <em>Vpn Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Gateway</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getVpnGateway()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_VpnGateway();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getVpnGatewayAsn <em>Vpn Gateway Asn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Gateway Asn</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getVpnGatewayAsn()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_VpnGatewayAsn();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getGeneratedClassName()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getVarName()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getIdentifier()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder#getAdditionalCode()
	 * @see #getVpcBuilder()
	 * @generated
	 */
	EAttribute getVpcBuilder_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder <em>App Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Builder</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder
	 * @generated
	 */
	EClass getAppBuilder();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getAutoSynth <em>Auto Synth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Synth</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getAutoSynth()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_AutoSynth();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getOutdir <em>Outdir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outdir</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getOutdir()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_Outdir();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getRuntimeInfo <em>Runtime Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Info</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getRuntimeInfo()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_RuntimeInfo();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getStackTraces <em>Stack Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Traces</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getStackTraces()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_StackTraces();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getTreeMetadata <em>Tree Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Metadata</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getTreeMetadata()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_TreeMetadata();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getGeneratedClassName()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getVarName()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getIdentifier()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getAdditionalCode()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_AdditionalCode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getVpcbuilder <em>Vpcbuilder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vpcbuilder</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder#getVpcbuilder()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EReference getAppBuilder_Vpcbuilder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BuildersFactory getBuildersFactory();

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
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.builders.impl.VpcBuilderImpl <em>Vpc Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.builders.impl.VpcBuilderImpl
		 * @see com.amazon.aws.workbench.model.awsworkbench.builders.impl.BuildersPackageImpl#getVpcBuilder()
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
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.builders.impl.AppBuilderImpl <em>App Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.builders.impl.AppBuilderImpl
		 * @see com.amazon.aws.workbench.model.awsworkbench.builders.impl.BuildersPackageImpl#getAppBuilder()
		 * @generated
		 */
		EClass APP_BUILDER = eINSTANCE.getAppBuilder();

		/**
		 * The meta object literal for the '<em><b>Auto Synth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__AUTO_SYNTH = eINSTANCE.getAppBuilder_AutoSynth();

		/**
		 * The meta object literal for the '<em><b>Outdir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__OUTDIR = eINSTANCE.getAppBuilder_Outdir();

		/**
		 * The meta object literal for the '<em><b>Runtime Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__RUNTIME_INFO = eINSTANCE.getAppBuilder_RuntimeInfo();

		/**
		 * The meta object literal for the '<em><b>Stack Traces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__STACK_TRACES = eINSTANCE.getAppBuilder_StackTraces();

		/**
		 * The meta object literal for the '<em><b>Tree Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__TREE_METADATA = eINSTANCE.getAppBuilder_TreeMetadata();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__GENERATED_CLASS_NAME = eINSTANCE.getAppBuilder_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__VAR_NAME = eINSTANCE.getAppBuilder_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__IDENTIFIER = eINSTANCE.getAppBuilder_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__ADDITIONAL_CODE = eINSTANCE.getAppBuilder_AdditionalCode();

		/**
		 * The meta object literal for the '<em><b>Vpcbuilder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_BUILDER__VPCBUILDER = eINSTANCE.getAppBuilder_Vpcbuilder();

	}

} //BuildersPackage

/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage
 * @generated
 */
public interface AwsworkbenchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AwsworkbenchFactory eINSTANCE = com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>App Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Builder core</em>'.
	 * @generated
	 */
	AppBuilder_core createAppBuilder_core();

	/**
	 * Returns a new object of class '<em>Default Stack Synthesizer Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Stack Synthesizer Builder core</em>'.
	 * @generated
	 */
	DefaultStackSynthesizerBuilder_core createDefaultStackSynthesizerBuilder_core();

	/**
	 * Returns a new object of class '<em>Environment Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Builder core</em>'.
	 * @generated
	 */
	EnvironmentBuilder_core createEnvironmentBuilder_core();

	/**
	 * Returns a new object of class '<em>Flow Log Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Log Options Builder ec2</em>'.
	 * @generated
	 */
	FlowLogOptionsBuilder_ec2 createFlowLogOptionsBuilder_ec2();

	/**
	 * Returns a new object of class '<em>Stack Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stack Builder core</em>'.
	 * @generated
	 */
	StackBuilder_core createStackBuilder_core();

	/**
	 * Returns a new object of class '<em>Vpc Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vpc Builder ec2</em>'.
	 * @generated
	 */
	VpcBuilder_ec2 createVpcBuilder_ec2();

	/**
	 * Returns a new object of class '<em>Subnet Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subnet Builder ec2</em>'.
	 * @generated
	 */
	SubnetBuilder_ec2 createSubnetBuilder_ec2();

	/**
	 * Returns a new object of class '<em>Subnet Selection Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subnet Selection Builder ec2</em>'.
	 * @generated
	 */
	SubnetSelectionBuilder_ec2 createSubnetSelectionBuilder_ec2();

	/**
	 * Returns a new object of class '<em>Subnet Configuration Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subnet Configuration Builder ec2</em>'.
	 * @generated
	 */
	SubnetConfigurationBuilder_ec2 createSubnetConfigurationBuilder_ec2();

	/**
	 * Returns a new object of class '<em>Vpn Connection Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vpn Connection Options Builder ec2</em>'.
	 * @generated
	 */
	VpnConnectionOptionsBuilder_ec2 createVpnConnectionOptionsBuilder_ec2();

	/**
	 * Returns a new object of class '<em>Vpn Tunnel Option Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vpn Tunnel Option Builder ec2</em>'.
	 * @generated
	 */
	VpnTunnelOptionBuilder_ec2 createVpnTunnelOptionBuilder_ec2();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AwsworkbenchPackage getAwsworkbenchPackage();

} //AwsworkbenchFactory

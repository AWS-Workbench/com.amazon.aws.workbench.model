/**
 */
package com.amazon.aws.workbench.model.awsworkbench.util;

import com.amazon.aws.workbench.model.awsworkbench.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage
 * @generated
 */
public class AwsworkbenchSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AwsworkbenchPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsworkbenchSwitch() {
		if (modelPackage == null) {
			modelPackage = AwsworkbenchPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case AwsworkbenchPackage.SERVICE_RESOURCES: {
			ServiceResources serviceResources = (ServiceResources) theEObject;
			T result = caseServiceResources(serviceResources);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.APP_BUILDER_CORE: {
			AppBuilder_core appBuilder_core = (AppBuilder_core) theEObject;
			T result = caseAppBuilder_core(appBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE: {
			DefaultStackSynthesizerBuilder_core defaultStackSynthesizerBuilder_core = (DefaultStackSynthesizerBuilder_core) theEObject;
			T result = caseDefaultStackSynthesizerBuilder_core(defaultStackSynthesizerBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.ENVIRONMENT_BUILDER_CORE: {
			EnvironmentBuilder_core environmentBuilder_core = (EnvironmentBuilder_core) theEObject;
			T result = caseEnvironmentBuilder_core(environmentBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.FLOW_LOG_OPTIONS_BUILDER_EC2: {
			FlowLogOptionsBuilder_ec2 flowLogOptionsBuilder_ec2 = (FlowLogOptionsBuilder_ec2) theEObject;
			T result = caseFlowLogOptionsBuilder_ec2(flowLogOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.STACK_BUILDER_CORE: {
			StackBuilder_core stackBuilder_core = (StackBuilder_core) theEObject;
			T result = caseStackBuilder_core(stackBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.VPC_BUILDER_EC2: {
			VpcBuilder_ec2 vpcBuilder_ec2 = (VpcBuilder_ec2) theEObject;
			T result = caseVpcBuilder_ec2(vpcBuilder_ec2);
			if (result == null)
				result = caseServiceResources(vpcBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SUBNET_BUILDER_EC2: {
			SubnetBuilder_ec2 subnetBuilder_ec2 = (SubnetBuilder_ec2) theEObject;
			T result = caseSubnetBuilder_ec2(subnetBuilder_ec2);
			if (result == null)
				result = caseServiceResources(subnetBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2: {
			SubnetSelectionBuilder_ec2 subnetSelectionBuilder_ec2 = (SubnetSelectionBuilder_ec2) theEObject;
			T result = caseSubnetSelectionBuilder_ec2(subnetSelectionBuilder_ec2);
			if (result == null)
				result = caseServiceResources(subnetSelectionBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SUBNET_CONFIGURATION_BUILDER_EC2: {
			SubnetConfigurationBuilder_ec2 subnetConfigurationBuilder_ec2 = (SubnetConfigurationBuilder_ec2) theEObject;
			T result = caseSubnetConfigurationBuilder_ec2(subnetConfigurationBuilder_ec2);
			if (result == null)
				result = caseServiceResources(subnetConfigurationBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.VPN_CONNECTION_OPTIONS_BUILDER_EC2: {
			VpnConnectionOptionsBuilder_ec2 vpnConnectionOptionsBuilder_ec2 = (VpnConnectionOptionsBuilder_ec2) theEObject;
			T result = caseVpnConnectionOptionsBuilder_ec2(vpnConnectionOptionsBuilder_ec2);
			if (result == null)
				result = caseServiceResources(vpnConnectionOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.VPN_TUNNEL_OPTION_BUILDER_EC2: {
			VpnTunnelOptionBuilder_ec2 vpnTunnelOptionBuilder_ec2 = (VpnTunnelOptionBuilder_ec2) theEObject;
			T result = caseVpnTunnelOptionBuilder_ec2(vpnTunnelOptionBuilder_ec2);
			if (result == null)
				result = caseServiceResources(vpnTunnelOptionBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceResources(ServiceResources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppBuilder_core(AppBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Stack Synthesizer Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Stack Synthesizer Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultStackSynthesizerBuilder_core(DefaultStackSynthesizerBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentBuilder_core(EnvironmentBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Log Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Log Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowLogOptionsBuilder_ec2(FlowLogOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStackBuilder_core(StackBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpc Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpc Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpcBuilder_ec2(VpcBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnetBuilder_ec2(SubnetBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet Selection Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet Selection Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnetSelectionBuilder_ec2(SubnetSelectionBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet Configuration Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet Configuration Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnetConfigurationBuilder_ec2(SubnetConfigurationBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpn Connection Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpn Connection Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpnConnectionOptionsBuilder_ec2(VpnConnectionOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpn Tunnel Option Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpn Tunnel Option Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpnTunnelOptionBuilder_ec2(VpnTunnelOptionBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AwsworkbenchSwitch

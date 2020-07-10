/**
 */
package com.amazon.aws.workbench.model.awsworkbench.util;

import com.amazon.aws.workbench.model.awsworkbench.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage
 * @generated
 */
public class AwsworkbenchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AwsworkbenchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsworkbenchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AwsworkbenchPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AwsworkbenchSwitch<Adapter> modelSwitch = new AwsworkbenchSwitch<Adapter>() {
		@Override
		public Adapter caseAppBuilder_core(AppBuilder_core object) {
			return createAppBuilder_coreAdapter();
		}

		@Override
		public Adapter caseStackBuilder_core(StackBuilder_core object) {
			return createStackBuilder_coreAdapter();
		}

		@Override
		public Adapter caseVpcBuilder_ec2(VpcBuilder_ec2 object) {
			return createVpcBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseServiceResources(ServiceResources object) {
			return createServiceResourcesAdapter();
		}

		@Override
		public Adapter caseSubnetBuilder_ec2(SubnetBuilder_ec2 object) {
			return createSubnetBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseInstanceBuilder_ec2(InstanceBuilder_ec2 object) {
			return createInstanceBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseSecurityGroupBuilder_ec2(SecurityGroupBuilder_ec2 object) {
			return createSecurityGroupBuilder_ec2Adapter();
		}

		@Override
		public Adapter casePortBuilder_ec2(PortBuilder_ec2 object) {
			return createPortBuilder_ec2Adapter();
		}

		@Override
		public Adapter casePrivateSubnetBuilder_ec2(PrivateSubnetBuilder_ec2 object) {
			return createPrivateSubnetBuilder_ec2Adapter();
		}

		@Override
		public Adapter casePublicSubnetBuilder_ec2(PublicSubnetBuilder_ec2 object) {
			return createPublicSubnetBuilder_ec2Adapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core <em>App Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core
	 * @generated
	 */
	public Adapter createAppBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core <em>Stack Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core
	 * @generated
	 */
	public Adapter createStackBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2 <em>Vpc Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2
	 * @generated
	 */
	public Adapter createVpcBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources <em>Service Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ServiceResources
	 * @generated
	 */
	public Adapter createServiceResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2 <em>Subnet Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2
	 * @generated
	 */
	public Adapter createSubnetBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2 <em>Instance Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2
	 * @generated
	 */
	public Adapter createInstanceBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2 <em>Security Group Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2
	 * @generated
	 */
	public Adapter createSecurityGroupBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2 <em>Port Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2
	 * @generated
	 */
	public Adapter createPortBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2 <em>Private Subnet Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PrivateSubnetBuilder_ec2
	 * @generated
	 */
	public Adapter createPrivateSubnetBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2 <em>Public Subnet Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2
	 * @generated
	 */
	public Adapter createPublicSubnetBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AwsworkbenchAdapterFactory

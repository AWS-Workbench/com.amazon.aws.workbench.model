/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AwsworkbenchFactoryImpl extends EFactoryImpl implements AwsworkbenchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AwsworkbenchFactory init() {
		try {
			AwsworkbenchFactory theAwsworkbenchFactory = (AwsworkbenchFactory) EPackage.Registry.INSTANCE
					.getEFactory(AwsworkbenchPackage.eNS_URI);
			if (theAwsworkbenchFactory != null) {
				return theAwsworkbenchFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AwsworkbenchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsworkbenchFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AwsworkbenchPackage.APP_BUILDER_CORE:
			return createAppBuilder_core();
		case AwsworkbenchPackage.STACK_BUILDER_CORE:
			return createStackBuilder_core();
		case AwsworkbenchPackage.VPC_BUILDER_EC2:
			return createVpcBuilder_ec2();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case AwsworkbenchPackage.DEFAULT_INSTANCE_TENANCY:
			return createDefaultInstanceTenancyFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case AwsworkbenchPackage.DEFAULT_INSTANCE_TENANCY:
			return convertDefaultInstanceTenancyToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppBuilder_core createAppBuilder_core() {
		AppBuilder_coreImpl appBuilder_core = new AppBuilder_coreImpl();
		return appBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StackBuilder_core createStackBuilder_core() {
		StackBuilder_coreImpl stackBuilder_core = new StackBuilder_coreImpl();
		return stackBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpcBuilder_ec2 createVpcBuilder_ec2() {
		VpcBuilder_ec2Impl vpcBuilder_ec2 = new VpcBuilder_ec2Impl();
		return vpcBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultInstanceTenancy createDefaultInstanceTenancyFromString(EDataType eDataType, String initialValue) {
		DefaultInstanceTenancy result = DefaultInstanceTenancy.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultInstanceTenancyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwsworkbenchPackage getAwsworkbenchPackage() {
		return (AwsworkbenchPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AwsworkbenchPackage getPackage() {
		return AwsworkbenchPackage.eINSTANCE;
	}

} //AwsworkbenchFactoryImpl

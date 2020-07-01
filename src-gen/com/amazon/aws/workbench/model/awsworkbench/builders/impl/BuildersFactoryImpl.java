/**
 */
package com.amazon.aws.workbench.model.awsworkbench.builders.impl;

import com.amazon.aws.workbench.model.awsworkbench.builders.*;

import org.eclipse.emf.ecore.EClass;
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
public class BuildersFactoryImpl extends EFactoryImpl implements BuildersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuildersFactory init() {
		try {
			BuildersFactory theBuildersFactory = (BuildersFactory) EPackage.Registry.INSTANCE
					.getEFactory(BuildersPackage.eNS_URI);
			if (theBuildersFactory != null) {
				return theBuildersFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BuildersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildersFactoryImpl() {
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
		case BuildersPackage.VPC_BUILDER:
			return createVpcBuilder();
		case BuildersPackage.APP_BUILDER:
			return createAppBuilder();
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
	public VpcBuilder createVpcBuilder() {
		VpcBuilderImpl vpcBuilder = new VpcBuilderImpl();
		return vpcBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppBuilder createAppBuilder() {
		AppBuilderImpl appBuilder = new AppBuilderImpl();
		return appBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildersPackage getBuildersPackage() {
		return (BuildersPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BuildersPackage getPackage() {
		return BuildersPackage.eINSTANCE;
	}

} //BuildersFactoryImpl

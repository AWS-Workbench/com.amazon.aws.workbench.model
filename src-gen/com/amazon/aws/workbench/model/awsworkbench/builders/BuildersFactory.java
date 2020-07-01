/**
 */
package com.amazon.aws.workbench.model.awsworkbench.builders;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage
 * @generated
 */
public interface BuildersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuildersFactory eINSTANCE = com.amazon.aws.workbench.model.awsworkbench.builders.impl.BuildersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vpc Builder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vpc Builder</em>'.
	 * @generated
	 */
	VpcBuilder createVpcBuilder();

	/**
	 * Returns a new object of class '<em>App Builder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Builder</em>'.
	 * @generated
	 */
	AppBuilder createAppBuilder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BuildersPackage getBuildersPackage();

} //BuildersFactory

/**
 */
package com.amazon.aws.workbench.model.awsworkbench.services.ec2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.services.ec2.Ec2Package
 * @generated
 */
public interface Ec2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ec2Factory eINSTANCE = com.amazon.aws.workbench.model.awsworkbench.services.ec2.impl.Ec2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vpc Builder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vpc Builder</em>'.
	 * @generated
	 */
	VpcBuilder createVpcBuilder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ec2Package getEc2Package();

} //Ec2Factory

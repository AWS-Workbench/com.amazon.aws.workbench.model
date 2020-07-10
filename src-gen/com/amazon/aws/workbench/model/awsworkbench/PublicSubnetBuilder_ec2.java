/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Subnet Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getAvailabilityZone <em>Availability Zone</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getCidrBlock <em>Cidr Block</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getVpcId <em>Vpc Id</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getMapPublicIpOnLaunch <em>Map Public Ip On Launch</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getInstancebuilder_ec2 <em>Instancebuilder ec2</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPublicSubnetBuilder_ec2()
 * @model
 * @generated
 */
public interface PublicSubnetBuilder_ec2 extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Zone</em>' attribute.
	 * @see #setAvailabilityZone(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPublicSubnetBuilder_ec2_AvailabilityZone()
	 * @model
	 * @generated
	 */
	String getAvailabilityZone();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getAvailabilityZone <em>Availability Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Zone</em>' attribute.
	 * @see #getAvailabilityZone()
	 * @generated
	 */
	void setAvailabilityZone(String value);

	/**
	 * Returns the value of the '<em><b>Cidr Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr Block</em>' attribute.
	 * @see #setCidrBlock(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPublicSubnetBuilder_ec2_CidrBlock()
	 * @model
	 * @generated
	 */
	String getCidrBlock();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getCidrBlock <em>Cidr Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr Block</em>' attribute.
	 * @see #getCidrBlock()
	 * @generated
	 */
	void setCidrBlock(String value);

	/**
	 * Returns the value of the '<em><b>Vpc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc Id</em>' attribute.
	 * @see #setVpcId(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPublicSubnetBuilder_ec2_VpcId()
	 * @model
	 * @generated
	 */
	String getVpcId();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getVpcId <em>Vpc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Id</em>' attribute.
	 * @see #getVpcId()
	 * @generated
	 */
	void setVpcId(String value);

	/**
	 * Returns the value of the '<em><b>Map Public Ip On Launch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Public Ip On Launch</em>' attribute.
	 * @see #setMapPublicIpOnLaunch(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPublicSubnetBuilder_ec2_MapPublicIpOnLaunch()
	 * @model
	 * @generated
	 */
	Boolean getMapPublicIpOnLaunch();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getMapPublicIpOnLaunch <em>Map Public Ip On Launch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Public Ip On Launch</em>' attribute.
	 * @see #getMapPublicIpOnLaunch()
	 * @generated
	 */
	void setMapPublicIpOnLaunch(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.PublicSubnet"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPublicSubnetBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.PublicSubnet" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPublicSubnetBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPublicSubnetBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPublicSubnetBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PublicSubnetBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

	/**
	 * Returns the value of the '<em><b>Instancebuilder ec2</b></em>' containment reference list.
	 * The list contents are of type {@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instancebuilder ec2</em>' containment reference list.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPublicSubnetBuilder_ec2_Instancebuilder_ec2()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstanceBuilder_ec2> getInstancebuilder_ec2();

} // PublicSubnetBuilder_ec2

/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getStringRepresentation <em>String Representation</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getFromPort <em>From Port</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getToPort <em>To Port</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPortBuilder_ec2()
 * @model
 * @generated
 */
public interface PortBuilder_ec2 extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.Protocol
	 * @see #setProtocol(Protocol)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPortBuilder_ec2_Protocol()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.Protocol"
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.Protocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

	/**
	 * Returns the value of the '<em><b>String Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Representation</em>' attribute.
	 * @see #setStringRepresentation(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPortBuilder_ec2_StringRepresentation()
	 * @model
	 * @generated
	 */
	String getStringRepresentation();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getStringRepresentation <em>String Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Representation</em>' attribute.
	 * @see #getStringRepresentation()
	 * @generated
	 */
	void setStringRepresentation(String value);

	/**
	 * Returns the value of the '<em><b>From Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Port</em>' attribute.
	 * @see #setFromPort(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPortBuilder_ec2_FromPort()
	 * @model
	 * @generated
	 */
	int getFromPort();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getFromPort <em>From Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Port</em>' attribute.
	 * @see #getFromPort()
	 * @generated
	 */
	void setFromPort(int value);

	/**
	 * Returns the value of the '<em><b>To Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Port</em>' attribute.
	 * @see #setToPort(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPortBuilder_ec2_ToPort()
	 * @model
	 * @generated
	 */
	int getToPort();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getToPort <em>To Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Port</em>' attribute.
	 * @see #getToPort()
	 * @generated
	 */
	void setToPort(int value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.Port"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPortBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.Port" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPortBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPortBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPortBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // PortBuilder_ec2

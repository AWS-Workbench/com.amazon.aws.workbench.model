/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Subnet Props Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.PublicSubnetPropsBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}</li>
 *   <li>{@link ec2.PublicSubnetPropsBuilder_ec2#getCidrBlock_java_lang_String_ <em>Cidr Block java lang String </em>}</li>
 *   <li>{@link ec2.PublicSubnetPropsBuilder_ec2#getVpcId_java_lang_String_ <em>Vpc Id java lang String </em>}</li>
 *   <li>{@link ec2.PublicSubnetPropsBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_ <em>Map Public Ip On Launch java lang Boolean </em>}</li>
 *   <li>{@link ec2.PublicSubnetPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.PublicSubnetPropsBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.PublicSubnetPropsBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.PublicSubnetPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getPublicSubnetPropsBuilder_ec2()
 * @model
 * @generated
 */
public interface PublicSubnetPropsBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Zone java lang String </em>' attribute.
	 * @see #setAvailabilityZone_java_lang_String_(String)
	 * @see ec2.Ec2Package#getPublicSubnetPropsBuilder_ec2_AvailabilityZone_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getAvailabilityZone_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.PublicSubnetPropsBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Zone java lang String </em>' attribute.
	 * @see #getAvailabilityZone_java_lang_String_()
	 * @generated
	 */
	void setAvailabilityZone_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Cidr Block java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr Block java lang String </em>' attribute.
	 * @see #setCidrBlock_java_lang_String_(String)
	 * @see ec2.Ec2Package#getPublicSubnetPropsBuilder_ec2_CidrBlock_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getCidrBlock_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.PublicSubnetPropsBuilder_ec2#getCidrBlock_java_lang_String_ <em>Cidr Block java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr Block java lang String </em>' attribute.
	 * @see #getCidrBlock_java_lang_String_()
	 * @generated
	 */
	void setCidrBlock_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Vpc Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc Id java lang String </em>' attribute.
	 * @see #setVpcId_java_lang_String_(String)
	 * @see ec2.Ec2Package#getPublicSubnetPropsBuilder_ec2_VpcId_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getVpcId_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.PublicSubnetPropsBuilder_ec2#getVpcId_java_lang_String_ <em>Vpc Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Id java lang String </em>' attribute.
	 * @see #getVpcId_java_lang_String_()
	 * @generated
	 */
	void setVpcId_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Map Public Ip On Launch java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Public Ip On Launch java lang Boolean </em>' attribute.
	 * @see #setMapPublicIpOnLaunch_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getPublicSubnetPropsBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getMapPublicIpOnLaunch_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.PublicSubnetPropsBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_ <em>Map Public Ip On Launch java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Public Ip On Launch java lang Boolean </em>' attribute.
	 * @see #getMapPublicIpOnLaunch_java_lang_Boolean_()
	 * @generated
	 */
	void setMapPublicIpOnLaunch_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.PublicSubnetProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getPublicSubnetPropsBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.PublicSubnetProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getPublicSubnetPropsBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.PublicSubnetPropsBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getPublicSubnetPropsBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.PublicSubnetPropsBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getPublicSubnetPropsBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.PublicSubnetPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // PublicSubnetPropsBuilder_ec2
